package com.coru.googlemapsweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtOne;
    private TextView txtTwo;
    private TextView txtThree;
    private TextView txtFour;

    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOne = (TextView) findViewById(R.id.tv1);
        txtTwo = (TextView) findViewById(R.id.tv2);
        txtThree = (TextView) findViewById(R.id.tv3);
        txtFour = (TextView) findViewById(R.id.tv4);

        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(c);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(d);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(e);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(f);
            }
        });
    }
}