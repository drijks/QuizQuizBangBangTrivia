package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import com.drijks.quizquizbangbangtrivia.Model.Question;
import com.drijks.quizquizbangbangtrivia.Model.QuestionResult;

public class Results extends AppCompatActivity {
    int score;
    int guesses;
    int missed;
    ArrayList<QuestionResult> wrongCats;
    ArrayList<QuestionResult> rightCats;
    ArrayList<QuestionResult> thecats;
    ArrayList<String> wcs;
    ArrayList<String> rcs;
    ArrayList<Question> allCats = QuestionData.data2;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        score = (int) getIntent().getExtras().get("score");
        guesses = (int) getIntent().getExtras().get("guesses");
        missed = guesses - score;
        wcs = getIntent().getStringArrayListExtra("wronganswers");
        rcs = getIntent().getStringArrayListExtra("rightanswers");
        thecats = getTheCats(wcs,rcs);
        TextView yourScore = findViewById(R.id.your_score);
        TextView catsYouMissed = findViewById(R.id.questions_missed);
        yourScore.setText("your score: "+score+"/"+guesses);
        catsYouMissed.setText("you missed: "+ missed + " questions");


        ListView listView = findViewById(R.id.missed_list);

        customAdapter = new CustomAdapter(Results.this, R.layout.activity_results_item, thecats);

        listView.setAdapter(customAdapter);

    }
    public ArrayList<QuestionResult> getTheCats(ArrayList<String> wcs, ArrayList<String> rcs) {
        ArrayList<QuestionResult> rightCats = new ArrayList<>();
        for (int i = 0; i < wcs.size(); i++){
            for (int j = 0; j < allCats.size(); j++){
                if (wcs.get(i).equals(allCats.get(j).getName())){
                    QuestionResult animal1 = new QuestionResult();
                    animal1.setCorrect(false);
                    animal1.setName(allCats.get(j).getName());
                    animal1.setFunFact(allCats.get(j).getFunFact());
                    animal1.setTheQuestion(allCats.get(j).getTheQuestion());
                    animal1.setCategory(allCats.get(j).getCategory());
                    animal1.setRealAnswer(allCats.get(j).getRealAnswer());
                    rightCats.add(animal1);
                }
            }
        }
        for (int i = 0; i < rcs.size(); i++){
            for (int j = 0; j < allCats.size(); j++){
                if (rcs.get(i).equals(allCats.get(j).getName())){
                    QuestionResult animal1 = new QuestionResult();
                    animal1.setCorrect(true);
                    animal1.setName(allCats.get(j).getName());
                    animal1.setFunFact(allCats.get(j).getFunFact());
                    animal1.setTheQuestion(allCats.get(j).getTheQuestion());
                    animal1.setCategory(allCats.get(j).getCategory());
                    animal1.setRealAnswer(allCats.get(j).getRealAnswer());

                    rightCats.add(animal1);
                }
            }
        }
        return rightCats;
    }

    public void onQuitPress(View v) {
        Intent qIntent = new Intent(this, MainActivity.class);
        startActivity(qIntent);

    }
}