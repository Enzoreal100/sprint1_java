package br.com.fiap.bean.funcionario;

import java.util.UUID;

public class FuncionarioEntity {
    private UUID id;
    private String nome;
    private String registro;

    public FuncionarioEntity() {
    }
    public FuncionarioEntity(
            String nome,
            String registro
    ) {
        id = UUID.randomUUID();
        nome = this.nome;
        registro = this.registro;
    }


    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
}