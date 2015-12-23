package com.dagaz.evgeny.p0141_menuadv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tvView);
        chb = (CheckBox) findViewById(R.id.chbBox);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"add");
        menu.add(0,2,0,"edit");
        menu.add(0,3,3,"delete");
        menu.add(1,4,1,"copy");
        menu.add(1,5,2,"paste");
        menu.add(1,6,4,"exit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(1,chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }
}
