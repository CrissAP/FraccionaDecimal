package com.example.pc.fraccionadecimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IConvertidor extends AppCompatActivity implements View.OnClickListener{
    private EditText inputtext;
    private TextView resulttext;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonIgual;
    private Button buttonC;
    private Button buttonSlash;
    private Button buttonPunto;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iconvertidor);
        inisializeButtons();
        setOnclick();
        // Hiding and disable keyboard

    }
    private void inisializeButtons(){
        this.inputtext = findViewById(R.id.input);
        this.resulttext = findViewById(R.id.result);
        this.button0 = findViewById(R.id.button0);
        this.button1 = findViewById(R.id.button1);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
        this.button9 = findViewById(R.id.button9);
        this.buttonIgual = findViewById(R.id.buttonIgual);
        this.buttonC = findViewById(R.id.buttonC);
        this.buttonSlash= findViewById(R.id.buttonSlash);
        this.buttonPunto= findViewById(R.id.buttonPunto);



    }

    private void setOnclick(){
        this.button0.setOnClickListener(this);
        this.button1.setOnClickListener(this);
        this.button2.setOnClickListener(this);
        this.button3.setOnClickListener(this);
        this.button4.setOnClickListener(this);
        this.button5.setOnClickListener(this);
        this.button6.setOnClickListener(this);
        this.button7.setOnClickListener(this);
        this.button8.setOnClickListener(this);
        this.button9.setOnClickListener(this);
        this.buttonIgual.setOnClickListener(this);
        this.buttonC.setOnClickListener(this);
        this.buttonSlash.setOnClickListener(this);
        this.buttonPunto.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        int Id=view.getId();
        switch (Id){
            case R.id.button0:
                append("0");
                break;
            case R.id.button1:
                append("1");
                break;
            case R.id.button2:
                append("2");
                break;
            case R.id.button3:
                append("3");
                break;
            case R.id.button4:
                append("4");
                break;
            case R.id.button5:
                append("5");
                break;
            case R.id.button6:
                append("6");
                break;
            case R.id.button7:
                append("7");
                break;
            case R.id.button8:
                append("8");
                break;
            case R.id.button9:
                append("9");
                break;
            case R.id.buttonIgual:break;
            case R.id.buttonPunto:
                if (endsWithOperatore())
                    replace(".");
                else
                    append(".");
                break;
            case R.id.buttonSlash:
                if (endsWithOperatore())
                    replace("/");
                else
                    append("/");
                break;
            case R.id.buttonC:
                delete();
                break;
            default:break;


        }

    }
    private boolean endsWithOperatore() {
        return getinput().endsWith("/") || getinput().endsWith(".");
    }

    private void replace(String str) {
        inputtext.getText().replace(getinput().length() - 1, getinput().length(), str);
    }

    private void append(String str){ this.inputtext.getText().append(str); }

    private void delete() {
        if (!isEmty()){
            this.inputtext.getText().delete(getinput().length() - 1, getinput().length());

        }

    }

    private String getinput() {
        return this.inputtext.getText().toString();
    }
    private boolean isEmty(){
        return getinput().isEmpty();
    }

}
