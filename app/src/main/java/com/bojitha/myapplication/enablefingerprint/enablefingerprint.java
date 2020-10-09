package com.bojitha.myapplication.enablefingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;

public class enablefingerprint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enablefingerprint);


        Button enable;



        enable = findViewById(R.id.button5);

        enable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ii = new Intent(enablefingerprint.this, pin.class);
                    startActivity(ii);
                }
            });


    }
}