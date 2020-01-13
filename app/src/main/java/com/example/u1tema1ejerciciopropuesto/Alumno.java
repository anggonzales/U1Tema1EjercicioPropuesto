package com.example.u1tema1ejerciciopropuesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Alumno extends AppCompatActivity {

    TextView txtmensaje;
    String nombre;
    String apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        Bundle extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        apellido = extras .getString("apellido");
        txtmensaje=findViewById(R.id.mensaje);
        txtmensaje.setText("Bienvenido alumno " + nombre + " " +  apellido);
    }
}
