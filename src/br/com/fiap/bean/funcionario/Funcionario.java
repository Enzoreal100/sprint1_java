package br.com.fiap.bean.funcionario;

import java.util.UUID;

public class Funcionario {
    private UUID id;
    private String nome;
    private String registro;

    public Funcionario(
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

    public Funcionario registrar(String nome, String registro) {
        try{
            if (nome != null && nome.length() > 2){
                if (registro != null && registro.length() > 2){
                    Funcionario funcionario = new Funcionario(nome, registro);
                    System.out.println(funcionario.getNome());
                    System.out.printf("Usuário %s criado com sucesso!", funcionario.getNome());
                    return funcionario;
                } else {
                    throw new Error("O registro deve ter mais de 2 caracteres");
                }
            } else {
                throw new Error("O nome deve ter mais de 2 caracteres");
            }
        }catch (Exception err) {
            throw new Error(err);
        }
    };
}