package com.ewa.servlet.model;

import java.io.Serializable;

/**
 * Answer
 */
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String text;
    private boolean correct;

    public Answer() {
        this(null, null, false);
    }

    public Answer(Integer id, String text, boolean correct) {
        setId(id);
        setText(text);
        setCorrect(correct);
    }

    public int getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public final void setText(String text) {
        this.text = text;
    }

    public boolean getCorrect() {
        return correct;
    }

    public final void setCorrect(boolean correct) {
        this.correct = correct;
    }
}