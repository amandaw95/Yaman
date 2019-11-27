package com.example.kalpani.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, thirdView.class);

        startActivity(intent);
    }
}
