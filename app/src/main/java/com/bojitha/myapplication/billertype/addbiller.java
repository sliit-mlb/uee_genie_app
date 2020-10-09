package com.bojitha.myapplication.billertype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.forgetone;
import com.bojitha.myapplication.signin;

public class addbiller extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbiller);

        btn = findViewById(R.id.button9);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(addbiller.this, Billers.class);
                startActivity(ii);
                Toast.makeText(addbiller.this, "Biller Added", Toast.LENGTH_LONG).show();
            }
        });

    }
}