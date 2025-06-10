package br.com.fiap.bean.funcionario;

public class FuncionarioController{
    public FuncionarioController() {
    }

    FuncionarioService funcionarioService = new FuncionarioService();

    public Funcionario checkarFuncionarioExistente(String registro){
        return funcionarioService.checkarFuncionarioExistente(registro);
    }
}
