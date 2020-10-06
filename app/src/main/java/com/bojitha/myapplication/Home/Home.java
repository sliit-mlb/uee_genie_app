package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bojitha.myapplication.MakePayment.SelectBills;
import com.bojitha.myapplication.QRScan.ScanQRCode;
import com.bojitha.myapplication.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton payment = (ImageButton)findViewById(R.id.imageButton18);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectBills = new Intent(Home.this, SelectBills.class);
                startActivity(selectBills);
            }
        });

        ImageButton qrscanner = (ImageButton)findViewById(R.id.imageButton20);
        qrscanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qrScan = new Intent(Home.this, ScanQRCode.class);
                startActivity(qrScan);
            }
        });
    }
}