package com.dagaz.evgeny.p0271_getintentaction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.button_time);
        btnDate = (Button) findViewById(R.id.button_date);
        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()){
            case R.id.button_time:
                intent = new Intent("com.dagaz.evgeny.showtime");
                startActivity(intent);
                break;
            case R.id.button_date:
                intent = new Intent("com.dagaz.evgeny.showdate");
                startActivity(intent);
                break;
        }

    }
}
