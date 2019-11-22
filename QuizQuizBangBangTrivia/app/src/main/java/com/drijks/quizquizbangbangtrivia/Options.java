package com.drijks.quizquizbangbangtrivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
    public void onBackPress(View v) {
        Intent qIntent = new Intent(this, MainActivity.class);
        startActivity(qIntent);
    }
}
