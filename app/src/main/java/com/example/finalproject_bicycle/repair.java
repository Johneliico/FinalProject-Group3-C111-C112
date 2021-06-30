package com.example.finalproject_bicycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class repair extends AppCompatActivity {
    Button butt,butt2,butt3,butt4,butt5,butt6,butt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair);
        butt=(Button)findViewById(R.id.button10);
        butt2=(Button)findViewById(R.id.button6);
        butt3=(Button)findViewById(R.id.button7);
        butt4=(Button)findViewById(R.id.button8);
        butt5=(Button)findViewById(R.id.button9);
        butt6=(Button)findViewById(R.id.button11);
        butt7=(Button)findViewById(R.id.button12);

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(repair.this,installingw.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(repair.this,tube.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(repair.this,front.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(repair.this,backs.class);
                startActivity(int4);
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent(repair.this,pedal.class);
                startActivity(int5);
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6= new Intent(repair.this,adjust.class);
                startActivity(int6);
            }
        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7= new Intent(repair.this,rear.class);
                startActivity(int7);
            }
        });

    }
}