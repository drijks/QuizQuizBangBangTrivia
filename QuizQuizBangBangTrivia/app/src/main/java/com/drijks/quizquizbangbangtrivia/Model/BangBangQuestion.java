package com.drijks.quizquizbangbangtrivia.Model;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

public class BangBangQuestion {

    private String name;
    private String theQuestion;
    private ArrayList<String> theAnswers;
    private ArrayList<String> fakeAnswers;
    private String category;
    private String funFact;

//TODO: Make answers an Arraylist

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public void setTheAnswers(ArrayList<String> theAnswers) { this.theAnswers = theAnswers; }

    public ArrayList<String> getTheAnswers() { return theAnswers; }

    public void setFakeAnswers(ArrayList<String> fakeAnswers) { this.fakeAnswers = fakeAnswers; }

    public ArrayList<String> getFakeAnswers() { return fakeAnswers; }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

}
