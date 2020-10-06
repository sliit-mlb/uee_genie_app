package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.R;

public class card extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);

        b1 = findViewById(R.id.button11);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(card.this, otp.class);
                        startActivity(ii);
                    }
                });
    }
}