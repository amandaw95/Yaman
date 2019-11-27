package com.example.kalpani.bustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thirdView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_view);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, fourthView.class);

        startActivity(intent);
    }
}
