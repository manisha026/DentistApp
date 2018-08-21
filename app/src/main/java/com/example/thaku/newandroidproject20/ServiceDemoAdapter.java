package com.example.thaku.newandroidproject20;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ServiceDemoAdapter extends RecyclerView.Adapter{



        Context context;
        ArrayList<ServiceModelClass> data;

    public ServiceDemoAdapter(Context context, ArrayList < ServiceModelClass > data)
        {

            this.context = context;
            this.data = data;
            //super(context);
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType)
        {
            MyViewHolder holder = new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.services_items, parent, false));

            return holder;
        }

        @Override
        public void onBindViewHolder (@NonNull RecyclerView.ViewHolder holder,int position)
        {

            MyViewHolder myViewHolder = (MyViewHolder) holder;


            myViewHolder.serviceName.setText(data.get(position).getServiceName());
            myViewHolder.serviceCost.setText(data.get(position).getServiceCost());
            myViewHolder.serviceMore.setImageResource(data.get(position).getServiceMore());

        }

        @Override
        public int getItemCount ()
        {

            return data.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            TextView serviceName, serviceCost;
            ImageView serviceMore;

            public MyViewHolder(View itemView) {
                super(itemView);
                serviceName = itemView.findViewById(R.id.serviceName);
                serviceCost = itemView.findViewById(R.id.serviceCost);
                serviceMore = itemView.findViewById(R.id.serviceMore);
            }
        }
    }