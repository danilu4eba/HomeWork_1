package com.example.homework_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private View Next_button;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Next_button = findViewById(R.id.next_button);
        Next_button.setOnClickListener((View view) -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            String name1 = name;
            intent.putExtra("key1", name1);
            startActivity(intent);
        });


    }
}