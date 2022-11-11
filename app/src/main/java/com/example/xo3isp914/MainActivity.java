package com.example.xo3isp914;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Boolean XO = true;
    Boolean restart = false;

    TextView tvMain;

    Button btn00;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = (Button) findViewById(R.id.button00);
        btn01 = (Button) findViewById(R.id.button01);
        btn02 = (Button) findViewById(R.id.button02);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
        btn20 = (Button) findViewById(R.id.button20);
        btn21 = (Button) findViewById(R.id.button21);
        btn22 = (Button) findViewById(R.id.button22);
        tvMain = (TextView) findViewById(R.id.textView2);
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);



    }
    public void onClick(View v) {
        Button vv =(Button) v;
        vv.setEnabled(false);
        if(XO){
            vv.setText("X");
            XO=false;
        }
        else {
            vv.setText("O");
            XO=true;
        }
        XO();
        Check();

    }
    public void Win(String s){
        if(s.toString()=="X"){
            tvMain.setText("Выиграл Х");
            restart = true;
        }
        else if (s.toString()=="O"){
            tvMain.setText("Выиграл О");
            restart = true;
        }
        else{
            tvMain.setText("Ничья");
            restart = true;
        }
        btn00.setEnabled(false);
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn20.setEnabled(false);
        btn21.setEnabled(false);
        btn22.setEnabled(false);
    }
    public void Check() {
        if(btn11.getText().toString().length() != 0 && btn00.getText().toString() == btn11.getText().toString() && btn11.getText().toString() == btn22.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        if(btn11.getText().toString().length() != 0 && btn01.getText().toString() == btn11.getText().toString() && btn11.getText().toString() == btn21.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        if(btn11.getText().toString().length() != 0 && btn02.getText().toString() == btn11.getText().toString() && btn11.getText().toString() == btn20.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        if(btn11.getText().toString().length() != 0 && btn10.getText().toString() == btn11.getText().toString() && btn11.getText().toString() == btn12.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        if(btn00.getText().toString().length() != 0 && btn00.getText().toString() == btn01.getText().toString() && btn01.getText().toString() == btn02.getText().toString())
        {
            Win(btn00.getText().toString());
            return;
        }
        if(btn00.getText().toString().length() != 0 && btn00.getText().toString() == btn10.getText().toString() && btn10.getText().toString() == btn20.getText().toString())
        {
            Win(btn00.getText().toString());
            return;
        }
        if(btn22.getText().toString().length() != 0 && btn22.getText().toString() == btn21.getText().toString() && btn21.getText().toString() == btn20.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        if(btn22.getText().toString().length() != 0 && btn22.getText().toString() == btn12.getText().toString() && btn12.getText().toString() == btn02.getText().toString())
        {
            Win(btn11.getText().toString());
            return;
        }
        else if(btn00.getText().toString().length() != 0  && btn01.getText().toString().length() != 0  && btn02.getText().toString().length() != 0  && btn10.getText().toString().length() != 0
                && btn11.getText().toString().length() != 0 && btn12.getText().toString().length() != 0  && btn20.getText().toString().length() != 0 && btn21.getText().toString().length() != 0
                && btn22.getText().toString().length() != 0)
        {
            Win("");
        }

    }

    public void Start(View v){
        if (restart){
            Intent act = new Intent(this, MainActivity.class);
            startActivity(act);

        }
        else{
            Button vv = (Button) v;
            vv.setText("Начать заново");
            restart=true;
            btn00.setEnabled(true);
            btn01.setEnabled(true);
            btn02.setEnabled(true);
            btn10.setEnabled(true);
            btn11.setEnabled(true);
            btn12.setEnabled(true);
            btn20.setEnabled(true);
            btn21.setEnabled(true);
            btn22.setEnabled(true);

        }
        XO();
    }
    public void XO()
    {
        if (XO)
        {
            tvMain.setText("Ход Х");
        }
        else
            { tvMain.setText("Ход О");
        }
    }
}