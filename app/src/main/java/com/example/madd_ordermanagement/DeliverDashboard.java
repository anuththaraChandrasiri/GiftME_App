package com.example.madd_ordermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DeliverDashboard extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        button = (Button) findViewById(R.id.btnExample);

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