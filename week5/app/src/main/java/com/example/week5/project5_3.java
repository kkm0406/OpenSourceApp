package com.example.week5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class project5_3 extends AppCompatActivity {

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

        EditText edt = new EditText(this);

        baseLayout.addView(edt);

        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.rgb(0, 255, 255));
        btn.setLayoutParams(new LinearLayout.LayoutParams(500, 200));
        baseLayout.addView(btn);

        TextView txt = new TextView(this);
        txt.setTextSize(30);
        txt.setTextColor(Color.RED);
        baseLayout.addView(txt);

        TextView txt2 = new TextView(this);
        txt2.setTextSize(20);
        txt2.setTextColor(Color.rgb(100,100,100));
        txt2.setText("2018038065 김광모");
        baseLayout.addView(txt2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String low = edt.getText().toString();
                txt.setText(low);
            }
        });
    }
}