package com.dagaz.evgeny.p0101_listener;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btnOK;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
        tvOut = (TextView)findViewById(R.id.tvView);
        btnOK = (Button)findViewById(R.id.btnOK);
        btnCancel = (Button)findViewById(R.id.btnCancel);
//
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btnOK:
                        tvOut.setText("This is OK");
                        break;
                    case R.id.btnCancel:
                        tvOut.setText("This is Cancel");
                        break;
                }


            }
        };
        btnOK.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
    }
}
