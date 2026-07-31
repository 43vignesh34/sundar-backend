package com.example.sundar.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sundar.demo.entity.Question;
import com.example.sundar.demo.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    public Optional<Question> getQuestion(int id) {
        return questionRepository.findById(id);
    }

    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }
}