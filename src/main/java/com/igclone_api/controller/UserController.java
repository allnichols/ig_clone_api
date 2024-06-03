package com.igclone_api.controller;

import com.igclone_api.entity.User;
import com.igclone_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }


}
