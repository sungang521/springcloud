package com.sungang.day3.operate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostMapping("/testMap")
    public String test() {
        redisTemplate.opsForValue().set("key1", "value1");
        stringRedisTemplate.opsForValue().set("int", "1");
        stringRedisTemplate.opsForValue().increment("int", 1);
        Jedis jedis = (Jedis) stringRedisTemplate.getConnectionFactory().getConnection().getNativeConnection();
        jedis.decr("int");
        Map<String, String> hash = new HashMap<>();
        hash.put("filed1", "1");
        hash.put("filed2", "2");
        stringRedisTemplate.opsForHash().putAll("hash", hash);
        BoundHashOperations hashOperations = stringRedisTemplate.boundHashOps("hash");
        hashOperations.put("filed3", "2");
        return "success";
    }
}
