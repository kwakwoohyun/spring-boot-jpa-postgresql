package com.example.springbootpostgrejpa.domain.board.model.requrest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReqCreateBoard {

    private String title;
    private String description;

}

