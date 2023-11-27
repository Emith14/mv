package com.example.mv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSumar, btnRestar;
    EditText etNum1, etNum2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar= findViewById(R.id.buttonsumar);
        btnRestar= findViewById(R.id.buttonrestar);
        etNum1= findViewById(R.id.editText1);
        etNum2= findViewById(R.id.editText2);
        tvResultado= findViewById(R.id.textViewResultado);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        etNum1.setOnClickListener(this);
        etNum2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(btnSumar.isPressed() && etNum1.getText().toString().length()>0 && etNum2.getText().toString().length()>0){
            double num1= Integer.parseInt(etNum1.getText().toString());
            double num2= Integer.parseInt(etNum2.getText().toString());
            double suma= num1+num2;
            tvResultado.setText("Resultado: "+suma);
        }
        else if(btnRestar.isPressed() && etNum1.getText().toString().length()>0 && etNum2.getText().toString().length()>0){
            double num1= Integer.parseInt(etNum1.getText().toString());
            double num2= Integer.parseInt(etNum2.getText().toString());
            double resta= num1-num2;
            tvResultado.setText("Resultado: "+resta);
        }
        else {
            tvResultado.setText("Ingrese los dos numeros");
        }
    }
}