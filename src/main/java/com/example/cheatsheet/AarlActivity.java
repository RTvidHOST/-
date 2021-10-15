package com.example.cheatsheet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AarlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aarl);
    }
    public void back(View view){
        Intent intent = new Intent(AarlActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
