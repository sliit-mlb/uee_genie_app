package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.R;

public class filer extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filer);

        Toolbar toolbar = findViewById(R.id.toolbarFiler);
        toolbar.setTitle("History");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbar);

        b1 = findViewById(R.id.button9);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(filer.this, "Take some moments", Toast.LENGTH_LONG).show();

                    }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.toolSettings){
            Intent settings = new Intent(filer.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(filer.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            //Intent history = new Intent(filer.this, com.bojitha.myapplication.Purchase.history.class);
            //startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}