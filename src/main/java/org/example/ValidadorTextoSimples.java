package org.example;

public class ValidadorTextoSimples implements ValidadorCampo{
    private int minimoLetras;
    private int maximoLetras;

    public ValidadorTextoSimples(int minimoLetras, int maximoLetras) {
        if(minimoLetras < 0 || maximoLetras < 0){
            throw new IllegalArgumentException("invalido min="+minimoLetras+", max="+maximoLetras);
        }
        this.minimoLetras = minimoLetras;
        this.maximoLetras = maximoLetras;
    }

    public ValidadorTextoSimples() {
        this.minimoLetras = 0;
        this.maximoLetras = 999999999;
    }

    public Resultado validarCampo(String valor) {
        if(valor == null) return new Resultado(true,"valor: "+valor);

        if(valor.length() < minimoLetras){
            return new Resultado(true,"ERRO: tamanho do valor < "+minimoLetras+": '"+valor+"'");
        }
        if(valor.length() > maximoLetras){
            return new Resultado(true, "ERRO: tamanho do valor > "+maximoLetras+": '"+valor+"'");
        }
        return new Resultado();
    }
}
