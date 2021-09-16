package com.hfad.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void onPress(View view){
    int Rs;
    int amount;
    String a;
    EditText editText = (EditText) findViewById(R.id.editTextNumber);
    Rs = Integer. parseInt(editText. getText(). toString());
    amount = Rs*75;


    Toast.makeText(this,"amountis Rs "+ amount,Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}