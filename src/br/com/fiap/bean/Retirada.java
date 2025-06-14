package br.com.fiap.bean;

import java.time.LocalDate;

public class Retirada {
    private String idRetirada;
    private Insumo insumoRetirado;
    private int quantidade;
    private LocalDate dataRetirada;
    private Funcionario responsavelRetirada;

    public Retirada() {
    }

    public Retirada(String idRetirada, Insumo insumoRetirado, int quantidade, LocalDate dataRetirada, Funcionario responsavelRetirada) {
        this.idRetirada = idRetirada;
        this.insumoRetirado = insumoRetirado;
        this.quantidade = quantidade;
        this.dataRetirada = dataRetirada;
        this.responsavelRetirada = responsavelRetirada;
    }

    public String getIdRetirada() {
        return idRetirada;
    }

    public void setIdRetirada(String idRetirada) {
        this.idRetirada = idRetirada;
    }

    public Insumo getInsumoRetirado() {
        return insumoRetirado;
    }

    public void setInsumoRetirado(Insumo insumoRetirado) {
        this.insumoRetirado = insumoRetirado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Funcionario getResponsavelRetirada() {
        return responsavelRetirada;
    }

    public void setResponsavelRetirada(Funcionario responsavelRetirada) {
        this.responsavelRetirada = responsavelRetirada;
    }

    public void registrarRetirada(){

    }
    public void exibirComprovante(){}
}
