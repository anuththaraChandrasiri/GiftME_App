package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CancelOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_order);

        Button buttonExit = (Button) findViewById(R.id.btnExit);

        buttonExit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CancelOrder.this, MyAllOrders.class));
            }
        });

        ImageButton buttonViewCart = (ImageButton) findViewById(R.id.btnCart);

        buttonViewCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(CancelOrder.this, MyCart.class));
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message1 = intent.getStringExtra(ViewOrder.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(ViewOrder.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(ViewOrder.EXTRA_MESSAGE3);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.txtProduct1);
        textView1.setText(message1);
        TextView textView2 = findViewById(R.id.txtProduct1Price);
        textView2.setText(message2);
        TextView textView3 = findViewById(R.id.txtProduct1Items);
        textView3.setText(message3);

    }
}