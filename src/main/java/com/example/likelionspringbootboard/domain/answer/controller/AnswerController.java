package com.example.likelionspringbootboard.domain.answer.controller;

import com.example.likelionspringbootboard.domain.answer.repository.AnswerRepository;
import com.example.likelionspringbootboard.domain.answer.service.AnswerService;
import com.example.likelionspringbootboard.domain.question.entity.Question;
import com.example.likelionspringbootboard.domain.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value = "content") String content) {
        Question question = this.questionService.getQuestion(id);
        this.answerService.create(question, content);
        return String.format("redirect:/question/detail/%s", id);
    }
}
