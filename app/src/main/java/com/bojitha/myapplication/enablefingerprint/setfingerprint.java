package com.bojitha.myapplication.enablefingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;

public class setfingerprint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setfingerprint);

        Button setfingerprint;

        setfingerprint = findViewById(R.id.button8);
        setfingerprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(setfingerprint.this, Home.class);
                startActivity(ii);

            }
        });

    }
}