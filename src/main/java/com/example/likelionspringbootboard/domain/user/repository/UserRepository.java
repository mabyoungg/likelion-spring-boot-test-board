package com.example.likelionspringbootboard.domain.user.repository;

import com.example.likelionspringbootboard.domain.user.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
