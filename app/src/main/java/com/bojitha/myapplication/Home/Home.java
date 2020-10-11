package com.bojitha.myapplication.Home;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.MakePayment.SelectBills;
import com.bojitha.myapplication.Purchase.history;
import com.bojitha.myapplication.Purchase.resetwallet;
import com.bojitha.myapplication.Purchase.viewwallet;
import com.bojitha.myapplication.QRScan.ScanQRCode;
import com.bojitha.myapplication.Purchase.paymentmain;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.billertype.addbiller;
import com.bojitha.myapplication.enablefingerprint.enablefingerprint;
import com.bojitha.myapplication.forgetone;
import com.bojitha.myapplication.signin;
import com.bojitha.myapplication.vouchers.voucher;

public class Home extends AppCompatActivity {

    Button b1;
    ImageButton addBiller, makePayment, addPaymentOption, wallet, qrScan, billers;

    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbarHome);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setTitle("Pay by Genie");
        setSupportActionBar(toolbar);

        billers = findViewById(R.id.imageButton21);
        addBiller = findViewById(R.id.imageButton11);
        makePayment = (ImageButton)findViewById(R.id.imageButton18);
        qrScan = (ImageButton)findViewById(R.id.imageButton20);
        addPaymentOption = (ImageButton) findViewById(R.id.imageButton17);
        wallet = findViewById(R.id.imageButton19);

        b1 = findViewById(R.id.buttonCp);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Home.this, voucher.class);
                startActivity(ii);
            }
        });

        addBiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Home.this, com.bojitha.myapplication.billertype.billertypehome.class);
                startActivity(ii);
            }
        });

        makePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectBills = new Intent(Home.this, SelectBills.class);
                startActivity(selectBills);
            }
        });

        qrScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qrScan = new Intent(Home.this, ScanQRCode.class);
                startActivity(qrScan);
            }
        });

        addPaymentOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addPayment = new Intent(Home.this, paymentmain.class);
                startActivity(addPayment);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewWallet = new Intent(Home.this, viewwallet.class);
                startActivity(viewWallet);
            }
        });

        billers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Home.this,Billers.class);
                startActivity(ii);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.toolSettings){
            Intent settings = new Intent(Home.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(Home.this, signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(Home.this, history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}