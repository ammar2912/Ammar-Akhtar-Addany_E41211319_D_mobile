package com.example.layout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {
    EditText to, subject, message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);

        to = findViewById(R.id.to);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
    }
}