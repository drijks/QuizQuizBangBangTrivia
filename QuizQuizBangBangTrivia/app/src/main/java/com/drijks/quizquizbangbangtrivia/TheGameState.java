package com.drijks.quizquizbangbangtrivia;

import android.util.Log;

import com.drijks.quizquizbangbangtrivia.Model.Question;
import com.drijks.quizquizbangbangtrivia.QuestionData;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TheGameState {
    public Question q1;
    public int guesses;
    public String ans1, ans2, ans3, ans4;
    public String place1, place2, place3, place4, theQ;
    public boolean guessPhase;
    public ArrayList<Question> questions;
    public ArrayList<Question> qList;
    Random r = new Random();

    public TheGameState(ArrayList<Question> questions, int guesses) {
        this.questions = questions;
        this.guesses = guesses;
//        if (guesses == 0){
//            questions = new ArrayList<String>();
//            List<Question> newQList = newQuestionList();
//            q1 = newQList.get(0);
//            for (int i = 0; i < 10; i++){
//                questions.add(newQList.get(i).getName());
//            }
//        }
//        else {
//            q1 = getQuestion(questions, guesses);
//        }
        q1 = getQuestion(this.questions, this.guesses);
        placeAnswers(q1);

    }

    public List<Question> newQuestionList (){
        return QuestionData.pickTenRandom();
    }


    public Question getQuestion(ArrayList<Question> extraQuestions, int whichQ){
        return extraQuestions.get(whichQ);
    }

    public boolean guess(String ansName) {
        guessPhase = false;
        return (ansName == ans1);
    }

    public void placeAnswers(Question question){
        theQ = question.getTheQuestion();
        ans1 = question.getRealAnswer();
        ans2 = question.getFakeAnswer1();
        ans3 = question.getFakeAnswer2();
        ans4 = question.getFakeAnswer3();
        int whichAns = r.nextInt(4);
        int falseans1 = r.nextInt(3);
        int falseans2 = r.nextInt(2);
        if (whichAns == 0){
            place1 = ans1;
            if (falseans1 == 0){
                place2 = ans2;
                if (falseans2 == 0){
                    place3 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place3 = ans4;
                }
            }
            else if (falseans1 == 1) {
                place3 = ans2;
                if (falseans2 == 0){
                    place2 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place2 = ans4;
                }
            }
            else {
                place4 = ans2;
                if (falseans2 == 0){
                    place2 = ans3;
                    place3 = ans4;
                }
                else {
                    place3 = ans3;
                    place2 = ans4;
                }
            }

        }
        else if (whichAns == 1){
            place2 = ans1;
            if (falseans1 == 0){
                place1 = ans2;
                if (falseans2 == 0){
                    place3 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place3 = ans4;
                }
            }
            else if (falseans1 == 1) {
                place3 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place1 = ans4;
                }
            }
            else {
                place4 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place3 = ans4;
                }
                else {
                    place3 = ans3;
                    place1 = ans4;
                }
            }
        }
        else if (whichAns == 3) {
            place3 = ans1;
            if (falseans1 == 0){
                place1 = ans2;
                if (falseans2 == 0){
                    place2 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place2 = ans4;
                }
            }
            else if (falseans1 == 1) {
                place2 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place4 = ans4;
                }
                else {
                    place4 = ans3;
                    place1 = ans4;
                }
            }
            else {
                place4 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place2 = ans4;
                }
                else {
                    place2 = ans3;
                    place1 = ans4;
                }
            }
        }
        else {
            place4 = ans1;
            if (falseans1 == 0){
                place1 = ans2;
                if (falseans2 == 0){
                    place2 = ans3;
                    place3 = ans4;
                }
                else {
                    place3 = ans3;
                    place2 = ans4;
                }
            }
            else if (falseans1 == 1) {
                place2 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place3 = ans4;
                }
                else {
                    place3 = ans3;
                    place1 = ans4;
                }
            }
            else {
                place3 = ans2;
                if (falseans2 == 0){
                    place1 = ans3;
                    place2 = ans4;
                }
                else {
                    place2 = ans3;
                    place1 = ans4;
                }
            }
        }


        guessPhase = true;
    }

}
