package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.billertype.billertypehome;

public class Billers extends AppCompatActivity {
ImageButton edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billers);

        Toolbar toolbar = findViewById(R.id.toolbarBillers);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setTitle("Billers");
        setSupportActionBar(toolbar);

        edit = findViewById(R.id.imageButton32);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Billers.this,BillerDetails.class);
                startActivity(ii);
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
            Intent settings = new Intent(Billers.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(Billers.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(Billers.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}