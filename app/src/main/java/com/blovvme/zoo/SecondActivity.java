package com.blovvme.zoo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final String[] categoryItems = {"Ampibhians", "Birds", "Mammals", "Reptiles"};

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                categoryItems

        );

        listView.setAdapter(listViewAdapter);
        //To make the list clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("Category",categoryItems[i]);
                startActivity(intent);
            }
        });

    }////onCreate




}////last
