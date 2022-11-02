package com.example.xo3isp914;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button r1c1;
    Button r1c2;
    Button r1c3;
    Button r2c1;
    Button r2c2;
    Button r2c3;
    Button r3c1;
    Button r3c2;
    Button r3c3;
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1c1 = (Button) findViewById(R.id.r1c1);
        r1c1.setEnabled(false);
        r1c2 = (Button) findViewById(R.id.r1c2);
        r1c2.setEnabled(false);
        r1c3 = (Button) findViewById(R.id.r1c3);
        r1c3.setEnabled(false);
        r2c1 = (Button) findViewById(R.id.r2c1);
        r2c1.setEnabled(false);
        r2c2 = (Button) findViewById(R.id.r2c2);
        r2c2.setEnabled(false);
        r2c3 = (Button) findViewById(R.id.r2c3);
        r2c3.setEnabled(false);
        r3c1 = (Button) findViewById(R.id.r3c1);
        r3c1.setEnabled(false);
        r3c2 = (Button) findViewById(R.id.r3c2);
        r3c2.setEnabled(false);
        r3c3 = (Button) findViewById(R.id.r3c3);
        r3c3.setEnabled(false);
        start = (Button) findViewById(R.id.start);

        Button[][] massBtn = new Button[3][3];
        massBtn[0][0] = (Button) findViewById(R.id.r1c1);
        massBtn[0][1] = (Button) findViewById(R.id.r1c2);
        massBtn[0][2] = (Button) findViewById(R.id.r1c3);
        massBtn[1][0] = (Button) findViewById(R.id.r2c1);
        massBtn[1][1] = (Button) findViewById(R.id.r2c2);
        massBtn[1][2] = (Button) findViewById(R.id.r2c3);
        massBtn[2][0] = (Button) findViewById(R.id.r3c1);
        massBtn[2][1] = (Button) findViewById(R.id.r3c2);
        massBtn[2][2] = (Button) findViewById(R.id.r3c3);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start.setText("Начать сначала");
                r1c1.setEnabled(true);
                r1c2.setEnabled(true);
                r1c3.setEnabled(true);
                r2c1.setEnabled(true);
                r2c2.setEnabled(true);
                r2c3.setEnabled(true);
                r3c1.setEnabled(true);
                r3c2.setEnabled(true);
                r3c3.setEnabled(true);

            }
        };
        start.setOnClickListener(oclBtnOk);

    }

}