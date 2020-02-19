package com.T2.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Facto extends AppCompatActivity {

    TextView res;
    TextView proc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facto);
        res=findViewById(R.id.res);
        proc=findViewById(R.id.proc);
        int fac=getIntent().getIntExtra("fact",0);
        String pro="1";
        int fact=1;
        for(int i=2; i<=fac;i++)
        {
            fact=fact*i;
            pro=pro+"*"+i;
        }
        res.setText("Resultado: "+fact);
        proc.setText("M: "+pro);
    }
}
