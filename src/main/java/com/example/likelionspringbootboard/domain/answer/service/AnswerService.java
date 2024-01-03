package com.example.likelionspringbootboard.domain.answer.service;

import com.example.likelionspringbootboard.domain.answer.entity.Answer;
import com.example.likelionspringbootboard.domain.answer.repository.AnswerRepository;
import com.example.likelionspringbootboard.domain.question.entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateTime(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }
}
