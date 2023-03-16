package com.qing.owl.auth.domain.user.model;

import com.qing.owl.auth.domain.user.service.PasswordEncoderService;

import jakarta.annotation.Resource;

public class UserFactory {

    @Resource
    IdGeneratorService idGeneratorService;

    @Resource
    PasswordEncoderService passwordEncoderService;

    public User create(String name, String password, String sex) {

        return new User(idGeneratorService.generate(), passwordEncoderService.encrypt(new Password(password)), sex);
    }
}
