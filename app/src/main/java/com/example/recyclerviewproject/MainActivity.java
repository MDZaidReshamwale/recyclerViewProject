package com.example.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
//    RecyclerView recyclerView;
//    LinearLayoutManager layoutManager;
//    List<ModelClass> userList;
//    Adapter adapter;
//



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView userList = (RecyclerView) findViewById(R.id.userList);
        userList.setLayoutManager(new LinearLayoutManager(this));
        String[] users = {"Ravi","Zaid"};
        userList.setAdapter(new UserAdapter(users));
//        initData();
//        InitRecyclerView();


    }
    }

//    private void InitRecyclerView() {
//        recyclerView=findViewById(R.id.recyclerView);
//        layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter=new Adapter(userList);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();
//
//
//
//
//    }
//
//    private void initData() {
//        userList=new ArrayList<>();
//
//        userList.add(new ModelClass(R.drawable.ic_launcher_background,"Ravikumar","12:55 am",
//                "how r u?","--------------------"));
//        userList.add(new ModelClass(R.drawable.ic_launcher_background,"Ravikumar","12:55 am",
//                "how r u?","--------------------"));
//
//    }
//}