package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bojitha.myapplication.R;

public class Billers extends AppCompatActivity {
ImageButton edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billers);

        edit = findViewById(R.id.imageButton32);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Billers.this,BillerDetails.class);
                startActivity(ii);
            }
        });
    }
}