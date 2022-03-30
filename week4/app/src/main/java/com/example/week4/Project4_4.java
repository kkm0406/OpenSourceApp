package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class Project4_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project44);

        Switch check = findViewById(R.id.check);
        TextView Text2 = findViewById(R.id.Text2);
        RadioGroup Rgroup1 = findViewById(R.id.Rgroup1);
        RadioButton ver1 = findViewById(R.id.ver1);
        RadioButton ver2 = findViewById(R.id.ver2);
        RadioButton ver3 = findViewById(R.id.ver3);
        ImageView verImg = findViewById(R.id.verImg);


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check.isChecked()){
                    Text2.setVisibility(View.VISIBLE);
                    Rgroup1.setVisibility(View.VISIBLE);
                    ver1.setVisibility(View.VISIBLE);
                    ver2.setVisibility(View.VISIBLE);
                    ver3.setVisibility(View.VISIBLE);
                    verImg.setVisibility(View.VISIBLE);

                    ver1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver1.isChecked()){
                                verImg.setImageResource(R.drawable.ver1);
                            }
                        }
                    });
                    ver2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver2.isChecked()){
                                verImg.setImageResource(R.drawable.ver2);
                            }
                        }
                    });
                    ver3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(ver3.isChecked()){
                                verImg.setImageResource(R.drawable.ver3);
                            }
                        }
                    });

                }
            }
        });

        Button end = findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.runFinalization();
                System.exit(0);
            }
        });

        Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(Project4_4.this, Project4_4.class));

            }
        });

        Button next= findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Project4_4.this, mission.class);
                startActivity(intent);
            }
        });

    }
}