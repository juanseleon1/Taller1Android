package com.T2.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {

    TextView capital;
    TextView nomp;
    TextView nompi;
    TextView sigla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        capital=findViewById(R.id.capital);
        nomp=findViewById(R.id.nomp);
        nompi=findViewById(R.id.nompi);
        sigla=findViewById(R.id.sigla);
        Pais p=(Pais)getIntent().getSerializableExtra("pais");
        capital.setText(capital.getText()+p.getCapital());
        nomp.setText(nomp.getText()+p.getNomp());
        nompi.setText(nompi.getText()+p.getNompI());
        sigla.setText(sigla.getText()+p.getSigla());
    }
}
