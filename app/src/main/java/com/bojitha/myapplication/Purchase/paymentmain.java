package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.bojitha.myapplication.R;
import com.bojitha.myapplication.signin;
import com.bojitha.myapplication.signup;


public class paymentmain extends AppCompatActivity {
Button b1;
Button b2;
Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_paymentmain);


        b1 = findViewById(R.id.button5);


        b1.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ii = new Intent(paymentmain.this, card.class);
                startActivity(ii);
            }
        });



        b2 = findViewById(R.id.button2);


        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(paymentmain.this, ez.class);
                        startActivity(ii);
                    }
                });



        b3 = findViewById(R.id.button3);


        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(paymentmain.this, bank.class);
                        startActivity(ii);
                    }
                });

    }
}