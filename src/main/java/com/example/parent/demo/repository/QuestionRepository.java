package com.example.parent.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parent.demo.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> 
{
}
