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
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.billertype.billertypehome;
import com.bojitha.myapplication.signin;

public class pin extends AppCompatActivity {
  Button enable;
    EditText pin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);


        Toolbar bankToolbar = findViewById(R.id.toolbarPIN);
        bankToolbar.setTitle("Fingerprint");
        bankToolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(bankToolbar);



        pin = findViewById(R.id.editTextNumber);
        enable = findViewById(R.id.button6);

        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String uname = pin.getText().toString();
               // String pw = ed2.getText().toString();

                if(uname.equals("1234") ){

                    Toast.makeText(pin.this, "PIN Correct", Toast.LENGTH_LONG).show();
                    Intent ii = new Intent(pin.this, Touch.class);
                    startActivity(ii);

                }else{
                    Toast.makeText(pin.this, "Invalid Pin", Toast.LENGTH_LONG).show();



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
            Intent settings = new Intent(pin.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(pin.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(pin.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}