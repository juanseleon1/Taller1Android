package com.T2.fibo;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

class Pais implements Serializable {
    private String capital;
    private String nomp;
    private String nompI;
    private String sigla;

    public Pais(JSONObject jsonObject) throws JSONException {
        capital=jsonObject.getString("capital");
        nomp=jsonObject.getString("nombre_pais");
        nompI=jsonObject.getString("nombre_pais_int");
        sigla=jsonObject.getString("sigla");

    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getNompI() {
        return nompI;
    }

    public void setNompI(String nompI) {
        this.nompI = nompI;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString()
    {
        return nomp;
    }
}
