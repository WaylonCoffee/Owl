package com.qing.owl.auth.infra.cache;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;

@Repository
public class RedisRepository {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void saveForExpireAt(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

}