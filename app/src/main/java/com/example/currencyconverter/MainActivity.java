package com.example.currencyconverter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public void convertCurrency(View view){
        Log.i("Info","Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText2);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInPoundsDouble = amountInDollarsDouble * .79;

        String amountInPoundsString = String.format("%.2f", amountInPoundsDouble);

        Toast.makeText(this,"$" + amountInDollars + " is £" + amountInPoundsString, Toast.LENGTH_LONG).show();

      //  Log.i("Info", amountInPoundsString) ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
