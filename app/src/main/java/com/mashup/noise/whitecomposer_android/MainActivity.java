package com.mashup.noise.whitecomposer_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mashup.noise.whitecomposer_android.DoRetrofit.RetrofitTestActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_go;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        moveToRetrofit();

    }

    private void moveToRetrofit() {
        i = new Intent(MainActivity.this, RetrofitTestActivity.class);

        btn_go = findViewById(R.id.gototest);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(i);

            }
        });
    }
}
