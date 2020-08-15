package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyAllOrders extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.madd_ordermanagement.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.madd_ordermanagement.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.madd_ordermanagement.MESSAGE3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_all_orders);

        Button buttonOrdersToPay = (Button) findViewById(R.id.btnOrdersToPay);

        buttonOrdersToPay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MyAllOrders.this, OrdersToPay.class));
            }
        });

    }

    /** Called when the user taps the View order button */
    public void sendMessage(View view) {

        // Do something in response to button

        Intent intent = new Intent(this, ViewOrder.class);

        TextView textView1 = (TextView) findViewById(R.id.txtProduct1);
        String message1 = textView1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);

        TextView textView2 = (TextView) findViewById(R.id.txtProduct1Price);
        String message2 = textView2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);

        TextView textView3 = (TextView) findViewById(R.id.txtProduct1Items);
        String message3 = textView3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);

        startActivity(intent);

    }

}