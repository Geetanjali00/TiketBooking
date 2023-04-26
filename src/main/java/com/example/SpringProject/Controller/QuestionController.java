package com.example.SpringProject.Controller;

import com.example.SpringProject.Entity.Question;
import com.example.SpringProject.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping(path = "/getquestion")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }


    @PostMapping(path="/questionsave")
    public ResponseEntity<Question> saveQuestion(@RequestBody Question question) {
        Question savedQuestion = questionService.saveQuestion(question);
        return ResponseEntity.ok(savedQuestion);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestionById(@PathVariable Long id) {
        questionService.deleteQuestionById(id);
        return ResponseEntity.noContent().build();
    }
}
