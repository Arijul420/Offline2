package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;

import android.os.Bundle;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener{
    Button submitButton, clearButton;
    EditText edit1, edit2, edit3, edit4, edit5, edit6;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Toast.makeText(FourthActivity.this,"Registration Form", Toast.LENGTH_SHORT).show();
        submitButton = (Button)findViewById(R.id.btnSubmit);
        clearButton = (Button)findViewById(R.id.btnClear);
        txt = (TextView)findViewById(R.id.showText);
        edit1 = (EditText)findViewById(R.id.editText1);
        edit2 = (EditText)findViewById(R.id.editText2);
        edit3 = (EditText)findViewById(R.id.editText3);
        edit4 = (EditText)findViewById(R.id.editText4);
        edit5 = (EditText)findViewById(R.id.editText5);
        edit6 = (EditText)findViewById(R.id.editText6);
        String e1 = edit1.getText().toString();
        String e2 = edit2.getText().toString();
        String e3 = edit3.getText().toString();
        String e4 = edit4.getText().toString();
        String e5 = edit5.getText().toString();
        String e6 = edit6.getText().toString();
        if(e1=="" && e2=="" && e3=="" && e4=="" && e5=="" && e6==""){
            txt.setText("Please, Fill all the field of the form");
        }
        submitButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent submit = new Intent(FourthActivity.this, MainActivity.class);
        startActivity(submit);
        if(R.id.btnClear){
            edit1.setText("");
            edit2.setText("");
            edit3.setText("");
            edit4.setText("");
            edit5.setText("");
            edit6.setText("");
        }
    }
}
