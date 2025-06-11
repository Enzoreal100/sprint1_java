package br.com.fiap.bean.insumo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InsumoService {
    private List<Insumo> insumos;
    protected InsumoService() {
        this.insumos = new ArrayList<>();
        Insumo insumo1 = new Insumo();
        insumo1.setId("1");
        insumo1.setNome("Caixa com 50 agulhas");
        insumo1.setQuantidade(25);
        this.insumos.add(insumo1);

        Insumo insumo2 = new Insumo();
        insumo2.setId("2");
        insumo2.setNome("Caixa com 50 catéters");
        insumo2.setQuantidade(10);
        this.insumos.add(insumo2);

        Insumo insumo3 = new Insumo();
        insumo3.setId("3");
        insumo3.setNome("Tubos de coleta 5ml");
        insumo3.setQuantidade(170);
        this.insumos.add(insumo3);
    }

    public Insumo checkarInsumoExistente(String id){
        for(Insumo insumo: this.insumos) {
            if (insumo.getId().equals(id)){
                return insumo;
            }
        }
        JOptionPane.showMessageDialog(null, "Insumo inexistente");
        return null;
    }

    public List<Insumo> listarInsumos(){
        List<Insumo> insumosFiltrados = new ArrayList<>();
        for(Insumo insumo: this.insumos) {
            if (insumo.getQuantidade() > 0){
                insumosFiltrados.add(insumo);
            }
        }
        return insumosFiltrados;
    }

    public boolean retirarInsumo(String id, int quantidade){
        if (quantidade <= 0){
            JOptionPane.showMessageDialog(null, "Quantidade inválida");
            return false;
        }
        for(Insumo insumoAux: this.insumos) {
            if (insumoAux.getId().equals(id)){
                if (insumoAux.getQuantidade() < quantidade){
                    JOptionPane.showMessageDialog(null, "Quantidade indisponível");
                    return false;
                }
                int quantidadeInicial = insumoAux.getQuantidade();
                insumoAux.setQuantidade(quantidadeInicial-quantidade);
                JOptionPane.showMessageDialog(null, "Insumo " + insumoAux.getNome() + "registrado para retirada");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Insumo Inexistente");
        return false;
    }
}
