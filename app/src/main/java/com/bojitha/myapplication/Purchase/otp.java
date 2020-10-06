package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bojitha.myapplication.R;
import com.bojitha.myapplication.signin;

public class otp extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);





        b1 = findViewById(R.id.button4);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(otp.this, "Verified", Toast.LENGTH_LONG).show();

                    }
                });

    }
}