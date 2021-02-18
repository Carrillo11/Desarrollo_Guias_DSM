package com.example.ejercicioclase5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView tvNombre;
    private TextView tvHoras;
    private TextView tvSueldo;
    private TextView tvISS;
    private TextView tvAFP;
    private TextView tvRENTA;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNombre=(TextView)findViewById(R.id.txtnomr);
        tvHoras=(TextView)findViewById(R.id.txthorasr);
        tvSueldo=(TextView)findViewById(R.id.txtsal);
        tvISS=(TextView)findViewById(R.id.txtISS);
        tvAFP=(TextView)findViewById(R.id.txtAFP);
        tvRENTA=(TextView)findViewById(R.id.txtRENTA);
        tvTotal=(TextView)findViewById(R.id.txtTotal);
        Bundle bundle = getIntent().getExtras();
        String nombre=bundle.getString("textnombre");
        String horas=bundle.getString("texthoras");
        String sueldo= String.valueOf("$"+(Integer.parseInt(horas)*8.5));

        tvNombre.setText(nombre);
        tvHoras.setText(horas);
        tvSueldo.setText(sueldo);
        tvISS.setText(String.valueOf("-$"+(Integer.parseInt(horas)*8.5)*0.02));
        tvAFP.setText(String.valueOf("-$"+(Integer.parseInt(horas)*8.5)*0.03));
        tvRENTA.setText(String.valueOf("-$"+(Integer.parseInt(horas)*8.5)*0.04));
        tvTotal.setText(String.valueOf("$"+(Integer.parseInt(horas)*8.5-(Integer.parseInt(horas)*8.5)*0.02-(Integer.parseInt(horas)*8.5)*0.03-(Integer.parseInt(horas)*8.5)*0.04)));
    }

}