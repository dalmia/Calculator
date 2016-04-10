package com.amandalmia.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * MainActivity is where all the fun stuff takes place
 * It now implements an interface - OnClickListener to
 * handle the click events and make our code more
 * readable.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declare your views here
    Button one, two, three, four,five, six,seven, eight, nine,zero,
            add,subtract,divide, multiply,equal;
    TextView result;
    //operation -> define the current operation
    //firstVariable -> first operand for the operation
    //secondVariable -> second operand for the operation
    String operation = "", firstVariable, secondVariable = "";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the appropriate view
        //(layout -> directory to search for the view)
        setContentView(R.layout.activity_main);

        //Link the widgets with the respective views in the layout file
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four= (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equal = (Button) findViewById(R.id.equal);
        result = (TextView) findViewById(R.id.calculation_result);


        //Set the click Listeners
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                result.setText("1");

                //once an operation is chosen the next selected button
                //becomes our second operand
                if (!operation.equals(""))
                    secondVariable = "1";
                break;
            case R.id.two:
                result.setText("2");
                if (!operation.equals(""))
                    secondVariable = "2";
                break;
            case R.id.three:
                result.setText("3");
                if (!operation.equals(""))
                    secondVariable = "3";
                break;
            case R.id.four:
                result.setText("4");
                if (!operation.equals(""))
                    secondVariable = "4";
                break;
            case R.id.five:
                result.setText("5");
                if (!operation.equals(""))
                    secondVariable = "5";
                break;
            case R.id.six:
                result.setText("6");
                if (!operation.equals(""))
                    secondVariable = "6";
                break;
            case R.id.seven:
                result.setText("7");
                if (!operation.equals(""))
                    secondVariable = "7";
                break;
            case R.id.eight:
                result.setText("8");
                if (!operation.equals(""))
                    secondVariable = "8";
                break;
            case R.id.nine:
                result.setText("9");
                if (!operation.equals(""))
                    secondVariable = "9";
                break;
            case R.id.zero:
                result.setText("0");
                if (!operation.equals(""))
                    secondVariable = "0";

            case R.id.add:
                operation = "add";
                //upon clicking an operation the current value becomes
                //the first operand
                firstVariable = result.getText().toString();

            case R.id.subtract:
                operation = "subtract";
                firstVariable = result.getText().toString();

            case R.id.multiply:
                operation = "multiply";
                firstVariable = result.getText().toString();

            case R.id.divide:
                operation = "divide";
                firstVariable = result.getText().toString();
                break;

            case R.id.equal:
                switch (operation) {
                    case "add":
                        add();
                        break;

                    case "subtract":
                       subtract();
                        break;

                    case "multiply":
                        multiply();
                        break;

                    case "divide":
                        divide();
                        break;

                    default:
                        break;
                }
                break;
        }
    }


    /**
     * Separate the operations into different functions to make the code
     * more readable.
     */
    public void add(){
        //Ignore the case when equal is clicked just after
        //choosing an operation
        if (!secondVariable.equals("")) {
            int addition = Integer.valueOf(firstVariable) + Integer.valueOf(secondVariable);
            result.setText(addition);
        }else{
            result.setText("");
        }

        //Set the operation and secondVariable back to the default value
        operation = "";
        secondVariable = "";
    }

    public void subtract(){
        if (!secondVariable.equals("")) {
            int addition = Integer.valueOf(firstVariable) - Integer.valueOf(secondVariable);
            result.setText(addition);
        }else{
            result.setText("");
        }
        operation = "";
        secondVariable = "";
    }

    public void multiply(){
        if (!secondVariable.equals("")) {
            int addition = Integer.valueOf(firstVariable)*Integer.valueOf(secondVariable);
            result.setText(addition);
        }else{
            result.setText("");
        }
        operation = "";
        secondVariable = "";
    }

    public void divide(){
        if (!secondVariable.equals("")&&!secondVariable.equals("0")) {

            //division of integers may return float
            float addition = Integer.valueOf(firstVariable)/Integer.valueOf(secondVariable);
            result.setText(Float.toString(addition));
        }else{
            result.setText("");
        }
        operation = "";
        secondVariable = "";
    }
}
