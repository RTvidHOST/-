package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AksiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aksi);
    }
    public void back(View view){
        Intent intent = new Intent(AksiActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
