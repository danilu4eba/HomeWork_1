package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    private View Next_button;
    private String name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Next_button = findViewById(R.id.next_button);
        Next_button.setOnClickListener((View view) -> {
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            String name1 = name;
            intent.putExtra("key1", name1);
            startActivity(intent);
        });
    }
}