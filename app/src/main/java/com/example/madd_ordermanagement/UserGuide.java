package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_guide);

        Button buttonAdminHome = (Button) findViewById(R.id.btnAdmin);

        buttonAdminHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(UserGuide.this, AdminHome.class));
            }
        });

        Button buttonCustomerHome = (Button) findViewById(R.id.btnCustomer);

        buttonCustomerHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(UserGuide.this, CustomerHomeMain.class));
            }
        });

    }
}