package br.com.fiap.main;

import br.com.fiap.bean.funcionario.FuncionarioEntity;
import br.com.fiap.bean.funcionario.FuncionarioService;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        FuncionarioEntity[] funcionarios  = new FuncionarioEntity[10];
        FuncionarioService funcionarioService = new FuncionarioService();

        funcionarios[0] = funcionarioService.registrar("João", "123456");
    }

    public static void listarFuncionarios(FuncionarioEntity[] funcionarios) {
        for(int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] != null) {
                System.out.printf("Nome: %s\nRegistro: %s\n", funcionarios[i].getNome(), funcionarios[i].getRegistro());
            }
        }
    }

}
