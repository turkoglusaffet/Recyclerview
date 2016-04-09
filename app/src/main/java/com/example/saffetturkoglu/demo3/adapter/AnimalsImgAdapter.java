package com.example.saffetturkoglu.demo3.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saffetturkoglu.demo3.Object.AnimalsImgObject;
import com.example.saffetturkoglu.demo3.R;

import java.util.List;

/**
 * Created by saffet.turkoglu on 5.4.2016.
 */
public class AnimalsImgAdapter extends  RecyclerView.Adapter<AnimalsImgAdapter.AnimalsImgListRowHolder>{
    private List<AnimalsImgObject> AnimalsImgObjectList;
    private Activity mActivity;


    public AnimalsImgAdapter(Activity mActivity, List<AnimalsImgObject> AnimalsImgObjectList) {
        this.AnimalsImgObjectList = AnimalsImgObjectList;
        this.mActivity      = mActivity;
    }


    public AnimalsImgListRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_field_image, viewGroup, false);
        AnimalsImgListRowHolder holder = new AnimalsImgListRowHolder(v);
        return holder;
    }


    public void onBindViewHolder(AnimalsImgListRowHolder AnimalsImgListRowHolder, int i) {
        final AnimalsImgObject AnimalsImgObject = AnimalsImgObjectList.get(i);

    }

    @Override
    public int getItemCount() {
        return (null != AnimalsImgObjectList ? AnimalsImgObjectList.size() : 0);
    }

    public class AnimalsImgListRowHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected View mainContainer;

        public AnimalsImgListRowHolder(View view) {
            super(view);
            this.title          = (TextView) view.findViewById(R.id.title);
            this.mainContainer  = (View)view.findViewById(R.id.mainContainer);

        }

    }
}
