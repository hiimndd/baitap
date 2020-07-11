package com.example.bai7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView number;
    Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (TextView) findViewById(R.id.txtnumber);
        start  = (Button) findViewById(R.id.btstart);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(10000,1000){
                    public  void  onTick(long timeLength){
                        number.setText(""+timeLength/1000);
                    }
                    public void onFinish(){
                        Toast.makeText(MainActivity.this ,"Kết Thúc" ,Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });
    }
}