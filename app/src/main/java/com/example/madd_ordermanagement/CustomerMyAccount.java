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

        Button buttonAccountDetails = (Button) findViewById(R.id.btnPaymentDetails);

        buttonAccountDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, CustomerMyAccount.class));
            }
        });

        Button buttonPaymentDetails = (Button) findViewById(R.id.btnPaymentDetails);

        buttonPaymentDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, BlankFragment.class));
            }
        });

        Button buttonDeliveryDetails = (Button) findViewById(R.id.btnDeliveryDetails);

        buttonDeliveryDetails.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, Customer_deliveryDetails.class));
            }
        });

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHome);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOccasion = (ImageButton) findViewById(R.id.btnOccasion);

        buttonOccasion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, CustomerMyAccount.class));
            }
        });

        Button buttonLogout = (Button) findViewById(R.id.btnLogout);

        buttonLogout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CustomerMyAccount.this, AppLaunch_Activity.class));
            }
        });

    }
}