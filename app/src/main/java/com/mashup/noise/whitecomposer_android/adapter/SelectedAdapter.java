package com.mashup.noise.whitecomposer_android.adapter;

import android.app.Activity;
import android.view.ViewGroup;

import com.mashup.noise.whitecomposer_android.Holder.SelectedHolder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectedAdapter extends CustomMusicRootAdapter {

    public SelectedAdapter(Activity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public SelectedHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SelectedHolder(null);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        SelectedHolder h = (SelectedHolder) viewHolder;
    }
}
