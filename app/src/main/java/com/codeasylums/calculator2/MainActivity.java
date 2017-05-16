package com.codeasylums.calculator2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView edt;
    Integer c, d, r, b;
    String a = "0", aa;


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.editText1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button0);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);


        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "1";
                edt.setText(a);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "2";
                edt.setText(a);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                a = edt.getText().toString();
                a = a + "3";
                edt.setText(a);
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                a = edt.getText().toString();
                a = a + "4";
                edt.setText(a);

            }
        });


        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "5";
                edt.setText(a);

            }
        });


        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "6";
                edt.setText(a);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "7";
                edt.setText(a);
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "8";
                edt.setText(a);

            }
        });


        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "9";
                edt.setText(a);
            }
        });


        b10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                a = edt.getText().toString();
                a = a + "0";
                edt.setText(a);
            }
        });


        b11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                aa = a;
                b = 1;
                edt.setText("");
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                aa = a;
                b = 2;
                edt.setText("");

            }
        });


        b13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                aa = a;
                b = 3;
                edt.setText("");

            }
        });


        b14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                aa = a;
                b = 4;
                edt.setText("");

            }
        });


        b15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (b == 1) {
                    c = Integer.parseInt(aa);

                    d = Integer.parseInt(a);
                    r = c + d;
                }
                else if (b == 4) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c / d;
                }
                else if (b == 2) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c - d;
                }
                else if (b == 3) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c * d;
                }

                edt.setText(String.valueOf(r));
            }
        });


        b16.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                edt.setText("");
            }
        });


    }
}