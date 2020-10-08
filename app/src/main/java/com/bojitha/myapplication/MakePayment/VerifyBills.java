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
import android.view.View;
import android.widget.TextView;

import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.TYPE;

public class VerifyBills extends AppCompatActivity {

    private RecyclerView recyclerView1;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager1;
    private List<Item> itemList;
    private FloatingActionButton next1;
    public static TextView amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_bills);

        next1 = findViewById(R.id.actionBtnNext1);
        amt = findViewById(R.id.txtAmount);

        Toolbar toolbarForVerifyBills = findViewById(R.id.verify_bills_toolbar);
        toolbarForVerifyBills.setTitle("Pay Bill");
        toolbarForVerifyBills.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForVerifyBills);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        TYPE = "verifyBills";

        gridLayoutManager1 = new GridLayoutManager(this, 1);
        itemAdapter = new ItemAdapter(itemList, gridLayoutManager1);
        recyclerView1 = (RecyclerView) findViewById(R.id.recyView2);
        recyclerView1.setAdapter(itemAdapter);
        recyclerView1.setLayoutManager(gridLayoutManager1);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectWallet = new Intent(VerifyBills.this,SelectWallet.class);
                startActivity(selectWallet);
            }
        });

    }

    private void initItemsData() {
        itemList = new ArrayList<>(2);
        itemList.add(new Item(R.drawable.dialog_logo, "My Dialog Mobile", "0748523245"));
        itemList.add(new Item(R.drawable.ceb_logo, "My Home Elec Bill", "100120150160"));
    }
}