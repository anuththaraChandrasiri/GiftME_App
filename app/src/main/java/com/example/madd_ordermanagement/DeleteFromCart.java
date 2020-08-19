package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DeleteFromCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_from_cart);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHomeBack);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOccasion = (ImageButton) findViewById(R.id.btnOccasion);

        buttonOccasion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, CustomerMyAccount.class));
            }
        });

        Button buttonProduct1Cancel = (Button) findViewById(R.id.btnProduct1Cancel);

        buttonProduct1Cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, MyCart.class));
            }
        });

    }
}