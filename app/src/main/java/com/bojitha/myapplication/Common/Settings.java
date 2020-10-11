package com.bojitha.myapplication.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.EditPersonalDetails.EditPersonalDetails;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.Purchase.history;
import com.bojitha.myapplication.Purchase.resetwallet;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.changepassword;
import com.bojitha.myapplication.enablefingerprint.enablefingerprint;
import com.bojitha.myapplication.signin;

public class Settings extends AppCompatActivity {

    Button editPersonalDetails, changeWalletPIN, changePassword, enableFingerprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        editPersonalDetails = findViewById(R.id.buttonEpd);
        changeWalletPIN = findViewById(R.id.buttonCwp);
        changePassword = findViewById(R.id.buttonCp);
        enableFingerprint = findViewById(R.id.buttonEf);

        Toolbar toolbarForSettings = findViewById(R.id.toolbar_for_settings);
        toolbarForSettings.setTitle("Settings");
        toolbarForSettings.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForSettings);

        editPersonalDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent epd = new Intent(Settings.this, EditPersonalDetails.class);
                startActivity(epd);
            }
        });

        changeWalletPIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cwp = new Intent(Settings.this, resetwallet.class);
                startActivity(cwp);
            }
        });

        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePwd = new Intent(Settings.this, changepassword.class);
                startActivity(changePwd);
            }
        });

        enableFingerprint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enableFinger = new Intent(Settings.this, enablefingerprint.class);
                startActivity(enableFinger);
            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent home = new Intent(Settings.this, Home.class);
        startActivity(home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.toolSettings){
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(Settings.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(Settings.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}