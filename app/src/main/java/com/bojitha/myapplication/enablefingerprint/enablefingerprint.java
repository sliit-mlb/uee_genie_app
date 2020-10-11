package com.bojitha.myapplication.enablefingerprint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.billertype.billertypehome;

public class enablefingerprint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enablefingerprint);

        Toolbar bankToolbar = findViewById(R.id.toolbarEnableFingerPrint);
        bankToolbar.setTitle("Fingerprint");
        bankToolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(bankToolbar);

        Button enable;



        enable = findViewById(R.id.button5);

        enable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ii = new Intent(enablefingerprint.this, pin.class);
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
            Intent settings = new Intent(enablefingerprint.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(enablefingerprint.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(enablefingerprint.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}