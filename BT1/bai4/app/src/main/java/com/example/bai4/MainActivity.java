package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView name;
    TextView year;
    TextView thongbao;
    Button tinh;
    int age;
    Activity age_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tinh = (Button) findViewById(R.id.bttinh);
        name = (TextView) findViewById(R.id.txthoten);
        year = (TextView) findViewById(R.id.txttuoi);
        thongbao = (TextView) findViewById(R.id.txttb);
        thongbao.setTextColor(Color.BLUE);
        thongbao.setTextSize(24);
        getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year.getText().toString());
                thongbao.setText("ban" + name.getText() + ' '+ age +"tuoi");
            }
        });
    }
}
