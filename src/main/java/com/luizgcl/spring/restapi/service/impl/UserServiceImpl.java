package com.luizgcl.spring.restapi.service.impl;

import com.luizgcl.spring.restapi.model.User;
import com.luizgcl.spring.restapi.repository.UserRepository;
import com.luizgcl.spring.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getList() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public User getUserByName(String name) {
        return this.userRepository.findByName(name);
    }

    @Override
    public User postUser(User user) {
        return this.userRepository.save(user);
    }

}
