package com.mashup.noise.whitecomposer_android.adapter;

import android.app.Activity;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public abstract class CustomMusicRootAdapter extends RecyclerView.Adapter{
    private Activity activity;
    ArrayList list = new ArrayList();

    public CustomMusicRootAdapter(Activity activity) {
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addAll(ArrayList list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
}
