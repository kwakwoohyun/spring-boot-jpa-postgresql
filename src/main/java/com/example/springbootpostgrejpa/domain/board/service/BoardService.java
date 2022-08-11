package com.example.springbootpostgrejpa.domain.board.service;

import com.example.springbootpostgrejpa.domain.board.domain.BoardEntity;
import com.example.springbootpostgrejpa.domain.board.model.requrest.ReqCreateBoard;
import com.example.springbootpostgrejpa.domain.board.repository.BoardRepository;
import com.example.springbootpostgrejpa.global.common.GeneralResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public GeneralResponse<?> createBoard(ReqCreateBoard req) {
        BoardEntity entity = BoardEntity.builder()
                .title(req.getTitle())
                .description(req.getDescription())
                .published(false)
                .build();
        boardRepository.save(entity);
        return GeneralResponse.builder()
                .status(true)
                .message("create success")
                .data(entity)
                .build();
    }
}
