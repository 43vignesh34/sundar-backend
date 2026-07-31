package com.example.sundar.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sundar.demo.entity.Question;
import com.example.sundar.demo.service.QuestionService;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/question/{id}")
    public Optional<Question> question(@PathVariable int id) {
        return questionService.getQuestion(id);
    }

    @GetMapping("/questions/")
    public List<Question> questions() {
        return questionService.getQuestions();
    }
}