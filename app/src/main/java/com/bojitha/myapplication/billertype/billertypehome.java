package com.bojitha.myapplication.billertype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.enablefingerprint.enablefingerprint;

import java.util.ArrayList;

public class billertypehome extends AppCompatActivity {


    Button dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billertypehome);

        dialog = findViewById(R.id.button11);

        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(billertypehome.this, addbiller.class);
                startActivity(ii);
            }
        });




    }

}