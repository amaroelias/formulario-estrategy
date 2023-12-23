package org.example;

public class ValidadorInteiro implements ValidadorCampo{

    private int valorMinimo;
    private int valorMaximo;

    public ValidadorInteiro(int valorMinimo, int valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }

    public ValidadorInteiro() {
        valorMinimo = -999999999;
        valorMaximo = 999999999;
    }

    public Resultado validarCampo(String valor) {
        if(!valor.matches("[0-9-]+")) return new Resultado(true,"valor não é um inteiro:'"+valor+"'");
        if(Integer.parseInt(valor) < valorMinimo){
            return new Resultado(true,"valor menor que "+valorMinimo+":"+valor);
        }
        if(Integer.parseInt(valor) > valorMaximo){
            return new Resultado(true,"valor maior que "+valorMaximo+":"+valor);
        }
        return new Resultado();
    }
}
