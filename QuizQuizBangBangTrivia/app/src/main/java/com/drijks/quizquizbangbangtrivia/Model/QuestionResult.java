package com.drijks.quizquizbangbangtrivia.Model;

import android.content.Context;
import android.content.res.Resources;

public class QuestionResult {
    private String name;
    private String theQuestion;
    private String realAnswer;
    private String fakeAnswer1;
    private String fakeAnswer2;
    private String fakeAnswer3;
    private String funFact;
    private String category;
    private boolean correct;

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTheQuestion(String theQuestion) {
        this.theQuestion = theQuestion;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setFakeAnswer1(String fakeAnswer1) {
        this.fakeAnswer1 = fakeAnswer1;
    }

    public String getFakeAnswer1() {
        return fakeAnswer1;
    }

    public void setFakeAnswer2(String fakeAnswer2) {
        this.fakeAnswer2 = fakeAnswer2;
    }

    public String getFakeAnswer2() {
        return fakeAnswer2;
    }

    public void setFakeAnswer3(String fakeAnswer3) { this.fakeAnswer3 = fakeAnswer3; }

    public String getFakeAnswer3() { return fakeAnswer3; }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setCategory(String category) { this.category = category; }

    public String getCategory() { return category; }

    public int getImg(Context context){
        Resources resources = context.getResources();
        final int resourceId = resources.getIdentifier(category, "drawable",context.getPackageName());
        return resourceId;
    }
}