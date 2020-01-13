package com.example.u1tema1ejerciciopropuesto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Datosalumno extends AppCompatActivity {

    EditText edtnombre;
    EditText edtapellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularioalumno);
        edtnombre = findViewById(R.id.edtnombre);
        edtapellido = findViewById(R.id.edtapellido);
    }

    public void Verificar(View view){
        Intent intent = new Intent(this, Alumno.class);
        intent.putExtra("nombre", edtnombre.getText().toString());
        intent.putExtra("apellido", edtapellido.getText().toString());
        startActivity(intent);
    }


}
