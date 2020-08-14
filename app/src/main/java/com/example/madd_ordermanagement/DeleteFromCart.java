package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteFromCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_from_cart);

        Button buttonProduct1Cancel = (Button) findViewById(R.id.btnProduct1Cancel);

        buttonProduct1Cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(DeleteFromCart.this, MyCart.class));
            }
        });

    }
}