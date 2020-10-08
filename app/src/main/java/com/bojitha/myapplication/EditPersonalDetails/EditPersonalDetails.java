package com.bojitha.myapplication.EditPersonalDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.MakePayment.ConfirmBill;
import com.bojitha.myapplication.R;

public class EditPersonalDetails extends AppCompatActivity {

    private EditText fName, lName, dob, address, email;
    private Button btnSave;
    ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_details);

        fName = findViewById(R.id.editTxtFirstName);
        lName = findViewById(R.id.editTxtLastName);
        dob = findViewById(R.id.editTxtDob);
        address = findViewById(R.id.editTxtPerAddress);
        email = findViewById(R.id.editTxtEmailAddress);
        btnSave = findViewById(R.id.btnEditSave);
        loading = findViewById(R.id.progressBar3);
        loading.setVisibility(View.GONE);

        Toolbar toolbarForEditPersonalDetails = findViewById(R.id.editPersonalDetailsToolbar);
        setSupportActionBar(toolbarForEditPersonalDetails);

        fName.setText("Nuwan");
        lName.setText("Perera");
        dob.setText("1987-12-12");
        address.setText("56, Mian Road,\nNawala,\nKattukurundha.");
        email.setText("nuwan87@gmail.com");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!email.getText().toString().equals("nuwan87@gmail.com")){
                    Intent otp = new Intent(EditPersonalDetails.this,OtpForEditPersonalDetails.class);
                    startActivity(otp);
                }else{
                    CountDownTimer timer = new CountDownTimer(2000,2000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            loading.setVisibility(View.VISIBLE);
                        }

                        @Override
                        public void onFinish() {
                            Toast.makeText(getApplicationContext(),"Personal Details Updated",Toast.LENGTH_LONG).show();
                            Intent home = new Intent(EditPersonalDetails.this, Home.class);
                            startActivity(home);
                        }
                    };
                    timer.start();
                }
            }
        });
    }
}