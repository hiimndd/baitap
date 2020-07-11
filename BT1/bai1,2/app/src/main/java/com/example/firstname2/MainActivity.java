package com.example.firstname2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtName;
    Button btclick;
    ImageView dog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (TextView) findViewById(R.id.txtTen);
        txtName.setText("wellcome to first my progaram");
        btclick = (Button) findViewById(R.id.button1);
        dog = (ImageView) findViewById(R.id.imgdog);
        dog.setBackgroundResource(R.mipmap.hotgirl);
        btclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.setBackgroundResource(R.mipmap.avatadogxl);
            }
        });


    }
}
