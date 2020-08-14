package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Checkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.txtProductName);
        textView1.setText(message1);
        TextView textView2 = findViewById(R.id.txtProductPrice);
        textView2.setText(message2);
        TextView textView3 = findViewById(R.id.txtOrderingItems);
        textView3.setText(message3);
        TextView textView4 = findViewById(R.id.txtDisplayFinalNoOfItems);
        textView4.setText(message3);

        //Get values from the cart products
        String message4 = intent.getStringExtra(MyCart.EXTRA_MESSAGE1);
        String message5 = intent.getStringExtra(MyCart.EXTRA_MESSAGE2);
        String message6 = intent.getStringExtra(MyCart.EXTRA_MESSAGE3);

        // Capture the layout's TextView and set the string as its text
        TextView textView5 = findViewById(R.id.txtProductName);
        textView5.setText(message1);
        TextView textView6 = findViewById(R.id.txtProductPrice);
        textView6.setText(message2);
        TextView textView7 = findViewById(R.id.txtOrderingItems);
        textView7.setText(message3);
        TextView textView8 = findViewById(R.id.txtDisplayFinalNoOfItems);
        textView8.setText(message3);

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Checkout.this, MyCart.class));
            }
        });

        ImageButton buttonBack = (ImageButton) findViewById(R.id.btnBackToProduct);

        buttonBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Checkout.this, MainActivity.class));
            }
        });

    }
}