package com.dagaz.evgeny.p0102_activitylistener;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    TextView tvView;
    Button btnOK;
    Button btnCancel;
    private static final String TAG = "p0102";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvView = (TextView) findViewById(R.id.tvView);
        btnOK = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.Cancel);
//
        btnOK.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOK:
                tvView.setText("This is OK");
                Log.d(TAG, "This is OK");
                break;
            case R.id.Cancel:
                tvView.setText("This is Cancel");
                Log.d(TAG, "This is Cancel");
                break;
        }

    }
}
