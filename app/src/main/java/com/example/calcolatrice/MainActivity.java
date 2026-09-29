package com.example.calcolatrice;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText mNum1;
    EditText mNum2;
    TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1 = findViewById(R.id.numero1);
        mNum2 = findViewById(R.id.numero2);
        mResult = findViewById(R.id.result);
    }

    public void sum(View view){

        int n1 = Integer.parseInt(String.valueOf(mNum1.getText()));
        int n2 = Integer.parseInt(String.valueOf(mNum2.getText()));
        int res = n1+n2;
        mResult.setText(Integer.toString(res));
    }
    public void subtraction(View view){

        int n1 = Integer.parseInt(String.valueOf(mNum1.getText()));
        int n2 = Integer.parseInt(String.valueOf(mNum2.getText()));
        int res = n1-n2;
        mResult.setText(Integer.toString(res));
    }
    public void multiplication(View view){

        int n1 = Integer.parseInt(String.valueOf(mNum1.getText()));
        int n2 = Integer.parseInt(String.valueOf(mNum2.getText()));
        int res = n1*n2;
        mResult.setText(Integer.toString(res));
    }
    public void division(View view){

        int n1 = Integer.parseInt(String.valueOf(mNum1.getText()));
        int n2 = Integer.parseInt(String.valueOf(mNum2.getText()));
        int res = n1/n2;
        mResult.setText(Integer.toString(res));
    }
}