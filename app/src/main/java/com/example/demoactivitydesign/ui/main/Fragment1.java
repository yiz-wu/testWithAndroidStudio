package com.example.demoactivitydesign.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.demoactivitydesign.R;
import com.example.demoactivitydesign.adapter.MyAdapter;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    private static String TAG = "Fragment1";
    private ListView lv = null;

    private String _fasceOrarie[] = {"WORK", "STUDY"};
    private String _dettagli[] = {"9:00 - 15:00", "12:00 - 14:00"};
    private int _icon[] = {R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        lv = view.findViewById(R.id.lv);

        MyAdapter myAdapter = new MyAdapter(getContext(), _fasceOrarie, _dettagli, _icon);
        lv.setAdapter(myAdapter);
        Log.i(TAG, "in onCreateView");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "in onItemClick() with position = " + position + " , id = " + id);
                Toast.makeText(getContext(), "I AM " + _fasceOrarie[position] + "ING.", Toast.LENGTH_LONG).show();
            }
        });


//        ArrayList<String> list = new ArrayList();
//
//        list.add("ASD 1");
//        list.add("ASD 2");
//        list.add("ASD 3");
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1 ,list);
//
//        lv.setAdapter(arrayAdapter);


        return view;
    }



}
