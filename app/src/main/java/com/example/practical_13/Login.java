package com.example.practical_13;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Button SignIn;
    EditText email, password;
    boolean AllFieldsChecked = false;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = (EditText)findViewById(R.id.edEmail);
        password=(EditText)findViewById(R.id.ed_password);
        SignIn = findViewById(R.id.bt_signIn);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllFieldsChecked = CheckAllFields();
                if (AllFieldsChecked) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean CheckAllFields() {
        if (email.length() == 0 || password.length()==0) {
            return false;
        }else{
        return true;}
    }
}