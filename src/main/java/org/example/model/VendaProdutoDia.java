package org.example.model;

public class VendaProdutoDia extends Barraca implements VendasVoluntarios {
    public int quantidadevendida;
    private double rendimento;

    enum Classificacao{
        Bronze, Prata, Ouro
    }

    public VendaProdutoDia(int quantidadevendida, double rendimento){
        this.quantidadevendida=quantidadevendida;
    }

    public int getQuantidadevendida() {
        return quantidadevendida;
    }

    public void setQuantidadevendida(int quantidadevendida) {
        this.quantidadevendida = quantidadevendida;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public String toString() {
        return "Quantidade vendida:" +quantidadevendida + ", Rendimento:" +rendimento;
    }

    @Override
    public Classificacao calcularVendasVoluntarios() {
        if(rendimento<500){
            return Classificacao.Bronze;
        }
        if(rendimento>=500 && rendimento<=100){
            return Classificacao.Prata;
        }
        else {
            return Classificacao.Ouro;
        }
    }
}
