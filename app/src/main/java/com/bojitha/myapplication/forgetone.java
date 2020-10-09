package com.bojitha.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgetone extends AppCompatActivity {
    Button btn;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_forgetone);

        btn = findViewById(R.id.forgetone);
        ed =findViewById(R.id.forgetpwtxt1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pw1 = ed.getText().toString();
                if(pw1.equals("")){
                    Toast.makeText(forgetone.this, "Please Fill All Feilds To Continue..", Toast.LENGTH_LONG).show();


                }else{

                    Intent ii = new Intent(forgetone.this,forgettwo.class);
                    startActivity(ii);
                }

            }
        });
    }
}