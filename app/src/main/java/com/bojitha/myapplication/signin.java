package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Home;

public class signin extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    TextView tv1,tv2;
    ImageView fb,google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);

        ed1 = findViewById(R.id.unamez);
        ed2 = findViewById(R.id.pwz);
        b1 = findViewById(R.id.loginbtn);
        tv1 = findViewById(R.id.fogetz);
        tv2 = findViewById(R.id.gotozx);

        fb = findViewById(R.id.loginfb);
        google = findViewById(R.id.logingoogle);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signin.this,FbLogin.class);
                startActivity(ii);
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signin.this,Googlelogin.class);
                startActivity(ii);
            }
        });


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signin.this,forgetone.class);
                startActivity(ii);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signin.this,signup.class);
                startActivity(ii);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = ed1.getText().toString();
                String pw = ed2.getText().toString();

                boolean b = valiDateEmai(uname);
                if(uname.equals("") || pw.equals("")){

                    Toast.makeText(signin.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_LONG).show();
                } else if(b==false){
                    Toast.makeText(signin.this, "Login Sucess", Toast.LENGTH_LONG).show();

                    Intent home = new Intent(signin.this, Home.class);
                    startActivity(home);
                }else if(uname.equals("bojitha") && pw.equals("123")){
                    Toast.makeText(signin.this, "Login Sucess", Toast.LENGTH_LONG).show();

                    Intent home = new Intent(signin.this, Home.class);
                    startActivity(home);
                }else{
                    Toast.makeText(signin.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();


                }
            }
        });



    }
    public static boolean valiDateEmai(String s){
        boolean b;
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        if(s.matches(emailPattern)){
            b=true;
        }else{

            b=false;
        }
        return b;
    }
}