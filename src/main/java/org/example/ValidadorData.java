package org.example;

import java.util.Calendar;

public class ValidadorData implements ValidadorCampo{
    private Calendar dataMinima;
    private Calendar dataMaxima;

    public ValidadorData(Calendar dataMinima, Calendar dataMaxima) {
        this.dataMinima = dataMinima;
        this.dataMaxima = dataMaxima;
    }

    public Resultado validarCampo(String valor) {
        return null;
    }
}
