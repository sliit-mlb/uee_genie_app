package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Home;

public class signin extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);

        ed1 = findViewById(R.id.unamez);
        ed2 = findViewById(R.id.pwz);
        b1 = findViewById(R.id.loginbtn);
        tv1 = findViewById(R.id.fogetz);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signin.this,forgetone.class);
                startActivity(ii);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = ed1.getText().toString();
                String pw = ed2.getText().toString();

                if(uname.equals("bojitha") && pw.equals("123")){

                    Toast.makeText(signin.this, "Login Sucess", Toast.LENGTH_LONG).show();


                }else{
                    Toast.makeText(signin.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();



                }
                Intent ii = new Intent(signin.this, Home.class);
                startActivity(ii);
            }
        });



    }
}