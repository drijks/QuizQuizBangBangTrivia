package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.content.Intent;
import android.widget.Button;


import com.drijks.quizquizbangbangtrivia.Model.Question;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start_the_game(View view) {
        questions = new ArrayList<Question>();
        List<Question> qs = QuestionData.pickTenRandom();
        for (int i = 0; i < 10; i++){
            questions.add(qs.get(i));
        }

        Intent intent = new Intent(this,TheGame.class);
        intent.putExtra("score",0);
        intent.putExtra("guesses", 0);
        intent.putParcelableArrayListExtra("questions", questions);
        intent.putStringArrayListExtra("rightanswers", new ArrayList<String>());
        intent.putStringArrayListExtra("wronganswers", new ArrayList<String>());

        startActivity(intent);
    }

    public void start_category_game(View view) {
        Intent intent = new Intent(this, CategorySelect.class);
        startActivity(intent);
    }

    public void open_player_stats(View view) {
        Intent intent = new Intent(this, PlayerStats.class);
        startActivity(intent);
    }

    public void open_options(View view) {
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
    }

    public void open_about(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

}
