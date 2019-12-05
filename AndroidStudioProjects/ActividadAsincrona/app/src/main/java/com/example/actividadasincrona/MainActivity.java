package com.example.actividadasincrona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Thread.*;

public class MainActivity extends AppCompatActivity {

    private Button Pulsar;
    private TextView Texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//LLamamos a la clase padre reservando el espacio de memoria
        setContentView(R.layout.activity_main);//Enlaza el xml con el main

        //1º Enlazamos el Text View
        Texto =  (TextView)findViewById(R.id.textView);

        //2º Enlazamos el boton
        Pulsar = (Button)findViewById(R.id.Button);

        Pulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TareaAsincronar primeratarea = new TareaAsincronar();
                primeratarea.execute();
            }
        });
    }

    private class TareaAsincronar extends AsyncTask <Void, Void, String>{

        //Este metodo sirve para mandar las tareas en segundo plano y si una tarea asincrona (en un hilo) en android dura mas
        // de 5seg el sistema piensa que se ha colgado y cierra la aplicacion
        @Override
        protected String doInBackground(Void... voids) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);//QUE HAY EN EL STRING ?
            Toast.makeText(MainActivity.this, "QUE PASOO LO CONSEGUISTE", Toast.LENGTH_SHORT).show();//Mensaje que se va a mostrar cuando termine la tarea
        }
    }
}

