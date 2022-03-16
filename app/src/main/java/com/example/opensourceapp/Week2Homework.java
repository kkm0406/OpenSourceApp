package com.example.opensourceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Week2Homework extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2_homework);

        EditText editText =  findViewById(R.id.editText);
        Button textBtn = findViewById(R.id.textBtn);
        Button urlBtn = findViewById(R.id.urlBtn);
        RadioButton btn1 = findViewById(R.id.btn1);
        RadioButton btn2 = findViewById(R.id.btn2);
        ImageView img = findViewById(R.id.img);

        textBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_LONG).show();
            }
        });

        urlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(editText.getText())));
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.mid);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageResource(R.drawable.ad);
            }
        });
    }
}