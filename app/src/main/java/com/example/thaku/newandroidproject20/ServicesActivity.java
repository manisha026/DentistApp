package com.example.thaku.newandroidproject20;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class ServicesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ServiceModelClass> data=new ArrayList<>();
    FloatingActionButton fabAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        recyclerView=findViewById(R.id.recyclerView);
        fabAdd=findViewById(R.id.fabAdd);

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ServicesActivity.this,AddServiceActivity.class);
                startActivity(intent);
            }
        });



        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        ServiceModelClass modelClass=new ServiceModelClass();
        ServiceModelClass modelClass1=new ServiceModelClass();
        ServiceModelClass modelClass2=new ServiceModelClass();
        ServiceModelClass modelClass3=new ServiceModelClass();
        ServiceModelClass modelClass4=new ServiceModelClass();
        ServiceModelClass modelClass5=new ServiceModelClass();
        ServiceModelClass modelClass6=new ServiceModelClass();
        ServiceModelClass modelClass7=new ServiceModelClass();
        ServiceModelClass modelClass8=new ServiceModelClass();
        ServiceModelClass modelClass9=new ServiceModelClass();
        ServiceModelClass modelClass10=new ServiceModelClass();
        ServiceModelClass modelClass11=new ServiceModelClass();

//        modelClass.serviceName("RCT");
//        modelClass.serviceCost("5000");
//        modelClass.serviceMore(R.drawable.more_option);
//
//        modelClass1.serviceName("RCT");
//        modelClass1.serviceCost("5000");
//        modelClass1.serviceMore(R.drawable.more_option);
//
//        modelClass2.serviceName("RCT");
//        modelClass2.serviceCost("5000");
//        modelClass2.serviceMore(R.drawable.more_option);
//
//        modelClass3.serviceName("RCT");
//        modelClass3.serviceCost("5000");
//        modelClass3.serviceMore(R.drawable.more_option);
//
//        modelClass4.serviceName("RCT");
//        modelClass4.serviceCost("5000");
//        modelClass4.serviceMore(R.drawable.more_option);
//
//        modelClass.serviceName("RCT");
//        modelClass.serviceCost("5000");
//        modelClass.serviceMore(R.drawable.more_option);
//
//        modelClass1.serviceName("RCT");
//        modelClass1.serviceCost("5000");
//        modelClass1.serviceMore(R.drawable.more_option);
//
//        modelClass2.serviceName("RCT");
//        modelClass2.serviceCost("5000");
//        modelClass2.serviceMore(R.drawable.more_option);
//
//        modelClass3.serviceName("RCT");
//        modelClass3.serviceCost("5000");
//        modelClass3.serviceMore(R.drawable.more_option);
//
//        modelClass4.serviceName("RCT");
//        modelClass4.serviceCost("5000");
//        modelClass4.serviceMore(R.drawable.more_option);
//
//        modelClass.serviceName("RCT");
//        modelClass.serviceCost("5000");
//        modelClass.serviceMore(R.drawable.more_option);
//
//        modelClass1.serviceName("RCT");
//        modelClass1.serviceCost("5000");
//        modelClass1.serviceMore(R.drawable.more_option);
//
//        modelClass2.serviceName("RCT");
//        modelClass2.serviceCost("5000");
//        modelClass2.serviceMore(R.drawable.more_option);
//
//        modelClass3.serviceName("RCT");
//        modelClass3.serviceCost("5000");
//        modelClass3.serviceMore(R.drawable.more_option);
//
//        modelClass4.serviceName("RCT");
//        modelClass4.serviceCost("5000");
//        modelClass4.serviceMore(R.drawable.more_option);

        data.add(modelClass);
        data.add(modelClass1);
        data.add(modelClass2);
        data.add(modelClass3);
        data.add(modelClass4);
        data.add(modelClass5);
        data.add(modelClass6);
        data.add(modelClass7);
        data.add(modelClass8);
        data.add(modelClass9);
        data.add(modelClass10);
        data.add(modelClass11);


        ServiceDemoAdapter demoAdapter=new ServiceDemoAdapter(ServicesActivity.this,data);
        recyclerView.setAdapter(demoAdapter);



    }
}
