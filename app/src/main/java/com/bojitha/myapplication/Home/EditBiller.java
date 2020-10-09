package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.R;
import com.bojitha.myapplication.enablefingerprint.enablefingerprint;

public class EditBiller extends AppCompatActivity {
Button edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_biller);

        edit = findViewById(R.id.button4);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(EditBiller.this, Billers.class);
                startActivity(ii);
            }
        });
    }
}