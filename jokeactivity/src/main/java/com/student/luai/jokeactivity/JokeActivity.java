package com.student.luai.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView mTextViewJokeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mTextViewJokeDetails = (TextView) findViewById(R.id.tv_joke_details);

        mTextViewJokeDetails.setText(getIntent().getStringExtra("the_very_funny_joke"));

    }
}
