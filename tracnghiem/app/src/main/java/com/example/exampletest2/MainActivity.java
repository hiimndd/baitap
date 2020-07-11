package com.example.exampletest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton a1,c2,b3,c4,a5;
    RadioGroup cau1,cau2,cau3,cau4,cau5;
    int ketqua = 0;
    Button kq,rs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1 = findViewById(R.id.a1);
        c2 = findViewById(R.id.c2);
        b3 = findViewById(R.id.b3);
        c4 = findViewById(R.id.c4);
        a5 = findViewById(R.id.a5);
        kq = findViewById(R.id.ketqua);
        rs = findViewById(R.id.resert);
        cau1 = findViewById(R.id.cau1);
        cau2 = findViewById(R.id.cau2);
        cau3 = findViewById(R.id.cau3);
        cau4 = findViewById(R.id.cau4);
        cau5 = findViewById(R.id.cau5);


        a1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked){
                    ketqua += 2;
                }
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked){
                    ketqua += 2;
                }
            }
        });
        b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked){
                    ketqua += 2;
                }
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked){
                    ketqua += 2;
                }
            }
        });
        a5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if( isChecked){
                    ketqua += 2;
                }

        }
        });
        kq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Điểm thi của bạn là : "+ ketqua ,Toast.LENGTH_SHORT).show();
            }
        });
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    cau1.clearCheck();
                    cau2.clearCheck();
                    cau3.clearCheck();
                    cau4.clearCheck();
                    cau5.clearCheck();
                    ketqua = 0;
            }
        });


    }
}
