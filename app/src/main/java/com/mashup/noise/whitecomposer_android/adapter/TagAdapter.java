package com.mashup.noise.whitecomposer_android.adapter;

import android.app.Activity;
import android.view.ViewGroup;

import com.mashup.noise.whitecomposer_android.Holder.TagHolder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TagAdapter extends CustomMusicRootAdapter {
    
    public TagAdapter(Activity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        TagHolder h = (TagHolder) viewHolder;
    }
}
