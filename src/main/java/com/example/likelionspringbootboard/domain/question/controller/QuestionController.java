package com.example.likelionspringbootboard.domain.question.controller;

import com.example.likelionspringbootboard.domain.question.entity.Question;
import com.example.likelionspringbootboard.domain.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String getList(Model model){
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);

        return "question_list";
    }
}
