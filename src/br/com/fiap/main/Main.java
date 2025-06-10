package br.com.fiap.main;

public class Main {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();

        funcionarioService.registrar("João", "123");
    }
}
