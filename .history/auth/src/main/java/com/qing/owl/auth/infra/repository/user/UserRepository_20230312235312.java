package com.qing.owl.auth.infra.repository.user;

import org.springframework.data.repository.Repository;

import com.qing.owl.auth.infra.repository.user.persistence.User;

public interface UserRepository extends Repository<User, Long> {

}
