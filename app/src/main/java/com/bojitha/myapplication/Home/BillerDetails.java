package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bojitha.myapplication.R;

public class BillerDetails extends AppCompatActivity {
ImageButton edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biller_details);

        edit = findViewById(R.id.imageButton7);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(BillerDetails.this,EditBiller.class);
                startActivity(ii);
            }
        });
    }
}