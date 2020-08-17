package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminMyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_my_account);

        ImageButton buttonAdminOrders = (ImageButton) findViewById(R.id.btnOccasion);

        buttonAdminOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(AdminMyAccount.this, AdminOrders.class));
            }
        });

    }
}