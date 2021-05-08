package com.geek.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    Adapter adapter;
    List<cttd> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new cttd("1", "jlnv", "jldvh", "541654"));
        list.add(new cttd("2", "jlnv", "jldvh", "541654"));
        list.add(new cttd("3", "jlnv", "jldvh", "541654"));
        list.add(new cttd("4", "jlnv", "jldvh", "541654"));
        list.add(new cttd("5", "jlnv", "jldvh", "541654"));
        list.add(new cttd("6", "jlnv", "jldvh", "541654"));
        list.add(new cttd("7", "jlnv", "jldvh", "541654"));
        list.add(new cttd("8", "jlnv", "jldvh", "541654"));
        initRecycler();
    }

    private void initRecycler() {
        rv = findViewById(R.id.recycler);
        adapter = new Adapter();
        rv.setAdapter(adapter);
        adapter.setData(list);
    }
}