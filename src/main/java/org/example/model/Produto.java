package org.example.model;

public class Produto {
    private String nomeProduto;
    private double preco;

    public Produto(String nomeProduto, double preco){
        this.nomeProduto=nomeProduto;
        this.preco=preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
