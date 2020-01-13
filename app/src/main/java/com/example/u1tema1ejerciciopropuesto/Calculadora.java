package com.example.u1tema1ejerciciopropuesto;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {

    public EditText pant;
    public double operan1, operan2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vercalculadora);
        pant = (EditText) findViewById(R.id.txtresultado);
    }

    public void btn1(View v) {
        String digito = pant.getText().toString();
        digito = digito + "1";
        pant.setText(digito);
    }

    public void btn2(View v) {
        String digito = pant.getText().toString();
        digito = digito + "2";
        pant.setText(digito);
    }

    public void btn3(View v) {
        String digito = pant.getText().toString();
        digito = digito + "3";
        pant.setText(digito);
    }

    public void btn4(View v) {
        String digito = pant.getText().toString();
        digito = digito + "4";
        pant.setText(digito);
    }

    public void btn5(View v) {
        String digito = pant.getText().toString();
        digito = digito + "5";
        pant.setText(digito);
    }

    public void btn6(View v) {
        String digito = pant.getText().toString();
        digito = digito + "6";
        pant.setText(digito);
    }

    public void btn7(View v) {
        String digito = pant.getText().toString();
        digito = digito + "7";
        pant.setText(digito);
    }

    public void btn8(View v) {
        String digito = pant.getText().toString();
        digito = digito + "8";
        pant.setText(digito);
    }

    public void btn9(View v) {
        String digito = pant.getText().toString();
        digito = digito + "9";
        pant.setText(digito);
    }

    public void btn0(View v) {
        String digito = pant.getText().toString();
        digito = digito + "0";
        pant.setText(digito);
    }

    public void btnpunt(View v) {
        String digito = pant.getText().toString();
        digito = digito + ".";
        pant.setText(digito);
    }

    public void btnsuma(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
            pant.setText("");
            ope = 1;
        } catch (NumberFormatException nfe) {
        }

        pant.setText("");
        ope = 1;
    }

    public void btnresta(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException nfe) {
        }
        pant.setText("");
        ope = 2;
    }

    public void btnmultiplicacion(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException e) {

        }
        pant.setText("");
        ope = 3;
    }

    public void btndivision(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException e) {

        }
        pant.setText("");
        ope = 4;
    }

    public void btnpotencia(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException e) {

        }

        pant.setText("");
        ope = 5;
    }

    public void btnporcentaje(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException e) {

        }

        pant.setText("");
        ope = 6;
    }

    public void btnraiz(View v) {
        try {
            String i = pant.getText().toString();
            operan1 = Double.parseDouble(i);
        } catch (NumberFormatException e) {

        }

        pant.setText("¹(" + operan1 + ")");
        ope = 7;
    }

    public void igual(View v) {
        try {
            String j = pant.getText().toString();
            operan2 = Double.parseDouble(j);
        } catch (NumberFormatException e) {
        }

        pant.setText("");

        if (ope == 1) {
            res = operan1 + operan2;
        } else if (ope == 2) {
            res = operan1 - operan2;
        } else if (ope == 3) {
            res = operan1 * operan2;
        } else if (ope == 4) {
            if (operan2 == 0) {
                pant.setText("Error");
            } else {
                res = operan1 / operan2;
            }
        } else if (ope == 5) {
            res = Math.pow(operan1, operan2);
        } else if (ope == 6) {
            res = operan2 * (operan1 / 100.0);
        } else if (ope == 7) {
            res = Math.sqrt(operan1);
        }

        pant.setText("" + res);
        operan1 = res;
    }

    public void btndel(View v) {
        pant.setText("");
        operan1 = 0.0;
        operan2 = 0.0;
        res = 0.0;
    }

    public void btnac(View v) {
        if (!pant.getText().toString().equals("")) {
            pant.setText(pant.getText().subSequence(0, pant.getText().length() - 1) + "");
        }
    }

    public void off(View v) {
        finish();
    }
}
