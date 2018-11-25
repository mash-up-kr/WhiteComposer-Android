package com.mashup.noise.whitecomposer_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mashup.noise.whitecomposer_android.ViewInfo.MainView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainView mainView = new MainView(this);
    }
}
