package com.example.parent.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parent.demo.entity.Question;
import com.example.parent.demo.repository.QuestionRepository;

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

    public Question postQuestion(Question text) {
        return questionRepository.save(text);
    }

    public void deleteQuestion(int id) {
        questionRepository.deleteById(id);
    }

    public Question putQuestion(int id, String text) {
        return questionRepository.save(new Question(id, text));
    }
}