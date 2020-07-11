package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView so;
    Button tang;
    Button giam;
    Button open;
    int cong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so = (TextView)findViewById(R.id.txtso);
        tang = (Button)findViewById(R.id.bttang);
        giam = (Button)findViewById(R.id.btgiam);
        open = (Button)findViewById(R.id.btnext);
        giam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong = Integer.parseInt((String) so.getText())-1;
                so.setText(String.valueOf(cong));
            }
        });
        tang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cong = Integer.parseInt((String) so.getText())+1;
                so.setText(String.valueOf(cong));
            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });


    }
}
