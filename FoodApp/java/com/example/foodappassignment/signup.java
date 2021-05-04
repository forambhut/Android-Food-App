package com.example.foodappassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    EditText Name,Password,eid;
    Button Signup ,Cancel;
    TextView uname,pass,id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        uname = (TextView)findViewById(R.id.uname);
        pass = (TextView)findViewById(R.id.upass);
        id = (TextView)findViewById(R.id.uid);
        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPass);
        eid = (EditText) findViewById(R.id.etEid);
        Signup = (Button)findViewById(R.id.btnSignUp);
        Cancel = (Button)findViewById(R.id.btnClear);

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"SignUp Succesfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(signup.this , login.class);
                startActivity(intent);
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup.this.finish();
                System.exit(0);
            }
        });

    }
}