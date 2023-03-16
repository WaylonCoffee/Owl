package com.qing.owl.auth.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qing.owl.auth.infra.repository.user.persistence.UserDo;

@Repository
public interface UserRepository extends JpaRepository<UserDo, Long> {
}
