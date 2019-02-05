package com.meterstoinches.arithmenticoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFirstNum;
    EditText edtSecondNum;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    TextView txtResult;
    double num1,num2;
    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFirstNum = (EditText) findViewById(R.id.firstNumET);
        edtSecondNum = (EditText) findViewById(R.id.secondNumET);
        btnAdd = (Button) findViewById(R.id.Add);
        btnSub = (Button) findViewById(R.id.Sub);
        btnMul = (Button) findViewById(R.id.Mul);
        btnDiv = (Button) findViewById(R.id.Div);
        txtResult = (TextView) findViewById(R.id.resultID);

    }

    public void addMethod(View view) {
        if(edtFirstNum.getText().toString().equals("") || edtSecondNum.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some values",Toast.LENGTH_LONG).show();
        }
        else{
            num1 = Double.parseDouble(edtFirstNum.getText().toString());
            num2 = Double.parseDouble(edtSecondNum.getText().toString());
            total = num1+num2;
            txtResult.setText(String.valueOf(total));
        }
    }

    public void SubMethod(View view) {
        if(edtFirstNum.getText().toString().equals("") || edtSecondNum.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some values",Toast.LENGTH_LONG).show();
        }
        else{
            num1 = Double.parseDouble(edtFirstNum.getText().toString());
            num2 = Double.parseDouble(edtSecondNum.getText().toString());
            total = num1-num2;
            txtResult.setText(String.valueOf(total));
        }
    }

    public void MulMethod(View view) {
        if(edtFirstNum.getText().toString().equals("") || edtSecondNum.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some values",Toast.LENGTH_LONG).show();
        }
        else{
            num1 = Double.parseDouble(edtFirstNum.getText().toString());
            num2 = Double.parseDouble(edtSecondNum.getText().toString());
            total = num1*num2;
            txtResult.setText(String.valueOf(total));
        }
    }

    public void DivMethod(View view) {
        if(edtFirstNum.getText().toString().equals("") || edtSecondNum.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Please enter some values",Toast.LENGTH_LONG).show();
        }
        else{
            num1 = Double.parseDouble(edtFirstNum.getText().toString());
            num2 = Double.parseDouble(edtSecondNum.getText().toString());
            total = num1/num2;
            txtResult.setText(String.valueOf(total));
        }
    }
}
