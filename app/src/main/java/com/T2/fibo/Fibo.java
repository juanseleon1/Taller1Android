package com.T2.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Fibo extends AppCompatActivity {
    LinearLayout ll;
    Button boton;
    int [] fibo={0,1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);
        int pos=getIntent().getIntExtra("pos",0);
        boton=findViewById(R.id.fiboAtras);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Fibo.super.onBackPressed();
            }


        });
        ll= findViewById(R.id.ll);
        double f0=0,f1=1,actual;
        for(int i=0;i<=pos;i++)
        {
            if(i==0)
                actual=f0;
            else if(i==1)
                actual=f1;
            else
            {
                actual=f1+f0;
                f0=f1;
                f1=actual;
            }
            TextView texto= new TextView(this);
            texto.setText(""+i+": "+new DecimalFormat("#").format(actual));
            texto.setLayoutParams(params);
            ll.addView(texto);
        }
        ;
    }
}
