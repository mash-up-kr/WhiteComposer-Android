package com.mashup.noise.whitecomposer_android.ViewInfo;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mashup.noise.whitecomposer_android.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import androidx.constraintlayout.widget.ConstraintLayout;


public class MainView {
    private final String TAG = "MainView";
    private SlidingUpPanelLayout slidingUpPanelLayout;
    private ConstraintLayout mainLayout;
    private LinearLayout bottomLayout;
    private LinearLayout playerLayout;
    private int width, height;
    public MainView(Activity activity){
        getDeviceInfo(activity);
        mainLayout = activity.findViewById(R.id.mainLayout);
        playerLayout = activity.findViewById(R.id.player_lin);
        slidingUpPanelLayout = activity.findViewById(R.id.slideLayout);
        slidingUpPanelLayout.setPanelHeight(0);
        slidingUpPanelLayout.setShadowHeight(0);
        slidingUpPanelLayout.setCoveredFadeColor(0);
        slidingUpPanelLayout.setOverlayed(false);
        slidingUpPanelLayout.setParallaxOffset((int) (height*0.7));

        bottomLayout = activity.findViewById(R.id.bottomLayout);

        SlidingUpPanelLayout.LayoutParams p = (SlidingUpPanelLayout.LayoutParams) bottomLayout.getLayoutParams();
        p.height = (int) (height*0.7);

        FloatingActionButton fab = activity.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Collapsed -> Dragging -> Expanded
                // Expanded -> Dragging -> Collapsed
                SlidingUpPanelLayout.PanelState state = slidingUpPanelLayout.getPanelState();
                if (state == SlidingUpPanelLayout.PanelState.COLLAPSED) {
                    slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.EXPANDED);
                } else {
                    slidingUpPanelLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
                }

            }
        });

        slidingUpPanelLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {

            }

            @Override
            public void onPanelStateChanged(View panel,
                                            SlidingUpPanelLayout.PanelState previousState,
                                            SlidingUpPanelLayout.PanelState newState) {
                Log.i(TAG, "onPanelStateChanged: " + newState + " previousState:" + previousState);
                switch (newState) {
                    case COLLAPSED:
                        playerLayout.setVisibility(View.VISIBLE);
                        break;
                    case EXPANDED:
                        playerLayout.setVisibility(View.INVISIBLE);
                        break;
                }

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
