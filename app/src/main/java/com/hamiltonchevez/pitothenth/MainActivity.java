package com.hamiltonchevez.pitothenth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText power;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate = (Button) findViewById(R.id.calculate);
        power = (EditText) findViewById(R.id.nthPowerField);

        // Listen to user input when to clear text
        power.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                power.setText("");
            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText result = (EditText) findViewById(R.id.resultField);
                double answer = raisePiToTheNth(power);
                result.setText(Double.toString(answer));

            }
        });


    }

    public double raisePiToTheNth(EditText exponent){
        double exp = Double.parseDouble(exponent.getText().toString());
        double expResult = Math.pow(Math.PI,exp);
        return expResult;
    }

}
