package com.qing.owl.auth.domain.user.model;

import com.qing.owl.auth.domain.user.service.PasswordEncoderService;

public class UserFactory {
    PasswordEncoderService passwordEncoderService;

    public User create(String userName, String sex, Password password) {
        return new User(userName, sex, passwordEncoderService(Password));
    }
}