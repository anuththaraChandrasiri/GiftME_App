package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrdersToPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_to_pay);

        Button buttonAllOrders = (Button) findViewById(R.id.btnAllOrders);

        buttonAllOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, MyAllOrders.class));
            }
        });

    }
}