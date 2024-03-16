package com.example.perpetual;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    Button signUp;
    EditText name,email,password;
    TextView signIn, skip;

    // FirebaseAuth auth;

    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        // auth=FirebaseAuth.getInstance();
        progressBar=findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);
        signUp=findViewById(R.id.login_btn);
        email=findViewById(R.id.editText2);
        name=findViewById(R.id.editText1);
        password=findViewById(R.id.editText3);
        signIn=findViewById(R.id.sign_In);
        skip=findViewById(R.id.skip_text);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // createUser();
                startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));
                progressBar.setVisibility(View.VISIBLE);

            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, HomeActivity.class));

            }
        });
    }
    /*private void createUser(){
        String userName = name.getText().toString();
        String userEmail=email.getText().toString();
        String userPassword=password.getText().toString();

        if(TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Name is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "email is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "pass is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(userPassword.length()<6){
            Toast.makeText(this, "password length must be 6 letter", Toast.LENGTH_SHORT).show();
            return;
        }
        auth.createUserWithEmailAndPassword(userEmail,userPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                        String id=task.getResult().getUser().getUid();
                        database.getReference().child("Users").child(id).setValue(userModel);
                        ProgressBar.setVisibility(View.Gone);
                            Toast.makeText(RegistrationActivity.this, "registration successful", Toast.LENGTH_SHORT).show();
                        }
                        else{
                        progressbar.setVisibility(View.Gone);
                            Toast.makeText(RegistrationActivity.this, "error:"+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }*/
}