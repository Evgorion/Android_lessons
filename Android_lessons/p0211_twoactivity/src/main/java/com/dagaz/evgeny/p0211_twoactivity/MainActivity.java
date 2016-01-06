package com.dagaz.evgeny.p0211_twoactivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends Activity implements View.OnClickListener{

    Button btnOpenTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenTwo = (Button) findViewById(R.id.button);
        btnOpenTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
/*                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);*/

                break;
            default:
                break;
        }
    }
}
