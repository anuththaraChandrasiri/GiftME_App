package com.example.madd_Deliverymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.madd_ordermanagement.R;

public class DeliverDashboard extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                openNewActivity();
            }
        });
    }
    private void openNewActivity() {
        Intent intent = new Intent(this,OrderTo.class);
        startActivity(intent);
    }
}