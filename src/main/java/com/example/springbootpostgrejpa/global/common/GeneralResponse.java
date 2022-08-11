package com.example.springbootpostgrejpa.global.common;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class GeneralResponse <T> {

    private boolean status;
    private String message;
    private T data;

}
