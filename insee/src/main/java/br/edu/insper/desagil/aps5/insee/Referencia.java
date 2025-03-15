package br.edu.insper.desagil.aps5.insee;

public class Referencia {

    private String observacao;

    public Referencia() {
        this.observacao = "";
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public int comoInteiro() {
        return 0;
    }
}