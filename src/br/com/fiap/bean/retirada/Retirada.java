package br.com.fiap.bean.retirada;

import java.util.UUID;

public class Retirada {
    private String id = UUID.randomUUID().toString();
    private String registroFuncionario;
    private String idInsumo;
    private String nomeInsumo;
    private String dataRetirada = String.valueOf(System.currentTimeMillis());;
    private int quantidadeRetirada;

    protected Retirada() {
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    public String getRegistroFuncionario() {
        return registroFuncionario;
    }

    protected void setRegistroFuncionario(String registroFuncionario) {
        this.registroFuncionario = registroFuncionario;
    }

    public String getIdInsumo() {
        return idInsumo;
    }

    protected void setIdInsumo(String idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    protected void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public int getQuantidadeRetirada() {
        return quantidadeRetirada;
    }

    protected void setQuantidadeRetirada(int quantidadeRetirada) {
        this.quantidadeRetirada = quantidadeRetirada;
    }

    public String getNomeInsumo() {
        return nomeInsumo;
    }

    protected void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }
}
