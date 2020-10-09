package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2,ed3,ed4;
    CheckBox chk;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_signup);


        ed1 = findViewById(R.id.unamezsignin);
        ed2 = findViewById(R.id.emzsignin);
        ed3 = findViewById(R.id.pwzsignin);
        ed4 = findViewById(R.id.pw2zsignin);
        chk = findViewById(R.id.chkboz);
        tv = findViewById(R.id.txtviez);

        b1 = findViewById(R.id.signupbtnz);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii = new Intent(signup.this,signin.class);
                startActivity(ii);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed1.getText().toString();
                String s2 = ed2.getText().toString();
                String s3 = ed3.getText().toString();
                String s4 = ed4.getText().toString();
                if(s1.equals("") || s2.equals("") || s3.equals("")|| s4.equals("")){
                    Toast.makeText(signup.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_LONG).show();


                }else if(!(chk.isChecked())){

                    Toast.makeText(signup.this, "Please Agree To Licence And Tearms..", Toast.LENGTH_LONG).show();

                }else if(!(s3.equals(s4))){
                    Toast.makeText(signup.this, "Password Doesn't Matched.!", Toast.LENGTH_LONG).show();
                    Intent ii = new Intent(signup.this,signin.class);
                    startActivity(ii);
                }else{
                    Toast.makeText(signup.this, "Account Created Sucessfull..!", Toast.LENGTH_LONG).show();
                    Intent ii = new Intent(signup.this,signin.class);
                    startActivity(ii);
                }
            }
        });

    }
}