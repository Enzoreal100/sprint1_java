package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class Insumo {
    private String idInsumo;
    private String nome;
    private int quantidade;

    public Insumo() {
    }

    public Insumo(String idInsumo, String nome, int quantidade) {
        this.idInsumo = idInsumo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(String idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Atualizacao atualizar(Insumo insumo, Enfermeiro funcionario){
        try{
            String aux = JOptionPane.showInputDialog("Qual a quantidade que deseja retirar de " + insumo.getNome());
            int quantidadeRetirada = parseInt(aux);
            if (quantidadeRetirada > 1 ){
                if (quantidadeRetirada <= insumo.getQuantidade()){
                    int quantidadeAntes = insumo.getQuantidade();
                    int quantidadeDepois = quantidadeAntes - quantidadeRetirada;
                    insumo.setQuantidade(quantidadeDepois);
                    Atualizacao atualizacao = new Atualizacao(insumo, quantidadeRetirada, LocalDate.now(), funcionario.getNome());
                    return atualizacao;

                }
            }
            throw new Exception("O valor deve ser maior que 0!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Atualizacao atualizar(Insumo insumo, Estoquista funcionario){
        try{
            String aux = JOptionPane.showInputDialog("Qual a quantidade que deseja retirar de " + insumo.getNome());
            int quantidadeReposta = parseInt(aux);
            if (quantidadeReposta > 0 ){
                int quantidadeAntes = insumo.getQuantidade();
                int quantidadeDepois = quantidadeReposta + quantidadeAntes;
                insumo.setQuantidade(quantidadeDepois);
                Atualizacao atualizacao = new Atualizacao(insumo, quantidadeReposta, LocalDate.now(), funcionario.getNome());
                return atualizacao;
            }
            throw new Exception("O valor deve ser maior que 0!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
