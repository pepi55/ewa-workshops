package com.ewa.servlet.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Questionnaire
 */
public class Questionnaire implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private List<Question> questions;

    public Questionnaire() {
        this(null, null);
    }

    public Questionnaire(Integer id, String name) {
        setId(id);
        setName(name);

        questions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}