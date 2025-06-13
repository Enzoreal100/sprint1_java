package br.com.fiap.bean;

public class Insumo {
    private String idInsumo;
    private String nome;

    public Insumo() {
    }

    public Insumo(String idInsumo, String nome) {
        this.idInsumo = idInsumo;
        this.nome = nome;
    }

    public String getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(String idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
