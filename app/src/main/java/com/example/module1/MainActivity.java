package com.example.module1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    int[] g1Value = new int[5];
    int average = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView g1 = (TextView)findViewById(R.id.editText3);
        final TextView g2 = (TextView)findViewById(R.id.editText4);
        final TextView g3 = (TextView)findViewById(R.id.editText5);
        final TextView g4 = (TextView)findViewById(R.id.editText6);
        final TextView g5 = (TextView)findViewById(R.id.editText7);
        final TextView total = (TextView)findViewById(R.id.textView6);
        final LinearLayout layout = (LinearLayout)findViewById((R.id.linearLayout));

        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(g1.getText().length() == 0 || g2.getText().length() == 0 || g3.getText().length() == 0 || g4.getText().length() == 0 || g5.getText().length() == 0)
                {
                    total.setText("Please Enter A Value For Each Grade!");
                }
                else {
                    g1Value[0] = Integer.valueOf(g1.getText().toString());
                    g1Value[1] = Integer.valueOf(g2.getText().toString());
                    g1Value[2] = Integer.valueOf(g3.getText().toString());
                    g1Value[3] = Integer.valueOf(g4.getText().toString());
                    g1Value[4] = Integer.valueOf(g5.getText().toString());
                    for (int x = 0; x < g1Value.length; x++) {
                        average += g1Value[x];
                    }
                    average = average / 5;
                    if (average < 60) {
                        layout.setBackgroundColor(Color.RED);
                    } else if (average > 60 && average < 80) {
                        layout.setBackgroundColor(Color.YELLOW);
                    } else if (average >= 80 && average <= 100)
                    {
                        layout.setBackgroundColor(Color.GREEN);
                    }

                    total.setText(String.valueOf(average));
                    g1.setText("");
                    g2.setText("");
                    g3.setText("");
                    g4.setText("");
                    g5.setText("");
                }

            }
        });



    }



}
