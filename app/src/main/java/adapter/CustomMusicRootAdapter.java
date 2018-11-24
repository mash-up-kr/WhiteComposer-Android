package adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

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
