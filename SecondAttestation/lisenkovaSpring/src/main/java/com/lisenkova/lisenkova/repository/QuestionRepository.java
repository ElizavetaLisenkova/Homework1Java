package com.lisenkova.lisenkova.repository;

import com.lisenkova.lisenkova.model.Answer;
import com.lisenkova.lisenkova.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Answer> findByQuestionId(Long questionId);
}
