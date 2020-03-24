package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{
    Button goBackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        Toast.makeText(ThirdActivity.this, "Here is the image", Toast.LENGTH_SHORT).show();
        goBackButton = (Button) findViewById(R.id.goBack);
        goBackButton.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent goBackToDetails = new Intent(ThirdActivity.this, SecondActivity.class);
        startActivity(goBackToDetails);
    }
}
