package com.mashup.noise.whitecomposer_android;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.mashup.noise.whitecomposer_android.ViewInfo.MainView;
import com.mashup.noise.whitecomposer_android.mypage.MyPageFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity
implements MyPageFragment.OnFragmentInteractionListener {

    private static final String TAG = "MainActivity";
    private ConstraintLayout mainLayout;

    /* Fragment */
    FragmentTransaction transaction;
    private MyPageFragment myPageFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainView mainView = new MainView(this);
        setSupportActionBar((BottomAppBar) findViewById(R.id.bottomBar));

        initFragment();
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
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.mainLayout, myPageFragment);

                break;
        }
        transaction.addToBackStack(null);
        transaction.commit();
        return true;
    }

    public void initFragment() {
        myPageFragment = new MyPageFragment();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
