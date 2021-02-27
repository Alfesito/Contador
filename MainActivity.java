package es.upm.dit.adsw.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        //logica del programa
        int cont = 0;

        public void suma (View view){
            cont++;
            imprimir();
        }

        public void resta (View view){
            if(cont <= 0){
                cont = 0;
            }else{
                cont--;
            }

            imprimir();
        }

        public void reset (View view){
            cont = 0;
            imprimir();
        }

        public void imprimir (){
            TextView resultado = (TextView) findViewById(R.id.contador);    //id del cuadro de texto
            resultado.setText(""+cont);      // Lo que se va a imprimir
        }
    }

