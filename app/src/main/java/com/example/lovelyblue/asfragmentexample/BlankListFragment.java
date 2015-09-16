package com.example.lovelyblue.asfragmentexample;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.zip.Inflater;


/**
 * A simple {@link ListFragment} subclass.
 */
public class BlankListFragment extends Fragment {

    public LayoutInflater layoutInflater;

    public BlankListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),android.R
//                .layout.simple_list_item_1,
//                getResources().getStringArray(R.array.string_list_array));
//        setListAdapter(adapter);
//        layoutInflater = inflater;
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_list, container, false);

    }

    @Override
    public void onResume() {
        super.onResume();
//        layoutInflater.getContext();
    }
}
