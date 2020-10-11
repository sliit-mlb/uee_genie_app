package com.bojitha.myapplication.MakePayment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bojitha.myapplication.Common.Settings;
import com.bojitha.myapplication.Home.Billers;
import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.TYPE;

public class SelectWallet extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> itemList;
    private FloatingActionButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_wallet);

        next = findViewById(R.id.actBtnNext);

        Toolbar toolbarForSelectWallet = findViewById(R.id.select_wallet_toolbar);
        toolbarForSelectWallet.setTitle("Pay Bill");
        toolbarForSelectWallet.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForSelectWallet);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        TYPE = "selectWallet";

        gridLayoutManager = new GridLayoutManager(this, 1);
        itemAdapter = new ItemAdapter(itemList, gridLayoutManager);
        recyclerView = (RecyclerView) findViewById(R.id.recyView3);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmBill = new Intent(SelectWallet.this,ConfirmBill.class);
                startActivity(confirmBill);
            }
        });
    }

    private void initItemsData(){
        itemList = new ArrayList<>(2);
        itemList.add(new Item(R.drawable.atm_card, "My Commercial Card", "2534 2547 3256 2541"));
        itemList.add(new Item(R.drawable.bank_account, "Father BOC Account", "100120150160"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_items, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.toolSettings){
            Intent settings = new Intent(SelectWallet.this, Settings.class);
            startActivity(settings);
            return true;
        }else if(item.getItemId() == R.id.toolLogout){
            Intent signin = new Intent(SelectWallet.this, com.bojitha.myapplication.signin.class);
            startActivity(signin);
            return true;
        }else if(item.getItemId() == R.id.toolHistory){
            Intent history = new Intent(SelectWallet.this, com.bojitha.myapplication.Purchase.history.class);
            startActivity(history);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}