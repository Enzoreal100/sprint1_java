package br.com.fiap.main;

import br.com.fiap.bean.funcionario.Funcionario;
import br.com.fiap.bean.funcionario.FuncionarioController;
import br.com.fiap.bean.insumo.Insumo;
import br.com.fiap.bean.insumo.InsumoController;

import javax.swing.*;

import static java.lang.Integer.parseInt;

/* Funcionarios mockados:
        Nome: Astrogildo Silva, Registro: REG001;
        Nome: Rosevaldo Oliveira, Registro: REG002
        Nome: Domênico Santos, Registro: REG003

   Insumos mockados:
        Id: 1, Nome: Caixa com 50 agulhas, Quantidade: 25
        Id: 2, Nome: Caixa com 50 catéters, Quantidade: 10
        Id: 3, Nome: Tubos de coleta 5ml, Quantidade: 170
 */
public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioAtivo;
        String aux;
        Insumo insumoSelecionado;
        int quantidade;
        String msg;
        FuncionarioController funcionarioController = new FuncionarioController();
        InsumoController insumoController = new InsumoController();

        aux = JOptionPane.showInputDialog(null, "Digite o registro do funcionário: ");
        funcionarioAtivo = funcionarioController.checkarFuncionarioExistente(aux);
        if (funcionarioAtivo == null){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException("Funcionario não encontrado");
        }
        JOptionPane.showMessageDialog(null, "Bem vindo: " + funcionarioAtivo.getNome());

        msg = "Insumos Disponíveis: \n";
        for (Insumo insumo: insumoController.listarInsumos()) {
            msg += String.format("Id: %s, Nome: %s, Quantidade: %d\n", insumo.getId(), insumo.getNome(), insumo.getQuantidade());
        }
        msg += "\nDigite o Id do insumo desejado: ";

        aux = JOptionPane.showInputDialog(null, msg);
        insumoSelecionado = insumoController.checkarInsumo(aux);
        quantidade = parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade desejada: "));
        insumoController.retirarInsumo(insumoSelecionado.getId(), quantidade);
        // TODO: Implementar a lista de insumos retirados


    }
}
