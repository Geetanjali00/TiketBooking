package com.example.SpringProject.Service;

import com.example.SpringProject.Entity.Question;
import com.example.SpringProject.Repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> getAllQuestions() {
        return  questionRepo.findAll();
    }

//    public Question getQuestionById(Long id) {
//        return questionRepo.findById(id).orElse(null);
//    }

    public Question saveQuestion(Question question) {
        return questionRepo.save(question);
    }

    public void deleteQuestionById(Long id) {
        questionRepo.deleteById(id);
    }
}
