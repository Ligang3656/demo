package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/27/ 19:27
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
