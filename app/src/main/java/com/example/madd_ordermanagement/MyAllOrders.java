package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MyAllOrders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_all_orders);

        Button buttonOrdersToPay = (Button) findViewById(R.id.btnOrdersToPay);

        buttonOrdersToPay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MyAllOrders.this, OrdersToPay.class));
            }
        });

    }
}