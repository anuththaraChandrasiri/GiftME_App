package com.example.madd_ordermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_);

        Button buttonSignIn = (Button) findViewById(R.id.btnSignIn);

        buttonSignIn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CreateAccount_Activity.this, UserGuide.class));
            }
        });
    }
}