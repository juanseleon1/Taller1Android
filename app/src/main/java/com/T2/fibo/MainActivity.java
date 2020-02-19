package com.T2.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    Button boton;
    Button botonF;
    Button botonP;
    EditText texto;
    ImageButton bioFib;
    Spinner sp;
    TextView fiboI;
    TextView fiboD;
    TextView factI;
    TextView factD;
    int contFac=0;
    int contFib=0;
    int fibAct=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton= findViewById(R.id.fibo);
        botonF=findViewById(R.id.botonF);
        botonP=findViewById(R.id.paises);
        texto= findViewById(R.id.fiboing);
        bioFib=findViewById(R.id.img);
        sp=findViewById(R.id.spinnerF);
        fiboI=findViewById(R.id.fiboI);
        fiboD=findViewById(R.id.fiboD);
        factI=findViewById(R.id.factI);
        factD=findViewById(R.id.factD);
        fiboI.setText(fiboI.getText()+" 0");
        factI.setText(factI.getText()+" 0");
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String s=texto.getText().toString();
                if(!s.equalsIgnoreCase(""))
                {
                    int pos=Integer.parseInt(s);
                    Intent intent= new Intent(v.getContext(), Fibo.class);
                    intent.putExtra("pos",pos);
                    fibAct=1;
                    startActivity(intent);
                }
                else
                {
                 Toast.makeText(v.getContext(),"Ingrese la posicion deseada",Toast.LENGTH_SHORT).show();
                }

            }


        });

        bioFib.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(v.getContext(), bioFibo.class);
                fibAct=2;
                startActivity(intent);
            }


        });
        botonF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                int fac=Integer.parseInt((String)sp.getSelectedItem());
                Intent intent= new Intent(v.getContext(), Facto.class);
                fibAct=3;
                intent.putExtra("fact",fac);
                startActivity(intent);
            }


        });
        botonP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent= new Intent(v.getContext(), PaisesAct.class);
                fibAct=2;
                startActivity(intent);
            }


        });

    }
    @Override
    public void onResume(){
        super.onResume();
      switch (fibAct)
      {
          case 1:
              contFib++;
              fiboI.setText(getResources().getString(R.string.fiboI)+" "+contFib);
              fiboD.setText(getResources().getString(R.string.fecha)+" "+ LocalDateTime.now());
              break;
          case 3:
              contFac++;
              factI.setText(getResources().getString(R.string.factI)+" "+contFac);
              factD.setText(getResources().getString(R.string.fecha)+" "+ LocalDateTime.now());
              break;
          default:
              break;
      }

    }
}
