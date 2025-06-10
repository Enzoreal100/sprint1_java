package br.com.fiap.main;

import br.com.fiap.bean.funcionario.Funcionario;
import br.com.fiap.bean.funcionario.FuncionarioController;
import br.com.fiap.bean.funcionario.FuncionarioService;

public class Main {
    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        funcionarioController.registrar("Enzo", "123");

    }
}
