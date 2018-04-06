package com.david.proyectofinalintento1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText email, pass;
    private TextView register;
    private Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.editText);
        pass = findViewById(R.id.editText2);
        register = findViewById(R.id.textView2);
        iniciar = findViewById(R.id.button);

        email.setOnClickListener(this);
        pass.setOnClickListener(this);
        register.setOnClickListener(this);
        iniciar.setOnClickListener(this);


    }

    public void onClick(View v) {
        //Clear the EditText text when tap
        if(v.getId()==R.id.editText){
            email.setText("");
        }
        if(v.getId()==R.id.editText2){
            pass.setText("");
        }
        //If you want to register
        if(v.getId()==R.id.textView2){
            //setContentView(R.layout.activity_register);
            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(i);
        }
        //If you pressed Login
        if(v.getId()==R.id.button){
           // setContentView(R.layout.activity_login);
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
        }
    }
    }

