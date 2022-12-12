package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description
 * @author: ligang
 * @date: 2022/11/27/ 19:01
 **/

@Service
public class UserService {
    private static Map<Integer, User> users= new HashMap<>();

    static {
        users.put(1,new User(1,"zhangsan","北京"));
        users.put(2,new User(2,"lisi","天津"));
        users.put(3,new User(3,"wangwu","黑龙江"));
        users.put(4,new User(4,"xushu","深圳"));
    }
//    根据id查询用户
    public User getUserById(Integer id){
        return users.get(id);
    }

//    查询所有用户
    public List<User> getAllUser(){
        return new ArrayList<>(users.values());
    }
//    更新
    public void update(User user){
        users.replace(user.getId(),user);
    }
//    删除
    public void delete(Integer id){
        users.keySet().removeIf(key-> key==id);
    }
//    添加
    public void add(User user){
        Integer newId=users.size()+1;
        user.setId(newId);
        users.put(newId,user);
    }
}
