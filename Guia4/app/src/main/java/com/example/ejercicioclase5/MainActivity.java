package com.example.ejercicioclase5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText textNombre;
    private EditText textHoras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNombre=(EditText)findViewById(R.id.textnom);
        textHoras=(EditText)findViewById(R.id.texthoras);

    }

    public void segundaActividad (View v) {
        String nombre = textNombre.getText().toString();
        String horas = textHoras.getText().toString();
        if(!nombre.equals("") && !horas.equals("")) {

            if(Integer.parseInt(horas) <= 0){
                Toast toastMessage = Toast.makeText(this,"La cantidad de horas deben ser mayores a 0 (cero)",Toast.LENGTH_LONG);
                toastMessage.show();
            }
            else{
            Intent i = new Intent(this, Resultado.class);
            i.putExtra("textnombre", textNombre.getText().toString());
            i.putExtra("texthoras", textHoras.getText().toString());
            startActivity(i);
        }
        }
        else{
            Toast toastMessage = Toast.makeText(this,"Tiene que rellenar todos los campos",Toast.LENGTH_LONG);
            toastMessage.show();
        }
    }
}