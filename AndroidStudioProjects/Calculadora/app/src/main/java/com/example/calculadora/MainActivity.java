package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   private double resultado = 0;
   private TextView texto1, texto2, texto3;
   private Button prueba, boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonPunto, botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual, botonC, botonMasMenos;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState); //LLamo a la clase padre reservando el espacio de memoria
        setContentView(R.layout.activity_main); //R Es el objeto que representa al sistema y a veces el objeto R suele....

        //ASOCIAMOS CADA BOTON DE NUESTRA CALCULADORA  A SU VARIABLE CORRESPONDIENTE SEGUN TIPO

        //1º Enlazamos los Text View

        texto1 =  (TextView)findViewById(R.id.textView2);
        texto2 = (TextView)findViewById(R.id.textView1);
        texto3 = (TextView)findViewById(R.id.textView3);

        //2º Enlazamos los bottones y programamos las funciones de cada uno

        //Insertar números naturales

        boton1 = (Button)findViewById(R.id.Button14);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

                texto2.setText(texto2.getText() + "1");
                texto3.setText(texto3.getText() + "1");
            }
        });


        boton2 = (Button)findViewById(R.id.Button15);

        boton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                texto2.setText(texto2.getText() + "2");
                texto3.setText(texto3.getText() + "2");
            }

        });

        boton3 = (Button)findViewById(R.id.Button16);

        boton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                texto2.setText(texto2.getText() + "3");
                texto3.setText(texto3.getText() + "3");
            }
        });

        boton4 = (Button)findViewById(R.id.Button10);

        boton4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "4");
                texto3.setText(texto3.getText() + "4");
            }
        });

        boton5 = (Button)findViewById(R.id.Button11);

        boton5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "5");
                texto3.setText(texto3.getText() + "5");
            }
        });

        boton6 = (Button)findViewById(R.id.Button12);

        boton6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "6");
                texto3.setText(texto3.getText() + "6");
            }
        });

        boton7 = (Button)findViewById(R.id.Button02);

        boton7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "7");
                texto3.setText(texto3.getText() + "7");
            }
        });

        boton8 = (Button)findViewById(R.id.Button06);

        boton8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "8");
                texto3.setText(texto3.getText() + "8");
            }
        });
        boton9 = (Button)findViewById(R.id.Button07);

        boton9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + "9");
                texto3.setText(texto3.getText() + "9");
            }
        });

        boton0 = (Button)findViewById(R.id.Button17);

        boton0.setOnClickListener(new View.OnClickListener() {

          public void onClick(View v) {

              texto2.setText(texto2.getText() + "0");
              texto3.setText(texto3.getText() + "0");
          }
        });

        botonPunto = (Button)findViewById(R.id.Button18);

        botonPunto.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                texto2.setText(texto2.getText() + ".");
                texto3.setText(texto3.getText() + ".");
            }
        });

        //INSERTAMOS LAS OPERACIONES

        //BORRADO

        botonC = (Button)findViewById(R.id.Button05);
        botonC.setOnClickListener (new View.OnClickListener() {

            public void onClick(View v) {

                resultado = 0;
                texto2.setText("");
            }
        });

        //DIVISION
        botonDivision = (Button)findViewById(R.id.Button04);

        botonDivision.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                resultado = Double.valueOf((String)  texto2.getText()).doubleValue();
                texto2.setText("");
                texto1.setText("/");
                texto3.setText(texto3.getText() + "/");

            }
        });

        //SUMA
        botonSuma = (Button)findViewById(R.id.Button09);

        botonSuma.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                resultado = Double.valueOf((String)  texto2.getText()).doubleValue();
                texto2.setText("");
                texto1.setText("+");
                texto3.setText(texto3.getText() + "+");

            }
        });

        //RESTA
        botonResta = (Button)findViewById(R.id.Button08);

        botonResta.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                resultado = Double.valueOf((String)  texto2.getText()).doubleValue();
                texto2.setText("");
                texto1.setText("-");
                texto3.setText(texto3.getText() + "-");

            }
        });

        //MULTIPLICACION
        botonMultiplicacion = (Button)findViewById(R.id.Button01);

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                resultado = Double.valueOf((String)  texto2.getText()).doubleValue();
                texto2.setText("");
                texto1.setText("X");
                texto3.setText(texto3.getText() + "x");
            }
        });

        //BOTON DE BORRADO TOTAL = C
        botonC = (Button)findViewById(R.id.Button05);

        botonC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                resultado = 0;
                texto2.setText("");
                texto1.setText("");
                texto3.setText("");
            }
        });

        //BOTON DE +/-
        botonMasMenos = (Button)findViewById(R.id.Button03);

        botonMasMenos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (texto2.getText().charAt(0) == '-')
                    texto2.setText(texto2.getText().subSequence(1, texto2.getText().length() - 1));

                else
                    texto2.setText("-" + texto2.getText().toString());
            }
        });

        //BOTON RESULTADO =
        botonIgual = (Button)findViewById(R.id.Button13);

        botonIgual.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double numero = Double.valueOf((String)  texto2.getText()).doubleValue();
                String operacion = texto1.getText().toString();

                if(operacion != ""){

                    if (operacion == "+") {
                        resultado = numero + resultado;
                    }else if (operacion == "-") {
                        resultado = resultado - numero;
                    }else if (operacion == "X") {
                        resultado = resultado * numero;
                    }else if (operacion == "/")
                        resultado = resultado / numero;

                    String resultadoFinal = String.valueOf( resultado );
                    int longitud = resultadoFinal.length();

                    //Si acaba en .0 muestro como entero
                    if ((resultadoFinal.charAt(longitud - 2) == '.') && (resultadoFinal.charAt(longitud - 1) == '0'))
                        resultadoFinal = resultadoFinal.substring(0, resultadoFinal.length() - 2);
                    texto2.setText(resultadoFinal);
                    texto1.setText("");
                }
            }
        });
    }




}
