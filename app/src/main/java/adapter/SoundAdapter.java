package adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import Holder.SoundHolder;
import Holder.TagHolder;

public class SoundAdapter extends CustomMusicRootAdapter{
    public SoundAdapter(Activity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        SoundHolder h = (SoundHolder) viewHolder;
    }
}
