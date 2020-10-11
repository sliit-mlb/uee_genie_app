package com.bojitha.myapplication.MakePayment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.Home.Home;
import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.TYPE;

public class ConfirmBill extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> itemList;
    private Button confirm;
    private ProgressBar loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_bill);

        confirm = findViewById(R.id.btnConfirm);
        loading = findViewById(R.id.progressBar);
        loading.setVisibility(View.GONE);

        Toolbar toolbarForConfirmBill = findViewById(R.id.confirmBillToolbar);
        toolbarForConfirmBill.setTitle("Pay Bill");
        toolbarForConfirmBill.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForConfirmBill);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        TYPE = "confirmBill";

        gridLayoutManager = new GridLayoutManager(this, 1);
        itemAdapter = new ItemAdapter(itemList, gridLayoutManager);
        recyclerView = (RecyclerView) findViewById(R.id.recyView4);
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
                        Intent home = new Intent(ConfirmBill.this, Home.class);
                        startActivity(home);
                    }
                };
                timer.start();
            }
        });
    }

    private void initItemsData(){
        itemList = new ArrayList<>(1);
        itemList.add(new Item(R.drawable.atm_card, "My Commercial Card", "2534 2547 3256 2541"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.toolSettings){
            Intent settings = new Intent(ConfirmBill.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(ConfirmBill.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(ConfirmBill.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}