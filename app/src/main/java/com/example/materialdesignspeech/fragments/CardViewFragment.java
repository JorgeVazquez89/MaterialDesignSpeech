package com.example.materialdesignspeech.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.materialdesignspeech.R;
import com.example.materialdesignspeech.adapters.Adapter;
import com.example.materialdesignspeech.classes.Data;
import java.util.ArrayList;

public class CardViewFragment extends Fragment {

    private ArrayList<Data> dataList;
    private Context context;
    private RecyclerView recyclerView;

    public CardViewFragment(Context context){
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate) {
        View view = inflater.inflate(R.layout.cardview_fragment_layout, container, false);
        this.dataList = new ArrayList<>();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerCardView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        initList();
        Adapter adapter = new Adapter(dataList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    public void initList(){
        int[] imageIds = getImageIdsArray();
        String[] titles = getTitlesArray();
        String[] descriptions = getDescriptionsArray();
        String[] prices = getPricesArray();
        setDataList(imageIds,titles,descriptions,prices);
    }

    public int[] getImageIdsArray() {
        int[] images = {
                R.drawable.michel_extreme_bullhouse_300x200,
                R.drawable.gegios_texas_bbq_300x200,
                R.drawable.jaszis_curry_master_rice_300x200,
                R.drawable.kai_sushimaster_300x200
        };
        return images;
    }

    public String[] getTitlesArray() {
        return getResources().getStringArray(R.array.titles);
    }

    public String[] getDescriptionsArray() {
        return getResources().getStringArray(R.array.descriptions);
    }

    public String[] getPricesArray() {
        return getResources().getStringArray(R.array.prices);
    }

    public void setDataList(int[] imageIds, String[] titles, String[]descriptions , String[] prices){
        for(int i=0; i<imageIds.length; i++){
            this.dataList.add(new Data (imageIds[i],titles[i],descriptions[i],prices[i]));
        }
    }
}
