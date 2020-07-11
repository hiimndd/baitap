package com.example.example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    ToggleButton phai;
    ImageView nv;
    CheckBox nam,nu;
    Button tao;
    TextView ten;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phai = findViewById(R.id.phai);
        nv = (ImageView) findViewById(R.id.imageView);
        nv.setImageDrawable(getResources().getDrawable(R.drawable.nguyet));
       // Boolean checked = phai.isChecked();

        nam = findViewById(R.id.nam);
        nu = findViewById(R.id.nu);
        nam.setOnCheckedChangeListener(mLister);
        nu.setOnCheckedChangeListener(mLister);


        tao = findViewById(R.id.bttao);
        ten = findViewById(R.id.tennv);
        tao = findViewById(R.id.bttao);
        phai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phai.isChecked()){
                    nv.setImageDrawable(getResources().getDrawable(R.drawable.nhat));
                    Toast.makeText(MainActivity.this,"Bạn chọn theo phe Nhật tôc!",Toast.LENGTH_SHORT).show();
                }else {
                    nv.setImageDrawable(getResources().getDrawable(R.drawable.nguyet));
                    Toast.makeText(MainActivity.this,"Bạn chọn theo phe Nguyệt tôc!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        tao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gt,toc;
                AlertDialog.Builder alog = new AlertDialog.Builder(MainActivity.this);
                if (nam.isChecked()) {
                    gt = nam.getText().toString();



                }else {

                    gt = nu.getText().toString();
                }
                if(phai.isChecked()){
                    toc = phai.getTextOn().toString();
                }else {
                    toc = phai.getTextOff().toString();
                }
                alog.setTitle("THÔNG TIN NHÂN VẬT");
                alog.setMessage("HÊ TỘC: "+ toc +"\r\nTÊN NHÂN VẬT :"+ ten.getText().toString() +"\r\nNHÂN VẬT :" + gt);

                alog.setPositiveButton("Lưu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Nhân vật đã được tạo thành công! ", Toast.LENGTH_SHORT).show();
                    }
                });
                alog.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Hủy nhân vật.Vui lòng tạo lại!", Toast.LENGTH_SHORT).show();
                    }
                });
                alog.show();
            }
        });




    }




    CompoundButton.OnCheckedChangeListener mLister = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(buttonView.getId() == R.id.nam)
            {
                if(isChecked) {
                    nu.setChecked(false);
                    nu.setEnabled(false);

                }else {
                    nu.setEnabled(true);
                }


            }else{
                if(isChecked) {
                    nam.setChecked(false);
                    nam.setEnabled(false);

                }else {
                    nam.setEnabled(true);
                }
            }
            if(isChecked){
                Toast.makeText(MainActivity.this,"Bạn chọn nhân vật "+ buttonView.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        }
    };

}
