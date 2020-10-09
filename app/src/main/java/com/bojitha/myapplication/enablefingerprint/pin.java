package com.bojitha.myapplication.enablefingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.bojitha.myapplication.signin;

public class pin extends AppCompatActivity {
  Button enable;
    EditText pin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);





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
}