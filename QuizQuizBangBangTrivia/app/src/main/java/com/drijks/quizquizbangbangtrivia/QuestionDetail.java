package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuestionDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_detail);

        int category = (int) getIntent().getExtras().get("category");

        String name = getIntent().getExtras().get("name").toString();

        String funfact = getIntent().getExtras().get("funfact").toString();

        TextView nametxt = findViewById(R.id.name);

        TextView funfacttxt = findViewById(R.id.funfact);

        ImageView categoryimg = findViewById(R.id.questionimg);

        categoryimg.setImageResource(category);

        nametxt.setText(name);

        funfacttxt.setText("Fun fact: " + funfact);


    }
    public void onBackPress(View view){
        finish();

    }
}
