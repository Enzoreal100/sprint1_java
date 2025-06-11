package br.com.fiap.bean.retirada;

import java.util.ArrayList;
import java.util.List;

public class RetiradaService {
    private List<Retirada> retiradas;
    protected RetiradaService() {
        this.retiradas = new ArrayList<>();
    }

    public void registrarRetirada(String registroFuncinario, String idInsumo, String nomeInsumo, int quantidadeRetirada) {
        Retirada retirada = new Retirada();
        retirada.setRegistroFuncionario(registroFuncinario);
        retirada.setIdInsumo(idInsumo);
        retirada.setNomeInsumo(nomeInsumo);
        retirada.setQuantidadeRetirada(quantidadeRetirada);
        this.retiradas.add(retirada);
    }

    public String listarRetiradas() {
        String retiradasMsg = "";
        for (Retirada retirada : retiradas) {
            retiradasMsg += String.format("Insumo: %s Quantidade Retirada: %d\n", retirada.getNomeInsumo(), retirada.getQuantidadeRetirada());
        }
        return retiradasMsg;
    }
}
