package org.example.model;

public class StockProdutoDia extends Barraca {
    private String nomeproduto;
    private int quantidadetotal;
    private double preco;


    public StockProdutoDia(String nomestock, int quantidade, double preco){
        this.nomeproduto=nomeproduto;
        this.quantidadetotal=quantidadetotal;
        this.preco=preco;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public int getQuantidadetotal() {
        return quantidadetotal;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadetotal = quantidadetotal;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
