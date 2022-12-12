package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/27/ 18:53
 **/

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String  username;
    private String address;
}
