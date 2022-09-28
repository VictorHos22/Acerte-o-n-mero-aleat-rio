package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortear(View view){
        TextView textResultado;
        EditText textNumDigitado;
        TextView textResultadoSorteio;

        textResultado = findViewById(R.id.textResultado);
        textNumDigitado = findViewById(R.id.textNumDigitado);
        textResultadoSorteio = findViewById(R.id.textResultadoSorteio);

        Double numDigitado = Double.parseDouble(textNumDigitado.getText().toString());
        int numero = new Random().nextInt(11);
        textResultado.setText("Número sorteado é " + numero);

        if(numDigitado == numero){
            textResultadoSorteio.setText("Boa! Você acertou o número sorteado!");
        }else{
            textResultadoSorteio.setText("Ish, você errou, tente denovo.");
        }
    }
}