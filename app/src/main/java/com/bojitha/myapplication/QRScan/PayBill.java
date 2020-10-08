package com.bojitha.myapplication.QRScan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.MakePayment.Item;
import com.bojitha.myapplication.MakePayment.ItemAdapter;
import com.bojitha.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.TYPE;

public class PayBill extends AppCompatActivity {

    private EditText amount;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> itemList;
    private Button confirm;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bill);

        amount = findViewById(R.id.editTextNumber);
        confirm = findViewById(R.id.button2);
        loading = findViewById(R.id.progressBar4);
        loading.setVisibility(View.GONE);

        amount.setText("187.50");

        Toolbar toolbarForPayBill = findViewById(R.id.toolbarPayBill);
        toolbarForPayBill.setTitle("Pay Bill From QR");
        toolbarForPayBill.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForPayBill);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        TYPE = "selectWallet";

        gridLayoutManager = new GridLayoutManager(this, 1);
        itemAdapter = new ItemAdapter(itemList, gridLayoutManager);
        recyclerView = (RecyclerView) findViewById(R.id.recyView5);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CountDownTimer timer = new CountDownTimer(2000,2000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        loading.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(getApplicationContext(),"Payment Successfully completed.",Toast.LENGTH_LONG).show();
                        Intent home = new Intent(PayBill.this, Home.class);
                        startActivity(home);
                    }
                };
                timer.start();
            }
        });
    }

    private void initItemsData(){
        itemList = new ArrayList<>(2);
        itemList.add(new Item(R.drawable.atm_card, "My Commercial Card", "2534 2547 3256 2541"));
        itemList.add(new Item(R.drawable.bank_account, "Father BOC Account", "100120150160"));
    }
}