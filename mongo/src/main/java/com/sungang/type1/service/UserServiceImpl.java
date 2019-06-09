package com.sungang.type1.service;

import com.sungang.type1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }
}
