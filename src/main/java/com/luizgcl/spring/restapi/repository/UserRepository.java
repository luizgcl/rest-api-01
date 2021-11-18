package com.luizgcl.spring.restapi.repository;

import com.luizgcl.spring.restapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByName(String name);

}
