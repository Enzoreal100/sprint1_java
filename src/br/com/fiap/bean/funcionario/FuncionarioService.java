package br.com.fiap.bean.funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios;
    protected FuncionarioService() {
        this.funcionarios = new ArrayList<>();
    }

    protected void registrar(String nome, String registro) {
        try {
            if (nome.length() > 2) {
                if (registro.length() != 6) {
                    Funcionario funcionario = new Funcionario();
                    funcionario.setNome(nome);
                    funcionario.setRegistro(registro);
                    this.funcionarios.add(funcionario);
                    System.out.println("Funcionário " + funcionario.getNome() + " registrado com sucesso!");
                } else {
                    throw new Error("O registro deve ter exatamente 6 caracteres");
                }
            } else {
                throw new Error("O nome deve ter mais de 2 caracteres");
            }
        }catch (Exception err) {
            throw new Error(err);
        }
    }


}
