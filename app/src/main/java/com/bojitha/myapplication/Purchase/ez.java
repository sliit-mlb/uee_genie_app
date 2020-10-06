package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.R;

public class ez extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ez);


        b1 = findViewById(R.id.button12);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(ez.this, otp.class);
                        startActivity(ii);
                    }
                });
    }
}