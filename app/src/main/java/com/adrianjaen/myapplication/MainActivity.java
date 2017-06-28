package com.adrianjaen.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOne, buttonTwo, buttonThree;
    TextView texto;


private int numero = 0;
    private String TAG= "MainActivity";

    private void setText(String texto){
        this.texto.setText(texto);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.num0);
        buttonTwo = (Button) findViewById(R.id.num1);
        buttonThree = (Button) findViewById(R.id.num2);
        texto = (TextView) findViewById(R.id.num3);


        texto.setText("OHLALÁ");

        final Context context = this;

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Main2Activity.class);
                startActivity(i);


            }
        });
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(TAG,"Se ha llamado onsRestore");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v(TAG,"Se ha llamado onSave");
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num0:
                Log.v(TAG,"SOY EL BOTON 1 en this");
                setText("SOY EL BOTON 1");
                setText("SOY EL BOTON 1");
            case R.id.num1:
                Log.v(TAG,"SOY EL BOTON 2");
                break;
            case R.id.num2:
                Log.v(TAG,"SOY EL BOTON 3");
                break;
        }
    }
    public void mehanhechoclick(View v){

    }
}
