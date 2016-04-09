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

import com.example.saffetturkoglu.demo3.R;

/**
 * Created by saffet.turkoglu on 5.4.2016.
 */
public class AnimalsImageFragment extends Fragment{

    private static final String TAG = AnimalsImageFragment.class.getSimpleName();

    public AnimalsImageFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animals_image, container, false);

        return view;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
