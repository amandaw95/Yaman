package com.example.kalpani.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourthView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_view);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, fifthView.class);

        startActivity(intent);
    }
}
