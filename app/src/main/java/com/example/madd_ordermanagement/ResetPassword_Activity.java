package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ResetPassword_Activity extends AppCompatActivity {
    ImageButton btn, btn2,buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_);

        Button btn1 = findViewById(R.id.btnConfirmReset);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResetPassword_Activity.this,CustomerAccount_Activity.class);
                startActivity(i);
            }
        });

        btn = findViewById(R.id.btnHome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResetPassword_Activity.this,OccasionSelect_Activity.class);
                startActivity(i);
            }
        });

        btn2= findViewById(R.id.btnOccasion);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResetPassword_Activity.this,OccasionProduct_Activity.class);
                startActivity(i);
            }
        });

        buton= findViewById(R.id.btnAccount);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ResetPassword_Activity.this,CustomerAccount_Activity.class);
                startActivity(i);
            }
        });
    }



}