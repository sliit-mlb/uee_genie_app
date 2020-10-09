package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class changepassword extends AppCompatActivity {
    Button btn;
    EditText ed1,ed2,ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_changepassword);

        btn = findViewById(R.id.changepw);
        ed1 =findViewById(R.id.currentpw);
        ed2 =findViewById(R.id.newpw1);
        ed3 =findViewById(R.id.newpw2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentpw = ed1.getText().toString();
                String newpw1 = ed2.getText().toString();
                String newpw2 = ed3.getText().toString();
                if(newpw1.equals("") || newpw2.equals("") || currentpw.equals("")){
                    Toast.makeText(changepassword.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_LONG).show();

                }else if(currentpw.equals("123")){

                    if(newpw1.equals(newpw2)){
                        Toast.makeText(changepassword.this, "Password Changed Sucessfuly", Toast.LENGTH_SHORT).show();
                        Intent ii = new Intent(changepassword.this,signin.class);
                        startActivity(ii);

                    }else{

                        Toast.makeText(changepassword.this, "Both passwords are not Matched", Toast.LENGTH_SHORT).show();

                    }
                }else{
                    Toast.makeText(changepassword.this, "Current Password is Incorrect", Toast.LENGTH_SHORT).show();


                }


            }
        });

    }
}