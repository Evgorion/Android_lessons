package com.dagaz.evgeny.p0261_intentfilter;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.time_button);
        btnDate = (Button) findViewById(R.id.date_button);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.time_button:
                intent = new Intent("com.dagaz.evgeny.showtime");
                startActivity(intent);
                break;
            case R.id.date_button:
                intent = new Intent("com.dagaz.evgeny.showdate");
                startActivity(intent);
                break;
        }
    }
}
