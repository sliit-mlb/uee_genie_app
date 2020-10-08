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

import com.bojitha.myapplication.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.TYPE;

public class SelectBills extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> items;
    private FloatingActionButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bills);

        next = findViewById(R.id.actionBtnNext);

        Toolbar toolbarForSelectBills = findViewById(R.id.bills_toolbar);
        toolbarForSelectBills.setTitle("Pay Bill");
        toolbarForSelectBills.setTitleTextColor(Color.parseColor("#ffffff"));
        setSupportActionBar(toolbarForSelectBills);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        TYPE = "allBills";
        gridLayoutManager = new GridLayoutManager(this, 1);
        itemAdapter = new ItemAdapter(items, gridLayoutManager);
        recyclerView = (RecyclerView) findViewById(R.id.recyView);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent verifyBills = new Intent(SelectBills.this,VerifyBills.class);
                startActivity(verifyBills);
            }
        });
    }

    private void initItemsData() {
        items = new ArrayList<>(4);
        items.add(new Item(R.drawable.dialog_logo, "My Dialog Mobile", "0748523245"));
        items.add(new Item(R.drawable.ceb_logo, "My Home Elec Bill", "100120150160"));
        items.add(new Item(R.drawable.water_logo, "Water Bill", "8832145897"));
        items.add(new Item(R.drawable.dialog_logo, "Father Dialog", "0746885522"));
    }
}