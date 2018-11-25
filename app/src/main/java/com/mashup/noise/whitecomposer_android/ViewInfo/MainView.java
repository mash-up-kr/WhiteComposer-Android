package com.mashup.noise.whitecomposer_android.ViewInfo;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.mashup.noise.whitecomposer_android.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

public class MainView {
    private SlidingUpPanelLayout slidingUpPanelLayout;
    private FrameLayout bottomLayout, mainLayout;
    private int width, height;
    public MainView(Activity activity){
        getDeviceInfo(activity);
        mainLayout = activity.findViewById(R.id.mainLayout);
        slidingUpPanelLayout = activity.findViewById(R.id.slideLayout);
        slidingUpPanelLayout.setPanelHeight(0);
        slidingUpPanelLayout.setShadowHeight(0);
        slidingUpPanelLayout.setCoveredFadeColor(0);
        slidingUpPanelLayout.setOverlayed(false);
        slidingUpPanelLayout.setParallaxOffset((int) (height*0.7));

        bottomLayout = activity.findViewById(R.id.bottomLayout);

        SlidingUpPanelLayout.LayoutParams p = (SlidingUpPanelLayout.LayoutParams) bottomLayout.getLayoutParams();
        p.height = (int) (height*0.7);

        Button testButton = activity.findViewById(R.id.testButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
            }
        });

    }
    private void getDeviceInfo(Activity activity){
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        width = displayMetrics.widthPixels;
        height = displayMetrics.heightPixels;
    }

    public SlidingUpPanelLayout getSlidingUpPanelLayout() {
        return slidingUpPanelLayout;
    }
}
