package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OrdersToPay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_to_pay);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHomeBack);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOccasion = (ImageButton) findViewById(R.id.btnOccasion);

        buttonOccasion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, CustomerMyAccount.class));
            }
        });

        Button buttonAllOrders = (Button) findViewById(R.id.btnAllOrders);

        buttonAllOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, MyAllOrders.class));
            }
        });

        Button shopMore = (Button) findViewById(R.id.btnShopMore);

        buttonAllOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(OrdersToPay.this, CustomerHomeMain.class));
            }
        });

    }
}