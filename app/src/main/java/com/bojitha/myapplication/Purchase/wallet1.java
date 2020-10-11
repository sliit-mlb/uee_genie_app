package com.bojitha.myapplication.Purchase;

import
        androidx.appcompat.app.AppCompatActivity;
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
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.MakePayment.ConfirmBill;
import com.bojitha.myapplication.R;


public class wallet1 extends AppCompatActivity {

    ProgressBar loading;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet1);

        update = findViewById(R.id.button85);
        loading = findViewById(R.id.progressBar5);
        loading.setVisibility(View.GONE);

        Toolbar toolbar = findViewById(R.id.toolbarWallet1);
        toolbar.setTitle("Reset Wallet PIN");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbar);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownTimer timer = new CountDownTimer(2000,2000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        loading.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(getApplicationContext(),"Wallet PIN updated.",Toast.LENGTH_LONG).show();
                        Intent home = new Intent(wallet1.this, Settings.class);
                        startActivity(home);
                    }
                };
                timer.start();
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
            Intent settings = new Intent(wallet1.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(wallet1.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(wallet1.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}