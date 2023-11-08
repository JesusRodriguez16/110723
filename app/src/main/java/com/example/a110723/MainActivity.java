package com.example.a110723;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt1;
    EditText texto;
    int edad=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.button1);
        texto = (EditText) findViewById(R.id.textField1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    edad = Integer.parseInt(texto.getText().toString());
                } catch(NumberFormatException e){

                }
                if (edad >= 18){
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    startActivity(intent);
                } else{

                }
            }
        });


    }
}