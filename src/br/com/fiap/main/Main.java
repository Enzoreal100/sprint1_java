package br.com.fiap.main;

import br.com.fiap.bean.funcionario.Funcionario;
import br.com.fiap.bean.funcionario.FuncionarioController;
import br.com.fiap.bean.insumo.Insumo;
import br.com.fiap.bean.insumo.InsumoController;
import br.com.fiap.bean.retirada.RetiradaController;

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
        String listagemMsg;
        boolean retiradaFeita;
        FuncionarioController funcionarioController = new FuncionarioController();
        InsumoController insumoController = new InsumoController();
        RetiradaController retiradaController = new RetiradaController();

        aux = JOptionPane.showInputDialog(null, "Digite o registro do funcionário: ");
        funcionarioAtivo = funcionarioController.checkarFuncionarioExistente(aux);
        if (funcionarioAtivo == null){
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            throw new RuntimeException("Funcionario não encontrado");
        }
        JOptionPane.showMessageDialog(null, "Bem vindo: " + funcionarioAtivo.getNome());
        while (true) {
            msg = "Insumos Disponíveis: \n";
            for (Insumo insumo : insumoController.listarInsumos()) {
                msg += String.format("Id: %s, Nome: %s, Quantidade: %d\n", insumo.getId(), insumo.getNome(), insumo.getQuantidade());
            }
            msg += "\nDigite o Id do insumo desejado: ";

            aux = JOptionPane.showInputDialog(null, msg);
            insumoSelecionado = insumoController.checkarInsumo(aux);
            quantidade = parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade desejada: "));

            retiradaFeita = insumoController.retirarInsumo(insumoSelecionado.getId(), quantidade);
            if (retiradaFeita) {
                retiradaController.registrarRetirada(funcionarioAtivo.getRegistro(), insumoSelecionado.getId(), insumoSelecionado.getNome(), quantidade);
            }
            else{
                continue;
            }
            int continua = JOptionPane.showConfirmDialog(null, "Deseja retirar outro insumo?");
            if (continua == 1){
                break;
            }
        }
        listagemMsg = "Retiradas feitas pelo funcionário: "+ funcionarioAtivo.getNome() + "\n" + retiradaController.listarRetiradas();
        JOptionPane.showMessageDialog(null, listagemMsg);
    }
}
