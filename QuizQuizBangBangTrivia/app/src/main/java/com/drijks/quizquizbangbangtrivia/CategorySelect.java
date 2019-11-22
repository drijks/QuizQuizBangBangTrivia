package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.drijks.quizquizbangbangtrivia.Model.Question;

import java.util.ArrayList;
import java.util.List;

public class CategorySelect extends AppCompatActivity {

    public ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_select);
    }

    //TODO: simplify by using one method for all buttons and using button name to define the category
    public void start_category_1 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("the_arts");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_2 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("games_hobbies");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_3 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("math_and_science");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_4 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("media");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_5 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("society_culture");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_6 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("social_sciences");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_7 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("sports");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }

    public void start_category_8 (View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickFromCategory("technology");
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }
        Intent intent = new Intent(this, CategoryGame.class);
        intent.putExtra("score", 0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());
        startActivity(intent);
    }


}
