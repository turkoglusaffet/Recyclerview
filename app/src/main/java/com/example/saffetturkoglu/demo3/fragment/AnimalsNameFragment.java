package com.example.saffetturkoglu.demo3.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saffetturkoglu.demo3.Object.AnimalsNameObject;
import com.example.saffetturkoglu.demo3.R;
import com.example.saffetturkoglu.demo3.adapter.AnimalsNameAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saffet.turkoglu on 5.4.2016.
 */
public class AnimalsNameFragment extends Fragment {

    private static final String TAG = AnimalsNameFragment.class.getSimpleName();

    private List<AnimalsNameObject> animalsNameObjectList = new ArrayList<>();
    private RecyclerView formsRecyclerView;
    private AnimalsNameAdapter adapter;
    public AnimalsNameFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animals_name, container, false);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        formsRecyclerView = (RecyclerView) view.findViewById(R.id.nameList);
        formsRecyclerView.setLayoutManager(mLayoutManager);
        formsRecyclerView.setHasFixedSize(true);
        adapter = new AnimalsNameAdapter(getActivity(),animalsNameObjectList);
        formsRecyclerView.setAdapter(adapter);
        AnimalsNameObject a = new AnimalsNameObject("asdsad");
        animalsNameObjectList.add(a);
        animalsNameObjectList.add(new AnimalsNameObject("basdsad"));
        updateTable(animalsNameObjectList);
        return view;
    }
    private void updateTable(List<AnimalsNameObject> list)
    {

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {

                adapter.notifyDataSetChanged();
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
