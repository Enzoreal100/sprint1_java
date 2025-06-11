package br.com.fiap.bean.retirada;

public class RetiradaController {
    RetiradaService retiradaService = new RetiradaService();

    public RetiradaController() {
    }

    public void registrarRetirada(String registroFuncinario, String idInsumo, String nomeInsumo, int quantidadeRetirada) {
        this.retiradaService.registrarRetirada(registroFuncinario, idInsumo, nomeInsumo,quantidadeRetirada);
    }

    public String listarRetiradas() {
        return this.retiradaService.listarRetiradas();
    }
}
