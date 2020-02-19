package com.T2.fibo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class bioFibo extends AppCompatActivity {

    WebView fibo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_fibo);
        fibo= findViewById(R.id.bioFibo);
        fibo.loadUrl("https://es.wikipedia.org/wiki/Leonardo_de_Pisa");
    }
}
