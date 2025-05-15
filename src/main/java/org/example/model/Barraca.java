package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Barraca extends Federacao implements VendasVoluntarios, StocksFinaisDiariosBarracas {

    private String instituicao;
    private List<Voluntario> voluntarios;
    private List<StockProdutoDia> stockProdutoDias;
    private List<VendaProdutoDia> vendaProdutoDias;
    private List<Escala> arrEscala;

    @Override
    public Classificacao calcularStocksFinaisDiariosBarracas() {
        return null;
    }

    @Override
    public Classificacao calcularVendasVoluntarios() {
        return null;
    }

    enum Classificacao{
        Bronze, Prata, Ouro
    }

    public Barraca() {
    }

    public void adicionarStocks(StockProdutoDia s){
        if (s != null) {
            stockProdutoDias.add(s);
        }
    }


    public boolean adicionarVoluntarioBarraca(Voluntario v, List<Escala> arrEscala, List<Barraca> todasBarracas, int dia) {
        Escala e = null;
        for (Barraca barraca : todasBarracas) {
            e = (Escala) barraca.getArrEscala(dia);
            if (e != null && e.getVoluntariosescala().contains(v)) {
                System.out.println("Erro: Voluntário já está escalado em outra barraca no dia " + dia);
                return false;
            }
        }


        //Verificar se o funcionário pertence á mesma instituiçao da barraca
        if (!v.getCurso().equalsIgnoreCase(this.instituicao)) {
            return false;
        }

        //Adicionar voluntário á barraca
        e.adicionarVoluntario(v);
        System.out.println("Voluntario adicionado");
        return true;
    }


    public void adicionarVendas(VendaProdutoDia v ) {
        if (v != null) {
            vendaProdutoDias.add(v);
        }
    }

    public Barraca(String instituicao, List<Voluntario> voluntarios, List<StockProdutoDia> stockProdutoDias, List<VendaProdutoDia> vendaProdutoDias, List<Escala> arrEscala){
        this.instituicao=instituicao;
        this.voluntarios=new ArrayList<>();
        this.stockProdutoDias = new ArrayList<>();
        this.vendaProdutoDias= new ArrayList<>();
        this.arrEscala= new ArrayList<>();
    }

    public String getInstituicao() {
        return instituicao;
    }

    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public List<StockProdutoDia> getStocks() {
        return stockProdutoDias;
    }

    public List<VendaProdutoDia> getVendaProdutoDias() {
        return vendaProdutoDias;
    }

    public List<Escala> getArrEscala(int dia) {
        return arrEscala;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setVoluntarios(List<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public void setStocks(List<StockProdutoDia> stockProdutoDias) {
        this.stockProdutoDias = stockProdutoDias;
    }

    public void setVendaProdutoDias(List<VendaProdutoDia> vendaProdutoDias) {
        this.vendaProdutoDias = vendaProdutoDias;
    }

    public void setArrEscala(List<Escala> arrEscala) {
        this.arrEscala = arrEscala;
    }

    @Override
    public String toString() {
        return "Barraca:" +instituicao+ ", Voluntarios" +voluntarios;

    }
    public Classificacao calcularStocksFinaisDiariosBarracas(List<StockProdutoDia> stockProdutoDias, int quantidadevendida, int quantidadetotal) {
        int stockfinal = quantidadetotal - quantidadevendida;
        if (stockfinal > 100) {
            return StockProdutoDia.Classificacao.Bronze;
        }
        if (stockfinal >= 50 && stockfinal <= 100) {
            return StockProdutoDia.Classificacao.Prata;
        } else {
            return StockProdutoDia.Classificacao.Ouro;
        }
    }

    public VendaProdutoDia.Classificacao calcularVendasVoluntarios(List<VendaProdutoDia> vendaProdutoDias, double rendimento) {
        if(rendimento<500){
            return VendaProdutoDia.Classificacao.Bronze;
        }
        if(rendimento>=500 && rendimento<=100){
            return VendaProdutoDia.Classificacao.Prata;
        }
        else {
            return VendaProdutoDia.Classificacao.Ouro;
        }
    }

}
