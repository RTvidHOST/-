package com.example.cheatsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aarlInfo(View view){
        Intent intent = new Intent( MainActivity.this, AarlActivity.class);
        startActivity(intent);
    }
    public void aksiInfo(View view){
        Intent intent = new Intent( MainActivity.this, AksiActivity.class);
        startActivity(intent);
    }
    public void igniInfo(View view){
        Intent intent = new Intent( MainActivity.this, IgniActivity.class);
        startActivity(intent);
    }
    public void irdenInfo(View view){
        Intent intent = new Intent( MainActivity.this, IrdenActivity.class);
        startActivity(intent);
    }
    public void qwenInfo(View view){
        Intent intent = new Intent( MainActivity.this, QwenActivity.class);
        startActivity(intent);
    }
}
