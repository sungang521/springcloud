package com.sungang.day1;

import com.sungang.day1.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    public Application( RedisTemplate<String, Object> redisTemplate) {
        //测试value
        User user = new User();
        user.setAge(1);
        user.setName("sungang");
       // redisTemplate.opsForValue().set("sungang",user);

        redisTemplate.opsForHash().put("sungangmap","1",user);

    }
}
