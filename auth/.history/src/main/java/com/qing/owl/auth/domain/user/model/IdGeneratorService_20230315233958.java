package com.qing.owl.auth.domain.user.model;

import java.time.Instant;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.qing.owl.auth.infra.cache.RedisRepository;

import jakarta.annotation.Resource;

@Component
public class IdGeneratorService {

    private final static String USER_CODE_PREFIX = "UC";
    private final static String USER_CODE_ATOMIC_KEY = "USER_CODE_ATOMIC_KEY";

    @Resource
    private RedisRepository redisRepository;

    public String generate() {
        redisRepository.getAndIncrement(USER_CODE_ATOMIC_KEY, 0, null);
        return USER_CODE_PREFIX + Instant.now() + redisRepository.get("USER_CODE_ATOMIC_KEY");
    }
}
