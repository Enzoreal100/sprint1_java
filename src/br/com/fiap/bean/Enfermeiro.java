package br.com.fiap.bean;

import javax.swing.*;

public class Enfermeiro extends Funcionario{

    public Enfermeiro() {
        super();
    }
    public Enfermeiro(String idFuncionario, String nome) {
        super(idFuncionario, nome);
    }

    public String menu (Insumo insumo1, Insumo insumo2){
        try{
            String menu = String.format("Insumos disponíveis:\n%s, %s: %d\n%s, %s: %d\nDigite qual insumo deseja retirar:", insumo1.getIdInsumo(), insumo1.getNome(), insumo1.getQuantidade(), insumo2.getIdInsumo(), insumo2.getNome(), insumo2.getQuantidade());
            String aux = JOptionPane.showInputDialog(menu);
            return aux;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    };

}
