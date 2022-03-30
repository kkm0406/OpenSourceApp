package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Project4_1 extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Edit1 = findViewById(R.id.Edit1);
        EditText Edit2 = findViewById(R.id.Edit2);
        Button BtnAdd = findViewById(R.id.BtnAdd);
        Button BtnSub = findViewById(R.id.BtnSub);
        Button BtnMul = findViewById(R.id.BtnMul);
        Button BtnDiv = findViewById(R.id.BtnDiv);
        TextView TextResult = findViewById(R.id.TextResult);

        BtnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(Edit1.getText().toString());
                int num2 = Integer.parseInt(Edit2.getText().toString());
                TextResult.setText(num1+num2);
                return false;
            }
        });

        BtnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(Edit1.getText().toString());
                int num2 = Integer.parseInt(Edit2.getText().toString());
                TextResult.setText(num1-num2);
                return false;
            }
        });

        BtnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(Edit1.getText().toString());
                int num2 = Integer.parseInt(Edit2.getText().toString());
                TextResult.setText(num1*num2);
                return false;
            }
        });

        BtnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int num1 = Integer.parseInt(Edit1.getText().toString());
                int num2 = Integer.parseInt(Edit2.getText().toString());
                TextResult.setText(num1/num2);
                return false;
            }
        });
    }
}