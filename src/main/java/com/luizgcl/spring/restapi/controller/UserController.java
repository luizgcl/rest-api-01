package com.luizgcl.spring.restapi.controller;

import com.luizgcl.spring.restapi.model.User;
import com.luizgcl.spring.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getList() {
        return userService.getList();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/name")
    public User getUser(@RequestParam("name") String name) {
        return userService.getUserByName(name);
    }

    @PostMapping("/send")
    public User postUser(@RequestBody User user) {
        return userService.postUser(user);
    }

}
