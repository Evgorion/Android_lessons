package com.dagaz.evgeny.p0151_contextmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvColor;
    TextView tvSize;

    private static final int MENU_COLOR_R = 1;
    private static final int MENU_COLOR_G = 2;
    private static final int MENU_COLOR_B = 3;
    private static final int MENU_SIZE_22 = 4;
    private static final int MENU_SIZE_26 = 5;
    private static final int MENU_SIZE_30 = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvColor =(TextView)findViewById(R.id.tvColor);
        tvSize = (TextView)findViewById(R.id.tvSize);

        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_R, 0, "RED");
                menu.add(0, MENU_COLOR_B, 0, "BLUE");
                menu.add(0, MENU_COLOR_G, 0, "GREEN");
                break;
            case R.id.tvSize:
                menu.add(0,MENU_SIZE_22, 0, "22");
                menu.add(0,MENU_SIZE_26, 0, "26");
                menu.add(0,MENU_SIZE_30, 0, "30");
                break;
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case MENU_COLOR_R:
                tvColor.setText("This is text RED");
                tvColor.setTextColor(Color.RED);
                break;
            case MENU_COLOR_B:
                tvColor.setText("This is text BLUE");
                tvColor.setTextColor(Color.BLUE);
                break;
            case MENU_COLOR_G:
                tvColor.setText("This is text GREEN");
                tvColor.setTextColor(Color.GREEN);
                break;
            case MENU_SIZE_22:
                tvSize.setText("This is text GREEN");
                tvSize.setTextSize(22);
                break;
            case MENU_SIZE_26:
                tvSize.setText("This is text GREEN");
                tvSize.setTextSize(26);
                break;
            case MENU_SIZE_30:
                tvSize.setText("This is text GREEN");
                tvSize.setTextSize(30);
                break;

        }
        return super.onContextItemSelected(item);
    }
}
