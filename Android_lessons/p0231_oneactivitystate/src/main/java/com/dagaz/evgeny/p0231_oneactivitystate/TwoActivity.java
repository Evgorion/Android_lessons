package com.dagaz.evgeny.p0231_oneactivitystate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class TwoActivity extends AppCompatActivity {
    final String TAG = "My_App";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "TwoActivity  onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "TwoActivity  onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "TwoActivity  onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "TwoActivity  onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "TwoActivity  onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "TwoActivity onDestroy()");
    }

}
