package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.drijks.quizquizbangbangtrivia.Model.Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class TheGame extends AppCompatActivity {

    public String categoryImage;
    public int score, guesses;
    public ArrayList<Question> questionList;
    public ArrayList<String> rightAnswers;
    public ArrayList<String> wrongAnswers;
    public TheGameState state;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);
        questionList = getIntent().getParcelableArrayListExtra("questions");
        score = (int) getIntent().getExtras().get("score");
        guesses = (int) getIntent().getExtras().get("guesses");
        rightAnswers = getIntent().getStringArrayListExtra("rightanswers");
        wrongAnswers = getIntent().getStringArrayListExtra("wronganswers");


        state = new TheGameState(questionList, guesses);

        ImageView categoryImage = findViewById(R.id.category_image);
        TextView qPrompt = findViewById(R.id.question_text);
        TextView scoreCount = findViewById(R.id.current_score);
        Button answerA = findViewById(R.id.answer_button_1);
        Button answerB = findViewById(R.id.answer_button_2);
        Button answerC = findViewById(R.id.answer_button_3);
        Button answerD = findViewById(R.id.answer_button_4);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        nexter.setVisibility(View.INVISIBLE);

        categoryImage.setImageResource(state.q1.getImg(this));

        qPrompt.setText(state.theQ);
        answerA.setText(state.place1);
        answerB.setText(state.place2);
        answerC.setText(state.place3);
        answerD.setText(state.place4);
    }

    public void onQuitPress(View v) {
        Intent qIntent = new Intent(this, MainActivity.class);
        startActivity(qIntent);
    }

    public void onNextPress(View v) {
        if (!state.guessPhase && guesses < 10) {
            Intent rIntent = getIntent();
            rIntent.putExtra("score", score);
            rIntent.putExtra("guesses", guesses);
            rIntent.putParcelableArrayListExtra("questionlist", questionList);
            rIntent.putStringArrayListExtra("rightanswers", rightAnswers);
            rIntent.putStringArrayListExtra("wronganswers", wrongAnswers);
            finish();
            startActivity(rIntent);
        }
        if (!state.guessPhase && guesses >= 10) {
            Intent rIntent = new Intent(this, Results.class);
            rIntent.putExtra("score", score);
            rIntent.putExtra("guesses", guesses);
            rIntent.putParcelableArrayListExtra("questionlist", questionList);
            rIntent.putStringArrayListExtra("rightanswers", rightAnswers);
            rIntent.putStringArrayListExtra("wronganswers", wrongAnswers);
            rIntent.putExtra("gametype", "theGame");
            finish();
            startActivity(rIntent);
        }
    }


    public void onChoiceAPress(View v) {

        Button choiceA = findViewById(R.id.answer_button_1);
        Button choiceB = findViewById(R.id.answer_button_2);
        Button choiceC = findViewById(R.id.answer_button_3);
        Button choiceD = findViewById(R.id.answer_button_4);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.question_text);
        TextView scoreCount = findViewById(R.id.current_score);
        guesses ++;
        if (state.guess(state.place1)) {
            score++;
            rightAnswers.add(state.q1.getName());
            scoreCount.setTextColor(Color.GREEN);
            res.setText(R.string.correct_text);
        }
        else {
            wrongAnswers.add(state.q1.getName());
            res.setText(R.string.nope_text);
            scoreCount.setTextColor(Color.RED);
        }

        scoreCount.setText(String.format("Correct answers: %d out of %d.", score, guesses));
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        choiceA.setEnabled(false);
        choiceB.setEnabled(false);
        choiceC.setEnabled(false);
        choiceD.setEnabled(false);

    }


    public void onChoiceBPress(View v) {

        Button choiceA = findViewById(R.id.answer_button_1);
        Button choiceB = findViewById(R.id.answer_button_2);
        Button choiceC = findViewById(R.id.answer_button_3);
        Button choiceD = findViewById(R.id.answer_button_4);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.question_text);
        TextView scoreCount = findViewById(R.id.current_score);
        guesses ++;
        if (state.guess(state.place2)) {
            score++;
            rightAnswers.add(state.q1.getName());
            scoreCount.setTextColor(Color.GREEN);
            res.setText(R.string.correct_text);
        }
        else {
            wrongAnswers.add(state.q1.getName());
            res.setText(R.string.nope_text);
            scoreCount.setTextColor(Color.RED);
        }

        scoreCount.setText(String.format("Correct answers: %d out of %d.", score, guesses));
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        choiceA.setEnabled(false);
        choiceB.setEnabled(false);
        choiceC.setEnabled(false);
        choiceD.setEnabled(false);

    }


    public void onChoiceCPress(View v) {

        Button choiceA = findViewById(R.id.answer_button_1);
        Button choiceB = findViewById(R.id.answer_button_2);
        Button choiceC = findViewById(R.id.answer_button_3);
        Button choiceD = findViewById(R.id.answer_button_4);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.question_text);
        TextView scoreCount = findViewById(R.id.current_score);
        guesses ++;
        if (state.guess(state.place3)) {
            score++;
            rightAnswers.add(state.q1.getName());
            scoreCount.setTextColor(Color.GREEN);
            res.setText(R.string.correct_text);
        }
        else {
            wrongAnswers.add(state.q1.getName());
            res.setText(R.string.nope_text);
            scoreCount.setTextColor(Color.RED);
        }

        scoreCount.setText(String.format("Correct answers: %d out of %d.", score, guesses));
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        choiceA.setEnabled(false);
        choiceB.setEnabled(false);
        choiceC.setEnabled(false);
        choiceD.setEnabled(false);

    }


    public void onChoiceDPress(View v) {

        Button choiceA = findViewById(R.id.answer_button_1);
        Button choiceB = findViewById(R.id.answer_button_2);
        Button choiceC = findViewById(R.id.answer_button_3);
        Button choiceD = findViewById(R.id.answer_button_4);
        Button quitter = findViewById(R.id.quit_button);
        Button nexter = findViewById(R.id.next_button);
        TextView res = findViewById(R.id.question_text);
        TextView scoreCount = findViewById(R.id.current_score);
        guesses ++;
        if (state.guess(state.place4)) {
            score++;
            rightAnswers.add(state.q1.getName());
            scoreCount.setTextColor(Color.GREEN);
            res.setText(R.string.correct_text);
        }
        else {
            wrongAnswers.add(state.q1.getName());
            res.setText(R.string.nope_text);
            scoreCount.setTextColor(Color.RED);
        }

        scoreCount.setText(String.format("Correct answers: %d out of %d.", score, guesses));
        quitter.setVisibility(View.VISIBLE);
        quitter.setActivated(true);
        nexter.setVisibility(View.VISIBLE);
        nexter.setEnabled(true);
        choiceA.setEnabled(false);
        choiceB.setEnabled(false);
        choiceC.setEnabled(false);
        choiceD.setEnabled(false);

    }


    public int getCategoryImg(Context context) {
        Resources resources = context.getResources();
        final int resourceId = resources.getIdentifier(categoryImage, "drawable", context.getPackageName());
        return resourceId;
    }
}



