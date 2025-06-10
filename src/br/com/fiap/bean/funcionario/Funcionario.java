package br.com.fiap.bean.funcionario;

import java.util.UUID;

public class Funcionario {
    private String nome;
    private String registro;

    protected Funcionario(
    ) {
    }

    public String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegistro() {
        return registro;
    }
    protected void setRegistro(String registro) {
        this.registro = registro;
    }

}