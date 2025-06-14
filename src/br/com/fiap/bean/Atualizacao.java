package br.com.fiap.bean;

import java.time.LocalDate;

public class Atualizacao {
    private Insumo insumoAtualizado;
    private int quantidadeAtualizada;
    private LocalDate dataAtualizacao;
    private String responsavelAtualizacao;

    public Atualizacao() {
    }

    public Atualizacao(Insumo insumoAtualizado, int quantidadeAtualizada, LocalDate dataAtualizacao, String responsavelAtualizacao) {
        this.insumoAtualizado = insumoAtualizado;
        this.quantidadeAtualizada = quantidadeAtualizada;
        this.dataAtualizacao = dataAtualizacao;
        this.responsavelAtualizacao = responsavelAtualizacao;
    }

    public Insumo getInsumoAtualizado() {
        return insumoAtualizado;
    }

    public void setInsumoAtualizado(Insumo insumoAtualizado) {
        this.insumoAtualizado = insumoAtualizado;
    }

    public int getQuantidadeAtualizada() {
        return quantidadeAtualizada;
    }

    public void setQuantidadeAtualizada(int quantidadeAtualizada) {
        this.quantidadeAtualizada = quantidadeAtualizada;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getResponsavelAtualizacao() {
        return responsavelAtualizacao;
    }

    public void setResponsavelAtualizacao(String responsavelAtualizacao) {
        this.responsavelAtualizacao = responsavelAtualizacao;
    }

}
