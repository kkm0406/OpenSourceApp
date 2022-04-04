package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class project5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(3, 230, 53));
        setContentView(baseLayout, params);

        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.RED);
        baseLayout.addView(btn);

        TextView txt = new TextView(this);
        txt.setText("2018038038 김광모");
        txt.setTextColor(Color.BLACK);
        txt.setTextSize(30);
        baseLayout.addView(txt);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "코드로 생성한 버튼", Toast.LENGTH_SHORT).show();
            }
        });


    }
}