package com.amandalmia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * MainActivity is where all the fun stuff takes place
 * It now implements an interface - OnClickListener to
 * handle the click events and make our code more
 * readable.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Declare your views here
    Button one;
    TextView result;
    String operation = "", firstVariable, secondVariable = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the appropriate view
        //(layout -> directory to search for the view)
        setContentView(R.layout.activity_main);

        //Link the widgets with the respective views in the layout file
        one = (Button) findViewById(R.id.one);
        result = (TextView) findViewById(R.id.calculation_result);


        //Set the click Listener
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**displaying a Toast
                Toast - used to inform the user about an event
                      - lasts for a few seconds and disappears thereafter
                 Takes the following parameters as input :
                 Context - where you want to show the toast
                 Message - what you want to show in the toast
                 Duration - for how long you want to show the toast
                */

                Toast.makeText(MainActivity.this, one.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one:
                result.setText("1");
                if(!operation.equals(""))
                    secondVariable = "1";
                break;
            case R.id.two:
                result.setText("2");
                if(!operation.equals(""))
                    secondVariable = "2";
                break;
            case R.id.three:
                result.setText("3");
                if(!operation.equals(""))
                    secondVariable = "3";
                break;
            case R.id.four:
                result.setText("4");
                if(!operation.equals(""))
                    secondVariable = "4";
                break;
            case R.id.five:
                result.setText("5");
                if(!operation.equals(""))
                    secondVariable = "5";
                break;
            case R.id.six:
                result.setText("6");
                if(!operation.equals(""))
                    secondVariable = "6";
                break;
            case R.id.seven:
                result.setText("7");
                if(!operation.equals(""))
                    secondVariable = "7";
                break;
            case R.id.eight:
                result.setText("8");
                if(!operation.equals(""))
                    secondVariable = "8";
                break;
            case R.id.nine:
                result.setText("9");
                if(!operation.equals(""))
                    secondVariable = "9";
                break;
            case R.id.zero:
                result.setText("0");
                if(!operation.equals(""))
                    secondVariable = "0";

            case R.id.add:
                operation = "add";
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
                switch (operation){
                    case "add":
                        if(!secondVariable.equals("")) {
                            int addition = Integer.valueOf(firstVariable) + Integer.valueOf(secondVariable);
                            result.setText(addition);
                        }
                        operation = "";
                        secondVariable = "";
                        break;

                    case "subtract":
                        break;

                    case "multiply":
                        break;

                    case "divide":
                        break;

                    default:break;
                }
                break;


        }
    }
}
