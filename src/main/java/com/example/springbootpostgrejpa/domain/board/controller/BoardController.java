package com.example.springbootpostgrejpa.domain.board.controller;

import com.example.springbootpostgrejpa.domain.board.model.requrest.ReqCreateBoard;
import com.example.springbootpostgrejpa.domain.board.service.BoardService;
import com.example.springbootpostgrejpa.global.common.GeneralResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "board", description = "게시판 관련 api")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    /**
     * 게시판 작성
     *
     * @param req : ReqCreateBoard
     * @return : GeneralResponse
     */
    @Operation(summary = "create board", description = "게시판 작성 api")
    @PostMapping("")
    public GeneralResponse<?> createBoard(@RequestBody ReqCreateBoard req) {
        log.info("request : {}", req);
        return boardService.createBoard(req);
    }

}
