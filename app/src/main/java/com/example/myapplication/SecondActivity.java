package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    Button lout;
    Button ferImg, souImg, sadImg, arImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentinfo);
        ferImg = (Button)findViewById(R.id.fimg);
        souImg = (Button)findViewById(R.id.simg);
        sadImg = (Button)findViewById(R.id.saimg);
        arImg = (Button)findViewById(R.id.aimg);
        Toast.makeText(SecondActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
        lout = (Button)findViewById(R.id.logout);
        lout.setOnClickListener(this);
        ferImg.setOnClickListener(this);
        souImg.setOnClickListener(this);
        sadImg.setOnClickListener(this);
        arImg.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent logoutIntent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(logoutIntent);
        Intent gotoContent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(gotoContent);
    }
}
