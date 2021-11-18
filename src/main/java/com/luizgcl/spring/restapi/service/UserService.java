package com.luizgcl.spring.restapi.service;

import com.luizgcl.spring.restapi.model.User;

import java.util.List;

public interface UserService {

    List<User> getList();

    User getUser(Long id);

    User getUserByName(String name);

    User postUser(User user);

}
