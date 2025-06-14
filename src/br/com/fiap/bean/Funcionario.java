package br.com.fiap.bean;

import javax.swing.*;

public class Funcionario {
    private String idFuncionario;
    private String nome;

    public Funcionario() {
    }

    public Funcionario(String idFuncionario, String nome) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String menu (Insumo insumo1, Insumo insumo2){ return null; };

}
