package org.example;

public class ValidadorEmail implements ValidadorCampo{
    
    public ValidadorEmail() {
    }

    public Resultado validarCampo(String valor) {
        if(valor.contains("@") && valor.contains(".")){
            return new Resultado();
        }
        return new Resultado(true, "email inválido: '"+valor+"'");
    }
}
