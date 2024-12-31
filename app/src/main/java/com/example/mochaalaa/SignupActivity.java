package com.example.mochaalaa;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private EditText editName, editEmail, editPassword, confirmPassword;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        db = new DatabaseHelper(this);

        editName = findViewById(R.id.editnamesignup);
        editEmail = findViewById(R.id.editEmailsignup);
        editPassword = findViewById(R.id.editpasswordSignUp);
        confirmPassword = findViewById(R.id.confirmpassword2);

        findViewById(R.id.signupbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSignup();
            }
        });
    }

    private void handleSignup() {
        String name = editName.getText().toString();
        String email = editEmail.getText().toString();
        String password = editPassword.getText().toString();
        String confirmPass = confirmPassword.getText().toString();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "All fields are required!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPass)) {
            Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (db.checkUser(email)) {
            Toast.makeText(this, "User already exists!", Toast.LENGTH_SHORT).show();
            return;
        }

        boolean success = db.insertUser(name, email, password);
        if (success) {
            Toast.makeText(this, "Signup Successful!", Toast.LENGTH_SHORT).show();
            // Optionally redirect to login or another activity
        } else {
            Toast.makeText(this, "Signup Failed!", Toast.LENGTH_SHORT).show();
        }
    }
}
