package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QwenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qwen);
    }
    public void back(View view){
        Intent intent = new Intent(QwenActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
