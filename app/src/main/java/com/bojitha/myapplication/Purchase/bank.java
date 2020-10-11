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

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class bank extends AppCompatActivity {
FloatingActionButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        Toolbar bankToolbar = findViewById(R.id.toolbarBank);
        bankToolbar.setTitle("Add Payment Type");
        bankToolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(bankToolbar);

        b1 = findViewById(R.id.floatingActionButton52);


        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent ii = new Intent(bank.this, otp.class);
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
            Intent settings = new Intent(bank.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(bank.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(bank.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}