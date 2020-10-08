package com.bojitha.myapplication.Home;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bojitha.myapplication.MakePayment.SelectBills;
import com.bojitha.myapplication.Purchase.history;
import com.bojitha.myapplication.Purchase.resetwallet;
import com.bojitha.myapplication.QRScan.ScanQRCode;
import com.bojitha.myapplication.Purchase.paymentmain;
import com.bojitha.myapplication.R;

public class Home extends AppCompatActivity {

    ImageButton billerType, payment, paymentOption, wallet, scan, billers;

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

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

    @Override
    public void onBackPressed(){
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            Intent a = new Intent(Intent.ACTION_MAIN);
            a.addCategory(Intent.CATEGORY_HOME);
            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(a);
        } else {
            Toast.makeText(getBaseContext(), "Click two times to close an activity",    Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }
}