package com.example.demo.controller;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/27/ 19:00
 **/

@RestController
@RequestMapping ("/user")
public class UserController {

    @Autowired
    UserService userService;

    //    查询
    @GetMapping ("/{id}")
    public Result getUser(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        return new Result<>(200, "查询成功", user);
    }

    //  新增
    @PostMapping ("/add")
    public Result addUser(User user) {
        userService.add(user);
        return new Result<>(200, "插入成功");
    }

    //    修改
    @PutMapping ("/update{id}")
    public Result update(User user) {
        userService.update(user);
        return new Result<>(200, "修改成功");
    }
//    删除
    @DeleteMapping("/delete{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return new Result(200,"删除成功");
    }

}
