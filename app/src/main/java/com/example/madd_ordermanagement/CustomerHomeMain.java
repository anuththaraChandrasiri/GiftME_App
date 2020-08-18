package com.example.madd_ordermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class CustomerHomeMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home_main);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHome);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerHomeMain.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOccasion = (ImageButton) findViewById(R.id.btnOccasion);

        buttonOccasion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerHomeMain.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerHomeMain.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerHomeMain.this, CustomerMyAccount.class));
            }
        });

    }
}