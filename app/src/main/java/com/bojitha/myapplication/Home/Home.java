package com.bojitha.myapplication.Home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bojitha.myapplication.MakePayment.SelectBills;
import com.bojitha.myapplication.Purchase.history;
import com.bojitha.myapplication.Purchase.resetwallet;
import com.bojitha.myapplication.QRScan.ScanQRCode;
import com.bojitha.myapplication.Purchase.paymentmain;
import com.bojitha.myapplication.R;

public class Home extends AppCompatActivity {

    ImageButton billerType, payment, paymentOption, wallet, scan, billers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        payment = (ImageButton)findViewById(R.id.imageButton18);
        scan = (ImageButton)findViewById(R.id.imageButton20);
        paymentOption = (ImageButton) findViewById(R.id.imageButton17);
        billerType = findViewById(R.id.imageButton11);
        billers = findViewById(R.id.imageButton21);
        wallet = findViewById(R.id.imageButton19);

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectBills = new Intent(Home.this, SelectBills.class);
                startActivity(selectBills);
            }
        });

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qrScan = new Intent(Home.this, ScanQRCode.class);
                startActivity(qrScan);
            }
        });

        paymentOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addPayment = new Intent(Home.this, paymentmain.class);
                startActivity(addPayment);
            }
        });
    }
}