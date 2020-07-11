package com.example.bai6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btclick = (Button) findViewById(R.id.open);
        btclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alog = new AlertDialog.Builder(MainActivity.this);
                alog.setTitle("Kane DLine");
                alog.setMessage("Đã đến với chúng thôi");
                alog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Bạn đã click có ",Toast.LENGTH_SHORT).show();
                    }
                });
                alog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this ,"Bạn đã click không",Toast.LENGTH_SHORT).show();
                    }
                });
                alog.show();
            }
        });
    }
}



