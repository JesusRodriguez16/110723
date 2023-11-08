package com.example.a110723;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    Button bt1;
    EditText texto;

    String palabra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        bt1 = (Button) findViewById(R.id.button2);
        texto = (EditText) findViewById(R.id.textField2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    palabra = texto.getText().toString();
                } catch(NumberFormatException e){

                }
                if (palabra.equals("UTCH")){
                    Intent intent = new Intent(NewActivity.this, MainActivity.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(NewActivity.this, "Palabra Incorrecta"+ palabra, Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}