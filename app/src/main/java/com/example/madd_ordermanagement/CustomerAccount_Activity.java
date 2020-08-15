package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerAccount_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_account_);

        Button btn = findViewById(R.id.btnSaveEdit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerAccount_Activity.this, CustomerEditAccount_Activity.class);
                startActivity(i);
            }
        });

        Button btn2 = findViewById(R.id.btnConfirmResetPswd);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerAccount_Activity.this, ResetPassword_Activity.class);
                startActivity(i);
            }
        });
    }
}
