package br.com.fiap.bean.funcionario;

public class FuncionarioController{
    public FuncionarioController() {
    }

    FuncionarioService funcionarioService = new FuncionarioService();

    public void registrar(String nome, String registro) {
        funcionarioService.registrar(nome, registro);
    }
}
