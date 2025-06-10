package br.com.fiap.bean.insumo;

import javax.swing.*;
import java.util.List;

public class InsumoController {
    public InsumoController(){}
    InsumoService insumoService = new InsumoService();
    Insumo insumoCheckado;
    String msg;

    public Insumo checkarInsumo(String id){
        insumoCheckado = insumoService.checkarInsumoExistente(id);
        if (insumoCheckado.getQuantidade() == 0) {
            msg = String.format("Insumo %s em falta", insumoCheckado.getNome());
            JOptionPane.showMessageDialog(null, msg);
            return null;
        }
        return insumoCheckado;
    }

    public List<Insumo> listarInsumos(){
        return insumoService.listarInsumos();
    }

    public void retirarInsumo(String id, int quantidade){
        insumoService.retirarInsumo(id, quantidade);
    }
}
