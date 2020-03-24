package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText eUser, ePass;
    Button logIn, reg;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eUser = (EditText)findViewById(R.id.editUser);
        ePass = (EditText)findViewById(R.id.editPass);
        text = (TextView)findViewById(R.id.validCheck);
        reg = (Button)findViewById(R.id.registration);
        logIn = (Button)findViewById(R.id.login);
        logIn.setOnClickListener(this);
        reg.setOnClickListener(this);
    }

    public void onClick(View v){
        String u = eUser.getText().toString();
        String p = ePass.getText().toString();
        if( u.equals("Admin") && p.equals("1234") ) {
            Intent loginAction = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(loginAction);
        }
        else{
            text.setText("Invalid Username  or Password");
        }
        Intent registration = new Intent(MainActivity.this, FourthActivity.class);
        startActivity(registration);
    }
}
