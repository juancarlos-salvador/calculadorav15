package com.jcsalbanes.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bCero, bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho,
            bNueve, bDecimal, bIgual, bSumar, bRestar, bMultiplicar, bDividir, bResetear, bBorrar;

    EditText etOperacion, etResultado, etconcatenar;

    double numero1, numero2, resultado;

    String operador = "sinoperador";

    Boolean calculando = false;

    CheckBox cbActivar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bBorrar = findViewById(R.id.bborrar);
        bResetear = findViewById(R.id.bAC);
        bCero = findViewById(R.id.b0);
        bUno = findViewById(R.id.b1);
        bDos = findViewById(R.id.b2);
        bTres = findViewById(R.id.b3);
        bCuatro = findViewById(R.id.b4);
        bCinco = findViewById(R.id.b5);
        bSeis = findViewById(R.id.b6);
        bSiete = findViewById(R.id.b7);
        bOcho = findViewById(R.id.b8);
        bNueve = findViewById(R.id.b9);
        bDecimal = findViewById(R.id.bdecimal);
        bIgual = findViewById(R.id.bigual);
        bSumar = findViewById(R.id.bsumar);
        bRestar = findViewById(R.id.brestar);
        bMultiplicar = findViewById(R.id.bmultiplicar);
        bDividir = findViewById(R.id.bdividir);
        etOperacion = findViewById(R.id.etoperacion);
        etResultado = findViewById(R.id.etresultado);
        cbActivar = findViewById(R.id.cbactivar);


        comprobarEstado();

        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "0");
            }
        });
        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "1");

            }
        });
        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "2");
            }
        });
        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "3");
            }
        });
        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "4");
            }
        });
        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "5");
            }
        });
        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "6");
            }
        });
        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "7");
            }
        });
        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "8");
            }
        });
        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + "9");
            }
        });
        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                etOperacion.setText(etconcatenar.getText().toString() + ".");
            }
        });
        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calculando==false) {
                    operador = "+";
                    etconcatenar = (EditText) findViewById(R.id.etoperacion);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etOperacion.setText(etconcatenar.getText().toString() + operador);
                    calculando = true;
                }
            }
        });
        bRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calculando==false) {
                    operador = "-";
                    etconcatenar = (EditText)findViewById(R.id.etoperacion);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etOperacion.setText(etconcatenar.getText().toString() + operador);
                    calculando = true;
                }
            }
        });
        bMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calculando==false) {
                    operador = "x";
                    etconcatenar = (EditText)findViewById(R.id.etoperacion);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etOperacion.setText(etconcatenar.getText().toString() + operador);
                    calculando = true;
                }
            }
        });
        bDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(calculando==false) {
                    operador = "/";
                    etconcatenar = (EditText)findViewById(R.id.etoperacion);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etOperacion.setText(etconcatenar.getText().toString() + operador);
                    calculando = true;
                }
            }
        });
        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                String text =etconcatenar.getText().toString();
                String result = text.substring(text.indexOf(operador) + 1);
                numero2 = Double.parseDouble(result);

                if(operador.equals("sinoperador")){
                    etconcatenar = (EditText)findViewById(R.id.etoperacion);
                    numero1 = Double.parseDouble(etconcatenar.getText().toString());
                    etOperacion.setText(etconcatenar.getText().toString());
                    resultado = numero1;
                }
                if(operador.equals("+")){
                   resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    resultado = numero1 - numero2;
                }
                if(operador.equals("x")){
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etResultado.setText("Dividir entre 0");
                        etOperacion.setText("Op. No permitida");
                    }
                }
                int tiponumero= comprobarResul(resultado);



                    if (tiponumero==1) {
                        int resultadoEntero = (int) Math.floor(resultado);
                        etResultado.setText(String.valueOf(resultadoEntero) + "=");
                        calculando = true;
                    }else {
                        etResultado.setText(String.valueOf(resultado) + "=");
                        calculando = true;
                    }

            }
        });

        bResetear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etOperacion.setText("");
                etResultado.setText("");
                calculando= false;
            }
        });

        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etoperacion);
                String text =etconcatenar.getText().toString();
                if(text.length()!=0){
                    etconcatenar.setText(text.substring(0,(etconcatenar.getText().length()-1)));
                }

            }
        });
    }

    private void comprobarEstado() {


        if (cbActivar.isChecked() == false) {
            bBorrar.setEnabled(false);
            bResetear.setEnabled(false);
            bCero.setEnabled(false);
            bUno.setEnabled(false);
            bDos.setEnabled(false);
            bTres.setEnabled(false);
            bCuatro.setEnabled(false);
            bCinco.setEnabled(false);
            bSeis.setEnabled(false);
            bSiete.setEnabled(false);
            bOcho.setEnabled(false);
            bNueve.setEnabled(false);
            bDecimal.setEnabled(false);
            bIgual.setEnabled(false);
            bSumar.setEnabled(false);
            bRestar.setEnabled(false);
            bMultiplicar.setEnabled(false);
            bDividir.setEnabled(false);
            etOperacion.setEnabled(false);

            Toast Mensaje = Toast.makeText(getApplicationContext(),
                    "Pulsa ACTIVAR para realizar una operación",Toast.LENGTH_LONG);
            Mensaje.setGravity(Gravity.CENTER, 20, 20);
            Mensaje.show();
        } else{

            bBorrar.setEnabled(true);
            bResetear.setEnabled(true);
            bCero.setEnabled(true);
            bUno.setEnabled(true);
            bDos.setEnabled(true);
            bTres.setEnabled(true);
            bCuatro.setEnabled(true);
            bCinco.setEnabled(true);
            bSeis.setEnabled(true);
            bSiete.setEnabled(true);
            bOcho.setEnabled(true);
            bNueve.setEnabled(true);
            bDecimal.setEnabled(true);
            bIgual.setEnabled(true);
            bSumar.setEnabled(true);
            bRestar.setEnabled(true);
            bMultiplicar.setEnabled(true);
            bDividir.setEnabled(true);
            etOperacion.setEnabled(true);

            etResultado.setText("");
        }
    }


    public void activacion(View view) {



        if (cbActivar.isChecked() == false) {
            bBorrar.setEnabled(false);
            bResetear.setEnabled(false);
            bCero.setEnabled(false);
            bUno.setEnabled(false);
            bDos.setEnabled(false);
            bTres.setEnabled(false);
            bCuatro.setEnabled(false);
            bCinco.setEnabled(false);
            bSeis.setEnabled(false);
            bSiete.setEnabled(false);
            bOcho.setEnabled(false);
            bNueve.setEnabled(false);
            bDecimal.setEnabled(false);
            bIgual.setEnabled(false);
            bSumar.setEnabled(false);
            bRestar.setEnabled(false);
            bMultiplicar.setEnabled(false);
            bDividir.setEnabled(false);
            etOperacion.setEnabled(false);
            etOperacion.setText("");
            etResultado.setText("");
            Toast Mensaje = Toast.makeText(getApplicationContext(),
                    "Pulsa ACTIVAR para realizar una operación",Toast.LENGTH_LONG);
            Mensaje.setGravity(Gravity.CENTER, 20, 20);
            Mensaje.show();
        } else{
            etResultado.setText(" ");
            bBorrar.setEnabled(true);
            bResetear.setEnabled(true);
            bCero.setEnabled(true);
            bUno.setEnabled(true);
            bDos.setEnabled(true);
            bTres.setEnabled(true);
            bCuatro.setEnabled(true);
            bCinco.setEnabled(true);
            bSeis.setEnabled(true);
            bSiete.setEnabled(true);
            bOcho.setEnabled(true);
            bNueve.setEnabled(true);
            bDecimal.setEnabled(true);
            bIgual.setEnabled(true);
            bSumar.setEnabled(true);
            bRestar.setEnabled(true);
            bMultiplicar.setEnabled(true);
            bDividir.setEnabled(true);
            etOperacion.setEnabled(true);
            etOperacion.setText("");
            etResultado.setText("");
        }
    }
    public int comprobarResul(double x) {
        if (x % 1 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
