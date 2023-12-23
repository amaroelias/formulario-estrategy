package org.example;

public interface ItemFormulario {
    public String getId();
    public String getLabel();
    public void setValor(String valor);
    public Resultado validar();
    public void setObrigatorio(boolean obrigatorio);
    public boolean isObrigatorio();
    public boolean isPreenchido();
    public boolean isEmpty();
    public String getNome();
}
