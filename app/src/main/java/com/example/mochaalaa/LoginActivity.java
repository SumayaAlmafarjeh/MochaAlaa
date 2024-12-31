package com.example.mochaalaa;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail, editPassword;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        db = new DatabaseHelper(this);

        editEmail = findViewById(R.id.editEmailLogin);
        editPassword = findViewById(R.id.editpasswordLogin);

        findViewById(R.id.loginbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
/*
        TextView signUpText = findViewById(R.id.textView5);
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to SignupActivity
                Toast.makeText(LoginActivity.this, "Sign Up clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

     */


        TextView forgotPassText = findViewById(R.id.forgotpass);
        forgotPassText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Forgot Password feature not implemented yet.", Toast.LENGTH_SHORT).show();
                // Implement forgot password feature if required
            }
        });
    }
    public void navigateToSignUp(View view) {
        // Navigate to SignupActivity
        Toast.makeText(LoginActivity.this, "Sign Up clicked!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(intent);
    }
    private void handleLogin() {
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (db.checkUser(email, password)) {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();

            // Navigate to MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Close LoginActivity
        } else {
            Toast.makeText(this, "Invalid Email or Password!", Toast.LENGTH_SHORT).show();
        }
    }
}
