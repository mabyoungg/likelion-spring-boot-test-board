package com.example.likelionspringbootboard;

import com.example.likelionspringbootboard.domain.question.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LikelionSpringBootBoardApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = String.format("내용:[%03d]", i);
            this.questionService.create(subject, content);
        }
    }

}
