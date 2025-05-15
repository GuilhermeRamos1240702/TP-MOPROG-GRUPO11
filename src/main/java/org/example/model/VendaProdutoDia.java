package org.example.model;

public class VendaProdutoDia extends Barraca {
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

}
