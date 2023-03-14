package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private View textview;
    private View Next_button;
    private String name;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView textview = findViewById(R.id.tv_name);
        textview.setText(getIntent().getStringExtra("key1"));
        Next_button = findViewById(R.id.next_button);
        Next_button.setOnClickListener((View view) -> {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            String name1 = name;
            intent.putExtra("key1", name1);
            startActivity(intent);
        });

    }
}