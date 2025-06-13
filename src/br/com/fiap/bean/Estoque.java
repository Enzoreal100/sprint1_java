package br.com.fiap.bean;

public class Estoque {
    private String idLocalEstoque;
    private Insumo insumo;
    private int quantidade;

    public Estoque() {
    }

    public Estoque(String idLocalEstoque, Insumo insumo, int quantidade) {
        this.idLocalEstoque = idLocalEstoque;
        this.insumo = insumo;
        this.quantidade = quantidade;
    }

    public String getIdLocalEstoque() {
        return idLocalEstoque;
    }

    public void setIdLocalEstoque(String idLocalEstoque) {
        this.idLocalEstoque = idLocalEstoque;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
