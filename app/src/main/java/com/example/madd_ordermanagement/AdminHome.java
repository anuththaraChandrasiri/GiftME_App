package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_main);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHome);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminHome.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOrders = (ImageButton) findViewById(R.id.btnOrders);

        buttonOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminHome.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonProducts = (ImageButton) findViewById(R.id.btnProducts);

        buttonProducts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminHome.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminHome.this, AdminMyAccount.class));
            }
        });

    }
}