package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.R;

public class history extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        b1 = findViewById(R.id.button13);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(history.this, filer.class);
                        startActivity(ii);
                    }
                });
    }
}