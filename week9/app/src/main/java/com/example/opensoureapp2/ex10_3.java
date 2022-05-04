package com.example.opensoureapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class ex10_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex103);
        setTitle("메인 액티비티");

        final RadioButton rdoSecond = findViewById(R.id.rdoSecond);

        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);
        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                if (rdoSecond.isChecked())
                    intent = new Intent(getApplicationContext(), ex10_3_2.class);
                else
                    intent = new Intent(getApplicationContext(), ex10_3_3.class);

                startActivity(intent);
            }
        });
    }
}