package com.bojitha.myapplication.MakePayment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.bojitha.myapplication.R;

import java.util.ArrayList;

public class SelectBills extends AppCompatActivity {

    private ArrayList<String> billersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_bills);
    }

    private void loadBillers(View view){
        GridView billersGrid = (GridView)findViewById(R.id.grid_view);
        billersList = new ArrayList<>();
        for (int i=1;i<=20;i++){
            billersList.add("Biller "+i);
        }

    }
}