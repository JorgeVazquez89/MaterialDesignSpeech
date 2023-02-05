package com.example.materialdesignspeech.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesignspeech.classes.Data;
import com.example.materialdesignspeech.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.DataViewHolder> {

    private ArrayList<Data> dataList;

    public Adapter(@NonNull ArrayList<Data> dataList) {
        this.dataList = dataList;
    }
    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout,null,false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position){
        holder.cardImage.setImageResource(dataList.get(position).getImageId());
        holder.cardTitle.setText(dataList.get(position).getTitle());
        holder.cardDescription.setText(dataList.get(position).getDescription());
        holder.cardPrice.setText(dataList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImage;
        TextView cardTitle;
        TextView cardDescription;
        TextView cardPrice;

        public DataViewHolder(View itemView){
            super(itemView);
            cardImage = (ImageView) itemView.findViewById(R.id.cardViewImage);
            cardTitle = (TextView) itemView.findViewById(R.id.cardViewTitle);
            cardDescription = (TextView) itemView.findViewById(R.id.cardViewDescription);
            cardPrice = (TextView) itemView.findViewById(R.id.cardViewPrice);
        }
    }
}