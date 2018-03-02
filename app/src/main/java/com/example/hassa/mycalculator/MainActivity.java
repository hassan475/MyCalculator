package com.example.hassa.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtSolution;
    String arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        txtSolution = (TextView) findViewById(R.id.txtSolution);


    }
    public void btnOne_OnClick(View v)
    {
        //b1.setOnClickListener(this);
        txtSolution.setText(txtSolution.getText() +"1");
    }
    public void btnTwo_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"2");
    }
    public void btnThree_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"3");
    }
    public void btnFour_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"4");
    }
    public void btnFive_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"5");
    }
    public void btnSix_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"6");
    }
    public void btnSeven_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"7");
    }
    public void btnEight_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"8");
    }
    public void btnNine_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"9");
    }
    public void btnAdd_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"+");
    }
    public void btnSub_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"-");
    }
    public void btnMul_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"*");
    }
    public void btnDiv_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"/");
    }
    public void btnZero_OnClick(View v)
    {
        txtSolution.setText(txtSolution.getText()+"0");
    }
    public void btnClear_OnClick(View v)
    {
        txtSolution.setText(" ");
    }
    public void btnEquals_OnClick(View v) {
        int count = 0;
        int result = 0;
        String a = txtSolution.getText().toString();
        ArrayList<String> list;
        txtSolution.setText("");

        int index1 = 0, index2 = 0, index3 = 0, index4 = 0;
        index1 = a.indexOf("+");
        index2 = a.indexOf("-");
        index3 = a.indexOf("*");
        index4 = a.indexOf("/");


           if (index1 > 0) {
                String firstNum = a.substring(0, index1);
                int num1 = Integer.parseInt(firstNum + "");
                String secondNum = a.substring(index1 + 1, a.length());
                int num2 = Integer.parseInt(secondNum + "");
                result = num1 + num2;
            } else if (index2 > 0) {
                String firstNum = a.substring(0, index2);
                int num1 = Integer.parseInt(firstNum + "");
                String secondNum = a.substring(index2 + 1, a.length());
                int num2 = Integer.parseInt(secondNum + "");
                result = num1 - num2;
            } else if (index3 > 0) {
                String firstNum = a.substring(0, index3);
                int num1 = Integer.parseInt(firstNum + "");
                String secondNum = a.substring(index3 + 1, a.length());
                int num2 = Integer.parseInt(secondNum + "");
                result = num1 * num2;
            } else if (index4 > 0) {
                String firstNum = a.substring(0, index4);
                int num1 = Integer.parseInt(firstNum + "");
                String secondNum = a.substring(index4 + 1, a.length());
                int num2 = Integer.parseInt(secondNum + "");
                result = num1 / num2;
            }
            txtSolution.setText("Your answer is: " + result);


    }

}
