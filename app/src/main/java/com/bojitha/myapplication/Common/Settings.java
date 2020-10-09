package com.bojitha.myapplication.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bojitha.myapplication.EditPersonalDetails.EditPersonalDetails;
import com.bojitha.myapplication.Purchase.resetwallet;
import com.bojitha.myapplication.R;

public class Settings extends AppCompatActivity {

    Button editPersonalDetails, changeWalletPIN, changePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        editPersonalDetails = findViewById(R.id.buttonEpd);
        changeWalletPIN = findViewById(R.id.buttonCwp);
        changePassword = findViewById(R.id.buttonCp);

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
    }
}