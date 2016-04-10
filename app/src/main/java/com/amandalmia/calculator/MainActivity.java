package com.amandalmia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declare your views here
    Button one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the appropriate view
        //(layout -> directory to search for the view)
        setContentView(R.layout.activity_main);

        //Link the button with the respective button in the view
        one = (Button) findViewById(R.id.one);

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
}
