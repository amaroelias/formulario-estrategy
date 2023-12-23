package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Formulario {

    private String titulo;
    private LinkedHashMap<String, ItemFormulario> itensFormularioList;

    public Formulario(String titulo) {
        this();
        this.titulo = titulo;
    }

    public Formulario() {
        this.titulo = "";
        this.itensFormularioList = new LinkedHashMap<>();
    }

    public void addItemFormulario(ItemFormulario itemFormulario) {
        if(itensFormularioList.containsKey(itemFormulario.getId())){
            throw new IllegalArgumentException("'"+itemFormulario.getId()+"' já existe");
        }

        itensFormularioList.put(itemFormulario.getId(),itemFormulario);
    }

    public ItemFormulario getItemFormulario(String id) {
        return itensFormularioList.get(id);
    }

    public Map<String, ItemFormulario> getItensFormulario() {
        return itensFormularioList;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Resultado validar() {
        Resultado resultado = new Resultado();
        if(itensFormularioList.isEmpty()) return resultado;
        for(ItemFormulario itemFormulario : itensFormularioList.values()){
            if(itemFormulario.validar().isErro()){
                resultado.setErro(true);
                for(String mensagem : itemFormulario.validar().getMensagens()){
                    resultado.addMensagem(mensagem);
                }
            }
        }
        return resultado;
    }

}
