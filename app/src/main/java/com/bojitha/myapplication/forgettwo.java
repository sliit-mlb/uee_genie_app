package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgettwo extends AppCompatActivity {
    Button btn;
    EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_forgettwo);

        btn = findViewById(R.id.forgettwo);
        ed1 = findViewById(R.id.newpwforget1);
        ed2 = findViewById(R.id.newpwforget2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pw1= ed1.getText().toString();
                String pw2= ed2.getText().toString();
                if(pw1.equals("") || pw2.equals("")){
                    Toast.makeText(forgettwo.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_SHORT).show();


                }else if(!(pw1.equals(pw2))){
                    Toast.makeText(forgettwo.this, "Password are Doesnot Match..", Toast.LENGTH_SHORT).show();


                }else{
                    Toast.makeText(forgettwo.this, "Password Changed Sucessfuly", Toast.LENGTH_SHORT).show();
                    Intent ii = new Intent(forgettwo.this,signin.class);
                    startActivity(ii);

                }

            }
        });
    }
}