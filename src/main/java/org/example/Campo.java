package org.example;

import java.util.Objects;

public class Campo implements ItemFormulario{
    private ValidadorCampo validadorCampo;
    private String id;
    private String nome;
    private boolean obrigatorio;
    private String valor;

    public Campo(String id){
        this.id = id;
        this.obrigatorio = false;
        this.nome = "";
        this.valor = "";
        this.validadorCampo = null;
    }
    public Campo(String id, boolean obrigatorio){
        this.id = id;
        this.obrigatorio = obrigatorio;
        this.nome = "";
        this.valor = "";
        this.validadorCampo = null;
    }
    public Campo(String id, String nome){
        this.id = id;
        this.obrigatorio = false;
        this.nome = nome;
        this.valor = "";
        this.validadorCampo = null;
    }
    public Campo(String id, boolean obrigatorio, String nome){
        this.id = id;
        this.obrigatorio = obrigatorio;
        this.nome = nome;
        this.valor = "";
        this.validadorCampo = null;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return null;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public boolean isPreenchido() {
        return !Objects.equals(valor, "");
    }

    public boolean isEmpty() {
        return Objects.equals(valor, "");
    }

    public String getValor() {
        return valor;
    }

    public boolean isObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public Resultado validar() {
        if(validadorCampo == null && !isObrigatorio()) return new Resultado();
        if(isObrigatorio() && !isPreenchido()) return new Resultado(true, id+": "+id+" é obrigatório e não foi preenchido");
        if(validadorCampo == null && isPreenchido()) return new Resultado();
        if(validadorCampo != null && !isPreenchido()) return new Resultado();
        return validadorCampo.validarCampo(valor);
    }

    public void setValidador(ValidadorCampo validadorCampo) {
        this.validadorCampo = validadorCampo;
    }
}
