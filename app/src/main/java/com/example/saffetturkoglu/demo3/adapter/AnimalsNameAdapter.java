package com.example.saffetturkoglu.demo3.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saffetturkoglu.demo3.Object.AnimalsNameObject;
import com.example.saffetturkoglu.demo3.R;

import java.util.List;

/**
 * Created by saffet.turkoglu on 5.4.2016.
 */
public class AnimalsNameAdapter extends  RecyclerView.Adapter<AnimalsNameAdapter.AnimalsNameListRowHolder>{
    private List<AnimalsNameObject> animalsNameObjectList;
    private Activity mActivity;


    public AnimalsNameAdapter(Activity mActivity, List<AnimalsNameObject> animalsNameObjectList) {
        this.animalsNameObjectList = animalsNameObjectList;
        this.mActivity      = mActivity;
    }


    public AnimalsNameListRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_field_name, viewGroup, false);
        AnimalsNameListRowHolder holder = new AnimalsNameListRowHolder(v);
        return holder;
    }


    public void onBindViewHolder(AnimalsNameListRowHolder animalsNameListRowHolder, int i) {
        final AnimalsNameObject animalsNameObject = animalsNameObjectList.get(i);

        animalsNameListRowHolder.name.setText(animalsNameObject.getName());
    }

    @Override
    public int getItemCount() {
        return (null != animalsNameObjectList ? animalsNameObjectList.size() : 0);
    }

    public class AnimalsNameListRowHolder extends RecyclerView.ViewHolder {
        protected TextView name;
        protected View mainContainer;

        public AnimalsNameListRowHolder(View view) {
            super(view);
            this.name          = (TextView) view.findViewById(R.id.name);
            this.mainContainer  = (View)view.findViewById(R.id.mainContainer);

        }

    }
}
