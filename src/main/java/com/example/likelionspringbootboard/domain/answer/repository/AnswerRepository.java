package com.example.likelionspringbootboard.domain.answer.repository;

import com.example.likelionspringbootboard.domain.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
