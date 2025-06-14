package br.com.fiap.main;

import br.com.fiap.bean.*;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario;
        Insumo insumoEscolhido;
        Estoquista estoquistaAtivo = new Estoquista("REG001", "Rosevaldo");
        Enfermeiro enfermeiroAtivo = new Enfermeiro("REG002", "Astrogildo");
        Insumo insumo1 = new Insumo("01", "Caixa de Luvas com 50", 10);
        Insumo insumo2 = new Insumo("02", "Caixa de agulhas com 10", 5);
        try {
            String aux = JOptionPane.showInputDialog("Digite o Registro de usuário (Ex. REG003)");
            if (aux.equals(enfermeiroAtivo.getIdFuncionario())){
                funcionario = enfermeiroAtivo;
                JOptionPane.showMessageDialog(null, "Bem vindo: " + funcionario.getNome());
                String escolha = funcionario.menu(insumo1, insumo2);
                if (escolha.equals(insumo1.getIdInsumo())) {
                    insumoEscolhido = insumo1;
                } else if (escolha.equals(insumo2.getIdInsumo())){
                    insumoEscolhido = insumo2;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um id existente");
                    throw new Exception("Escolha um id existente");
                }
                Atualizacao atualizacao = insumoEscolhido.atualizar(insumoEscolhido, enfermeiroAtivo);
                JOptionPane.showMessageDialog(null, String.format("Insumo retirado:\nInsumo: %s\n Quantidade: %d\n Responsável: %s", atualizacao.getInsumoAtualizado().getNome(), atualizacao.getQuantidadeAtualizada(), atualizacao.getResponsavelAtualizacao()));
            }
            else if (aux.equals(estoquistaAtivo.getIdFuncionario())){
                funcionario = estoquistaAtivo;
                JOptionPane.showMessageDialog(null, "Bem vindo: " + funcionario.getNome());
                String escolha = estoquistaAtivo.menu(insumo1, insumo2);
                if (escolha.equals(insumo1.getIdInsumo())) {
                    insumoEscolhido = insumo1;
                } else if (escolha.equals(insumo2.getIdInsumo())){
                    insumoEscolhido = insumo2;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um id existente");
                    throw new Exception("Escolha um id existente");
                }
                Atualizacao atualizacao = insumoEscolhido.atualizar(insumoEscolhido, estoquistaAtivo);
                JOptionPane.showMessageDialog(null, String.format("Insumo atualizado:\nInsumo: %s\n Quantidade: %d\n Responsável: %s", atualizacao.getInsumoAtualizado().getNome(), atualizacao.getQuantidadeAtualizada(), atualizacao.getResponsavelAtualizacao()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Registro de usuário inválido!");
                throw new Exception("Registro de usuário inválido!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
