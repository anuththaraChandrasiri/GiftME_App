package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminMyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_my_account);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHome);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AdminHome.class));
            }
        });

        ImageButton buttonOrders = (ImageButton) findViewById(R.id.btnOrders);

        buttonOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AdminOrders.class));
            }
        });

        ImageButton buttonProducts = (ImageButton) findViewById(R.id.btnProducts);

        buttonProducts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AdminProduct_Activity.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AdminMyAccount.class));
            }
        });

        Button buttonLogout = (Button) findViewById(R.id.btnLogout);

        buttonLogout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AppLaunch_Activity.class));
            }
        });

        Button buttonPaymentDetails = (Button) findViewById(R.id.btnPaymentDetails);

        buttonPaymentDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, Admin_PaymentsDashboard.class));
            }
        });

        Button buttonDeliveryDetails = (Button) findViewById(R.id.btnDeliveryDetails);

        buttonDeliveryDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, DeliverDashboard.class));
            }
        });

    }
}