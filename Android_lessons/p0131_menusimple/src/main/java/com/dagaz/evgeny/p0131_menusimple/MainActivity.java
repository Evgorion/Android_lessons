package com.dagaz.evgeny.p0131_menusimple;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TAG = "p0131";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        menu.add("EDIT1");
        menu.add("EDIT2");
        menu.add("EDIT3");
        menu.add("EDIT4");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        Log.d(TAG, (String)item.getTitle());
        return super.onOptionsItemSelected(item);
    }
}
