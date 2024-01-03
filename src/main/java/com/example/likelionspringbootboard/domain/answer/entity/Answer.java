package com.example.likelionspringbootboard.domain.answer.entity;

import com.example.likelionspringbootboard.domain.question.entity.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createTime;

    @ManyToOne
    private Question question;
}
