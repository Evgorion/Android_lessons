package com.dagaz.evgeny.p0181_dynamiclayout3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;



public class MainActivity extends Activity implements SeekBar.OnSeekBarChangeListener {
    SeekBar sbWeight;

    Button btn1;
    Button btn2;

    LinearLayout.LayoutParams lParams1;
    LinearLayout.LayoutParams lParams2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbWeight = (SeekBar) findViewById(R.id.sbWeight);
        sbWeight.setOnSeekBarChangeListener(this);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        lParams1 =(LinearLayout.LayoutParams) btn1.getLayoutParams();
        lParams2 =(LinearLayout.LayoutParams) btn2.getLayoutParams();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int left = progress;
        int right = seekBar.getMax() - progress;

        lParams1.weight = left;
        lParams2.weight = right;

        btn1.setText(String.valueOf(left));
        btn2.setText(String.valueOf(right));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
