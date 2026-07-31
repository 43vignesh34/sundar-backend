package com.example.sundar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sundar.demo.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
