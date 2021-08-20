package com.example.android1lesson5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.rv);
         adapter = new MainAdapter();


         recyclerView.setAdapter(adapter);

         RecyclerView.LayoutManager manager =
                 new LinearLayoutManager(
                         this , LinearLayoutManager.HORIZONTAL ,
                         false);

            recyclerView.setLayoutManager(manager);

            ArrayList<ItemModel> list = new ArrayList<>();
            list.add(0, new ItemModel("Kairat" ,R.drawable.ic_launcher_background));
            list.add(0, new ItemModel("Kairat" ,R.drawable.ic_launcher_background));
            list.add(0, new ItemModel("Kairat" ,R.drawable.ic_launcher_background));
            list.add(0, new ItemModel("Kairat" ,R.drawable.ic_launcher_background));
            list.add(0, new ItemModel("Kairat" ,R.drawable.ic_launcher_background));
            adapter.addText(list);
    }
}