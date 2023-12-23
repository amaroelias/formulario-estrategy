package org.example;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

    private List<String> listaResultados;
    private boolean erro;


    public Resultado(){
        this.listaResultados = new ArrayList<>();
        this.erro = false;
    }
    public Resultado(boolean erro){
        this.listaResultados = new ArrayList<>();
        this.erro = erro;
    }
    public Resultado(boolean erro, String mensagem){
        this.listaResultados = new ArrayList<>();
        this.erro = erro;
        this.listaResultados.add(mensagem);
    }

    public boolean isErro() {
        return erro;
    }

    public List<String> getMensagens() {
        return listaResultados;
    }

    public void setErro(boolean erro) {
        this.erro = erro;
    }

    public void addMensagem(String mensagem) {
        listaResultados.add(mensagem);
    }
}
