package com.mitch.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text_result);
        Button btnClear = (Button) findViewById(R.id.button_clear);
        Button btnAddition = (Button) findViewById(R.id.button_addition);
        Button btnSubtraction = (Button) findViewById(R.id.button_subtraction);
        Button btnDivision = (Button) findViewById(R.id.button_division);
        Button btnMultiplication = (Button) findViewById(R.id.button_multiplication);
        Button btnEqual = (Button) findViewById(R.id.button_equal);
        Button btnPoint = (Button) findViewById(R.id.button_point);
        Button btn0 = (Button) findViewById(R.id.button0);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
    }
}
