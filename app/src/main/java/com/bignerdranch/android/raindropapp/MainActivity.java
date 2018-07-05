package com.bignerdranch.android.raindropapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AnimationHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Canvas canvas = findViewById(R.id.canvasView);
        helper = new AnimationHelper(canvas, 50);
    }

    public void startRain(View view) {
        helper.start();
    }

    public void stopRain(View view) {
        helper.stop();
    }
}
