package com.example.myapplication.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {
private EditText userEdt,passEdt;
private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView() {
userEdt=findViewById(R.id.editTextText);
passEdt=findViewById(R.id.editTextPassword);
loginBtn=findViewById(R.id.loginBtn);
loginBtn.setOnClickListener(view -> {
    if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
        Toast.makeText(LoginActivity.this, "Please Fill Username and Password", Toast.LENGTH_SHORT).show();
    }else if(userEdt.getText().toString().equals("akitha@gmail.com") && passEdt.getText().toString().equals("test")){
        startActivity(new Intent(LoginActivity.this,MainActivity.class));

    }
});
    }
}