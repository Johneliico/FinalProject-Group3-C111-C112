package com.example.finalproject_bicycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
 Button but1,but2,but3,but4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=(Button)findViewById(R.id.button1);
        but2=(Button)findViewById(R.id.button2);
        but3=(Button)findViewById(R.id.button3);
        but4=(Button)findViewById(R.id.button4);


                but1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent int1= new Intent(MainActivity.this,Parts.class);
                        startActivity(int1);
                    }
                });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(MainActivity.this,access.class);
                startActivity(int2);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(MainActivity.this,repair.class);
                startActivity(int3);

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(MainActivity.this,type.class);
                startActivity(int4);

            }
        });
    }
}