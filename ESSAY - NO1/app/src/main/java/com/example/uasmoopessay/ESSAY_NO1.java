package com.example.uasmoopessay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ESSAY_NO1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.essay_no1);

        Context context = getApplicationContext();
        CharSequence text = "Hello World!";
        int duration = Toast.LENGTH_SHORT;
        Button button = findViewById(R.id.HelloButton);
        Toast toast = Toast.makeText(context, text, duration);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast.show();
            }
        });
    }
}