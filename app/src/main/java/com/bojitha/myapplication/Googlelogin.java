package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Googlelogin extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_googlelogin);



        ed1 = findViewById(R.id.unamezfbgoogle);
        ed2 = findViewById(R.id.pwzfbgoogle);
        b1 = findViewById(R.id.loginbtnfbgoogle);

        tv1 = findViewById(R.id.backbtnfbgoogle);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(Googlelogin.this,signin.class);
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

                    Toast.makeText(Googlelogin.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_LONG).show();
                } else if(b==false){

                    Toast.makeText(Googlelogin.this, "Invalid Email Address", Toast.LENGTH_LONG).show();
                }else if(uname.equals("bojitha@gmail.com") && pw.equals("123")){

                    Toast.makeText(Googlelogin.this, "Login Sucess", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Googlelogin.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();


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