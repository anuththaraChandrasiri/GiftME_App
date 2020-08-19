package com.example.madd_ordermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ViewOrder extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.madd_ordermanagement.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.madd_ordermanagement.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.madd_ordermanagement.MESSAGE3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);

        ImageButton buttonHome = (ImageButton) findViewById(R.id.btnHomeBack);

        buttonHome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ViewOrder.this, CustomerHomeMain.class));
            }
        });

        ImageButton buttonOccasion = (ImageButton) findViewById(R.id.btnOccasion);

        buttonOccasion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ViewOrder.this, OccasionSelect_Activity.class));
            }
        });

        ImageButton buttonCart = (ImageButton) findViewById(R.id.btnCart);

        buttonCart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ViewOrder.this, MyCart.class));
            }
        });

        ImageButton buttonAccount = (ImageButton) findViewById(R.id.btnAccount);

        buttonAccount.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ViewOrder.this, CustomerMyAccount.class));
            }
        });

        Button buttonViewProduct = (Button) findViewById(R.id.btnViewProduct);

        buttonViewProduct.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ViewOrder.this, MainActivity.class));
            }
        });

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String message1 = intent.getStringExtra(MyAllOrders.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(MyAllOrders.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MyAllOrders.EXTRA_MESSAGE3);

        // Capture the layout's TextView and set the string as its text
        TextView textView1 = findViewById(R.id.txtProduct1);
        textView1.setText(message1);
        TextView textView2 = findViewById(R.id.txtProduct1Price);
        textView2.setText(message2);
        TextView textView3 = findViewById(R.id.txtProduct1Items);
        textView3.setText(message3);

    }

    /** Called when the user taps the Cancel order button */
    public void sendMessage(View view) {

        // Do something in response to button

        Intent intent = new Intent(this, CancelOrder.class);

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