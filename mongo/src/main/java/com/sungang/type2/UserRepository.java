package com.sungang.type2;

import com.sungang.type1.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    @Override
    List<User> findAll();
}
