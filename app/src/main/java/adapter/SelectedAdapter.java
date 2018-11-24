package adapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import Holder.SelectedHolder;
import Holder.TagHolder;

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
