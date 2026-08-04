package com.example.sundar.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sundar.demo.entity.Question;
import com.example.sundar.demo.service.QuestionService;

@CrossOrigin("http://localhost:5173")
@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/question/{id}")
    public Optional<Question> question(@PathVariable int id) {
        return questionService.getQuestion(id);
    }

    @GetMapping("/questions")
    public List<Question> questions() {
        return questionService.getQuestions();
    }

    @PostMapping("/question")
    public Question question(@RequestBody Question question) {
        return questionService.postQuestion(question);
    }

    @DeleteMapping("/question/{id}")
    public void deleteQuestion(@PathVariable int id) {
        questionService.deleteQuestion(id);
    }

    @PutMapping("/question/{id}")
    public Question putQuestion(@PathVariable int id, @RequestBody Question question) {
        return questionService.putQuestion(id, question.getText());
    }
}