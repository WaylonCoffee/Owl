package com.qing.owl.auth.domain.user.service;

import org.springframework.util.DigestUtils;

import com.qing.owl.auth.domain.user.Password;

public class PasswordEncoderService {

    public Password encrypt(Password password) {

        DigestUtils.md5Digest((password.getPassword() + password.getSalt()).getBytes());
    }
}