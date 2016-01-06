package com.dagaz.evgeny.p0191_simplecalculator;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText etNum1;
    EditText etNum2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText)findViewById(R.id.firstItem);
        etNum2 = (EditText) findViewById(R.id.secondItem);

        btnAdd = (Button) findViewById(R.id.butAdd);
        btnSub = (Button) findViewById(R.id.butSub);
        btnMult = (Button) findViewById(R.id.butMult);
        btnDiv = (Button) findViewById(R.id.butDiv);

        tvResult = (TextView) findViewById(R.id.result);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;

        String oper ="";

        if(TextUtils.isEmpty(etNum1.getText().toString()) || TextUtils.isEmpty(etNum1.getText().toString()) )
            return;

        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());

        switch (v.getId()){
            case R.id.butAdd:
                oper ="+";
                result = num1 + num2;
            break;
            case R.id.butSub:
                oper ="-";
                result = num1 - num2;
                break;
            case R.id.butMult:
                oper ="*";
                result = num1 * num2;
                break;
            case R.id.butDiv:
                oper ="/";
                result = num1 / num2;
                break;
        }
        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
    }
}
