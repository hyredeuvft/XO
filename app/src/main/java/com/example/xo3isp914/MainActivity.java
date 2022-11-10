package com.example.xo3isp914;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    TextView result;

    Boolean XO = true;
    Boolean isStarted = false;
    Boolean restart = true;
    Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1c1 = (Button) findViewById(R.id.r1c1);
        r1c2 = (Button) findViewById(R.id.r1c2);
        r1c3 = (Button) findViewById(R.id.r1c3);
        r2c1 = (Button) findViewById(R.id.r2c1);
        r2c2 = (Button) findViewById(R.id.r2c2);
        r2c3 = (Button) findViewById(R.id.r2c3);
        r3c1 = (Button) findViewById(R.id.r3c1);
        r3c2 = (Button) findViewById(R.id.r3c2);
        r3c3 = (Button) findViewById(R.id.r3c3);
        start = (Button) findViewById(R.id.start);
        result = (TextView) findViewById(R.id.Result);
        start.setOnClickListener(this::onClickStart);
        r1c1.setOnClickListener(this::onClick);
        r1c2.setOnClickListener(this::onClick);
        r1c3.setOnClickListener(this::onClick);
        r2c1.setOnClickListener(this::onClick);
        r2c2.setOnClickListener(this::onClick);
        r2c3.setOnClickListener(this::onClick);
        r3c3.setOnClickListener(this::onClick);
        r3c2.setOnClickListener(this::onClick);
        r3c1.setOnClickListener(this::onClick);

    }

    public void onClick(View v)
    {
        if (isStarted)
        {
            Button vv = (Button) v;
            if (XO)
            {
                vv.setText("X ");
                vv.setEnabled(false);
                XO =! XO;
            }
            else
            {
                vv.setText("O ");
                vv.setEnabled(false);
                XO =! XO;
            }
            if (r1c1.getText().toString()== r1c2.getText().toString() && r1c1.getText().toString()==r1c3.getText().toString()
                    &&r1c1.getText().toString().length()!=0 ||
                    r1c1.getText().toString() == r2c1.getText().toString() && r1c1.getText().toString() == r3c1.getText().toString()
                            &&r1c1.getText().toString().length()!=0)
            {
                result.setText(r1c1.getText().toString() + "Win");
                isStarted =! isStarted;
            }
            if (r3c3.getText().toString()== r3c2.getText().toString() && r3c3.getText().toString()==r3c1.getText().toString()
                    &&r3c3.getText().toString().length()!=0 ||
                    r3c3.getText().toString() == r2c3.getText().toString() && r3c3.getText().toString() == r1c3.getText().toString()
                            &&r3c3.getText().toString().length()!=0)
            {
                result.setText(r3c3.getText().toString() + "Win");
                isStarted =! isStarted;
            }

            if (r2c2.getText().toString()== r1c1.getText().toString() && r2c2.getText().toString()==r3c3.getText().toString() &&r2c2.getText().toString().length()!=0 ||
                    r2c2.getText().toString() == r1c3.getText().toString() && r2c2.getText().toString() == r3c1.getText().toString()
                            &&r2c2.getText().toString().length()!=0 ||
                    r2c2.getText().toString()== r1c2.getText().toString() && r2c2.getText().toString()==r3c2.getText().toString()
                            &&r2c2.getText().toString().length()!=0 ||
                    r2c2.getText().toString() == r2c1.getText().toString() && r2c2.getText().toString() == r2c3.getText().toString()
                            &&r2c2.getText().toString().length()!=0 )
            {
                result.setText(r3c3.getText().toString() + "Win");
                isStarted =! isStarted;
            }
            if (count==8 && result.getText().toString().length()==15)
            {
                result.setText("Ничья");
            }
            count++;
        }
    }

    public void onClickStart (View v)
    {
        if (restart)
        {
            Button vv = (Button) v;
            isStarted = true;
            vv.setText("Restart");
            restart = false;
        }
        else
        {
            Intent act = new Intent(this,MainActivity.class);
            startActivity(act);
        }
    }

}