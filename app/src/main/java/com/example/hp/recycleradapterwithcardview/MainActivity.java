package com.example.hp.recycleradapterwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
List<Orders> orderList;
OrderAdapter orderAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.product_list);
        recyclerView.hasFixedSize();

        orderList = new ArrayList<>();
        orderAdapter = new OrderAdapter(this,orderList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(orderAdapter);

        prepareOrders();

    }

    public void prepareOrders(){
        for(int i=0;i<10;i++){
            Orders orders= new Orders(R.mipmap.ic_launcher,"Order_no","description","date","time");
            orderList.add(orders);
        }
    }
}
