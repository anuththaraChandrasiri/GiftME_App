package com.example.madd_ordermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.madd_ordermanagement.Model.Users;
import com.example.madd_ordermanagement.Prevalent.Prevalent;
import com.example.madd_ordermanagement.ui.home.HomeFragment;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    private EditText inputUserEmail, inputPassword ;
    private Button loginButton ;
    private ProgressDialog loadingBar ;
    private String parentDbName = "Users" ;
    private TextView adminAccount ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.login_btn);
        inputUserEmail = (EditText) findViewById(R.id.login_email_input);
        inputPassword = (EditText) findViewById(R.id.login_password_input);
        adminAccount = (TextView) findViewById(R.id.admin_panel_link);

        loadingBar = new ProgressDialog(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LoginUser();

            }
        });

        adminAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(LoginActivity.this, AdminLogin.class);
                startActivity(intent);
            }
        });

    }

    private void LoginUser() {

        String email = inputUserEmail.getText().toString();
        String password = inputPassword.getText().toString();

        if(TextUtils.isEmpty(email))
            Toast.makeText(this, "User email is required!", Toast.LENGTH_SHORT).show();
        else if(TextUtils.isEmpty(password))
            Toast.makeText(this, "User password is required!", Toast.LENGTH_SHORT).show();
        else{
            loadingBar.setTitle("Login account");
            loadingBar.setMessage("Please wait, while we are checking the credentials");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            AllowAccessToAccount(email, password);

        }
    }

    private void AllowAccessToAccount(final String email, final String password) {

        final DatabaseReference RootRef ;
        RootRef = FirebaseDatabase.getInstance().getReference();

        RootRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.child(parentDbName).child(email).exists()){

                    Users usersData = dataSnapshot.child(parentDbName).child(email).getValue(Users.class);

                    if(usersData.getEmail().equals(email)){

                        if(usersData.getPassword().equals(password)){

                            Toast.makeText(LoginActivity.this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();

                            Intent intent = new Intent(LoginActivity.this, Home.class);
                            Prevalent.currentOnlineUser= usersData ;
                            startActivity(intent);
                        }
                        else {

                            Toast.makeText(LoginActivity.this, "Entered password is incorrect.", Toast.LENGTH_SHORT).show();
                            loadingBar.dismiss();
                        }
                    }

                }
                else {

                    Toast.makeText(LoginActivity.this, "Account with this " + email + "email is not exist.", Toast.LENGTH_SHORT).show();
                    loadingBar.dismiss();
                    Toast.makeText(LoginActivity.this, "Please create an account to proceed.", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}