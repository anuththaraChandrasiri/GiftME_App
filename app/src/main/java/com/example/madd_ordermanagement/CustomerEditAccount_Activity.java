package com.example.madd_ordermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerEditAccount_Activity extends AppCompatActivity {
    ImageButton btn, btn2,buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_edit_account_);

        Button btn1 = findViewById(R.id.btnSaveEdit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerEditAccount_Activity.this,CustomerAccount_Activity.class);
                startActivity(i);
            }
        });

        btn = findViewById(R.id.btnHomeBack);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerEditAccount_Activity.this,OccasionSelect_Activity.class);
                startActivity(i);
            }
        });

        btn2= findViewById(R.id.btnOccasion);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerEditAccount_Activity.this,OccasionProduct_Activity.class);
                startActivity(i);
            }
        });

        buton= findViewById(R.id.btnAccount);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CustomerEditAccount_Activity.this, CustomerMyAccount.class);
                startActivity(i);
            }
        });

    }
}