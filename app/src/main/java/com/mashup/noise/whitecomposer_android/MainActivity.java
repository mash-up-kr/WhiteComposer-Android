package com.mashup.noise.whitecomposer_android;

import android.os.Bundle;

import com.mashup.noise.whitecomposer_android.ViewInfo.MainView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainView mainView = new MainView(this);
    }
}
