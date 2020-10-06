package com.bojitha.myapplication.MakePayment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.bojitha.myapplication.R;

import java.util.ArrayList;
import java.util.List;

import static com.bojitha.myapplication.MakePayment.ItemAdapter.SPAN_COUNT_ONE;
import static com.bojitha.myapplication.MakePayment.ItemAdapter.SPAN_COUNT_THREE;

public class SelectBills extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;
    private GridLayoutManager gridLayoutManager;
    private List<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bills);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        initItemsData();

        gridLayoutManager = new GridLayoutManager(this, SPAN_COUNT_ONE);
        itemAdapter = new ItemAdapter(items, gridLayoutManager);
        recyclerView = (RecyclerView) findViewById(R.id.recyView);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initItemsData() {
        items = new ArrayList<>(4);
        items.add(new Item(R.drawable.dialog_logo, "My Dialgo Mobile", "0748523245"));
        items.add(new Item(R.drawable.ceb_logo, "My Home Elec Bill", "100120150160"));
        items.add(new Item(R.drawable.water_logo, "Water Bill", "8832145897"));
        items.add(new Item(R.drawable.dialog_logo, "Father Dialog", "0746885522"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}