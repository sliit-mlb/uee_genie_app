package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class viewwallet extends AppCompatActivity {

    FloatingActionButton b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewwallet);

        b3 = findViewById(R.id.floatingActionButton55);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent ii = new Intent(viewwallet.this, paymentmain.class);
                 startActivity(ii);
            }
        });
    }
}