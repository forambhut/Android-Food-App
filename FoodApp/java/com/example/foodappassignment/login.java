package com.example.foodappassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText Name,Password;
    Button Login ,forgot;
    TextView uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname = (TextView)findViewById(R.id.username);
        pass = (TextView)findViewById(R.id.userPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        forgot = (Button)findViewById(R.id.btnforgot);
        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login Succesfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(login.this , MainActivity.class);
                startActivity(intent);
    }
});
    }
}