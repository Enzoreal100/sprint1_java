package br.com.fiap.bean;

import java.time.LocalDate;

public class RelatorioConsumo {
    private LocalDate dataGeracao;

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public relatorioConsumo(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }
}
