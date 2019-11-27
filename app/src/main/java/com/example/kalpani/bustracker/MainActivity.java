package com.example.kalpani.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //public static final String EXTRA_MESSAGE = "com.example.kalpani.bustracker.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondView.class);

        startActivity(intent);
    }

    public void sendMessage1(View view) {
        Intent intent = new Intent(this, AlreadyUserView.class);

        startActivity(intent);
    }
}
