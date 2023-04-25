package com.example.parcial_2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {



    TextView textView4;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        textView4 = (TextView) findViewById(R.id.textView4);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
    }
    public void btnSuma(View view) {
        if((num1.getText().toString().isEmpty()) || (num2.getText().toString().isEmpty())) {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            textView4.setText(Integer.toString(sumar(a, b)));
        }
        else Toast.makeText(this,"Rellene los campos",Toast.LENGTH_LONG).show();
    }
    public void btnMulti(View view) {
        if((num1.getText().toString().isEmpty()) || (num2.getText().toString().isEmpty())) {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            textView4.setText(Integer.toString(multiplicar(a,b)));
        }
        else Toast.makeText(this,"Rellene los campos",Toast.LENGTH_LONG).show();
    }
    public void btnResta(View view) {
        if(!(num1.getText().toString().isEmpty()) || (num2.getText().toString().isEmpty())) {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            textView4.setText(Integer.toString(resta(a,b)));
        }
        else Toast.makeText(this,"Rellene los campos",Toast.LENGTH_LONG).show();


    }

    public static int sumar(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
}
