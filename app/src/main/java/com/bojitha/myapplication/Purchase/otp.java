package com.bojitha.myapplication.Purchase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.signin;

public class otp extends AppCompatActivity {
    Button b1;
    Button cancel, resendOTP;
    ProgressBar loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        Toolbar toolbar = findViewById(R.id.toolbarOtp);
        toolbar.setTitle("Add Payment Type");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbar);

        b1 = findViewById(R.id.button4);
        cancel = findViewById(R.id.button7);
        resendOTP = findViewById(R.id.button6);
        loading = findViewById(R.id.progressBar6);
        loading.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountDownTimer timer = new CountDownTimer(2000,2000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        loading.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(otp.this, "Wallet Added", Toast.LENGTH_LONG).show();
                        Intent home = new Intent(otp.this, Home.class);
                        startActivity(home);
                    }
                };
                timer.start();
            }
        });

        resendOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"OTP Resending...",Toast.LENGTH_LONG).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(otp.this, Home.class);
                startActivity(home);
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
            Intent settings = new Intent(otp.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(otp.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(otp.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}