package com.example.materialdesignspeech.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.materialdesignspeech.R;

public class OrderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate){
        return inflater.inflate(R.layout.order_fragment_layout, container, false);
    }
}
