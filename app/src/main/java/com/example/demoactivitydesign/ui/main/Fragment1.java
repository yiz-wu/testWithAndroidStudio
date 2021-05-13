package com.example.demoactivitydesign.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demoactivitydesign.R;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    private ListView lv = null;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        lv = view.findViewById(R.id.lv);

        ArrayList<String> list = new ArrayList();

        list.add("ASD 1");
        list.add("ASD 2");
        list.add("ASD 3");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1 ,list);

        lv.setAdapter(arrayAdapter);


        return view;
    }



}
