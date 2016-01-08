package com.dagaz.evgeny.p0281_intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView tvView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        tvView = (TextView) findViewById(R.id.textView);
        intent = getIntent();
        String youName = intent.getStringExtra("name");
        tvView.setText(youName);
    }
}
