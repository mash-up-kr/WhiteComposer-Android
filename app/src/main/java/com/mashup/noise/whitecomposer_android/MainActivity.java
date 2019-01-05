package com.mashup.noise.whitecomposer_android;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.mashup.noise.whitecomposer_android.ViewInfo.MainView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainView mainView = new MainView(this);
        setSupportActionBar((BottomAppBar) findViewById(R.id.bottomBar));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Log.d(TAG, "onOptionsItemSelected: home");
                Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_feed:
                Log.d(TAG, "onOptionsItemSelected: feed");
                Toast.makeText(this, "feed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_my:
                Log.d(TAG, "onOptionsItemSelected: myPage");
                Toast.makeText(this, "my page", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
