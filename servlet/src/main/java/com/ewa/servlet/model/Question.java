package com.ewa.servlet.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Question
 */
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private String question;
    private List<Answer> answers;

    public Question() {
        this(null, null, null);
    }

    public Question(Integer id, String title, String question) {
        setId(id);
        setTitle(title);
        setQuestion(question);

        answers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public final void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public final void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}