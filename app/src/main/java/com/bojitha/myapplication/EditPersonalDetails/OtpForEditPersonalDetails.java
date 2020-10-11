package com.bojitha.myapplication.EditPersonalDetails;

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
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.MakePayment.ConfirmBill;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.billertype.billertypehome;

public class OtpForEditPersonalDetails extends AppCompatActivity {

    private EditText otp;
    private Button confirm, cancel;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_for_edit_personal_details);

        otp = findViewById(R.id.editTxtOtp);
        confirm = findViewById(R.id.btnConfirmOTP);
        cancel = findViewById(R.id.btnCancalOTP);
        loading = findViewById(R.id.progressBar2);
        loading.setVisibility(View.GONE);

        Toolbar otpToolbar = findViewById(R.id.otpEditToolbar);
        otpToolbar.setTitle("Edit Personal Details");
        otpToolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(otpToolbar);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Update Cancel",Toast.LENGTH_SHORT).show();
                Intent home = new Intent(OtpForEditPersonalDetails.this, Settings.class);
                startActivity(home);
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!otp.getText().toString().equals("")) {
                    CountDownTimer timer = new CountDownTimer(2000, 2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            loading.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(getApplicationContext(), "Personal Details Updated", Toast.LENGTH_LONG).show();
                            Intent home = new Intent(OtpForEditPersonalDetails.this, Settings.class);
                            startActivity(home);
                        }
                    };
                    timer.start();
                }else {
                    Toast.makeText(getApplicationContext(), "OTP cannot be null", Toast.LENGTH_SHORT).show();
                }
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
            Intent settings = new Intent(OtpForEditPersonalDetails.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(OtpForEditPersonalDetails.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(OtpForEditPersonalDetails.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}