package com.example.u1tema1ejerciciopropuesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculadora(View view) {
        startActivity(new Intent(this, Calculadora.class));
    }


    public void verFormularioAlumno(View view) {
        startActivity(new Intent(this, Datosalumno.class));
    }

    public void Salir(View view) {
        finish();
    }

    public void Enviar(View view) {
        startActivity(new Intent(this, Alumno.class));
    }
}
