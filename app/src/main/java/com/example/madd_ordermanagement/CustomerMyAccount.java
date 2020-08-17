package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CustomerMyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_my_account);

        Button buttonMyOrders = (Button) findViewById(R.id.btnMyOrders);

        buttonMyOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, MyAllOrders.class));
            }
        });

        ImageButton buttonMyAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonMyAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, CustomerMyAccount.class));
            }
        });

    }
}