package com.example.SpringProject.Entity;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String question;

        @Column(nullable = false)
        private String answer;

        public Question() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getQuestion() {
                return question;
        }

        public void setQuestion(String question) {
                this.question = question;
        }

        public String getAnswer() {
                return answer;
        }

        public void setAnswer(String answer) {
                this.answer = answer;
        }
}
