package com.example.recycularviewhomework.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycularviewhomework.R;
import com.example.recycularviewhomework.models.App;

import java.util.ArrayList;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.ViewHolderClass> {
    ArrayList<App> appList;
    Activity activity;

    public AppAdapter(ArrayList<App> appList, Activity activity) {
        this.appList = appList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AppAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app,parent,false);
        return new ViewHolderClass(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull AppAdapter.ViewHolderClass holder, int position) {
        holder.serial_number.setText(appList.get(position).getSerial_number());
        holder.app_icon.setImageResource(appList.get(position).getApp_icon());
        holder.app_name.setText(appList.get(position).getApp_name());
        holder.app_category.setText(appList.get(position).getApp_category());
        holder.app_rate.setText(appList.get(position).getApp_rate());
        holder.app_size.setText(appList.get(position).getApp_size());
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public TextView serial_number,app_name,app_category,app_rate,app_size;
        public ImageView app_icon;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            serial_number = itemView.findViewById(R.id.serial_number);
            app_icon = itemView.findViewById(R.id.app_icon);
            app_name = itemView.findViewById(R.id.app_name);
            app_category = itemView.findViewById(R.id.app_category);
            app_rate = itemView.findViewById(R.id.app_rate);
            app_size = itemView.findViewById(R.id.app_size);

        }
    }
}