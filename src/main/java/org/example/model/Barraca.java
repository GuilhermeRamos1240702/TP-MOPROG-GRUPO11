package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Barraca extends Federacao {

    private String instituicao;
    private List<Voluntario> voluntarios;
    private List<StockProdutoDia> stockProdutoDias;
    private List<VendaProdutoDia> vendaProdutoDias;
    private List<Escala> arrEscala;



    public Barraca() {
    }

    public void adicionarStocks(StockProdutoDia s){
        if (s != null) {
            stockProdutoDias.add(s);
        }
    }


    public boolean adicionarVoluntarioBarraca(Voluntario a, List<Barraca> todasBarracas) {

        // Verifica se o voluntário já está escalado em outra barraca no mesmo dia




        //Verificar se o funcionário pertence á mesma instituiçao da barraca
        if (!a.getCurso().equalsIgnoreCase(this.instituicao)) {
            return false;
            System.out.println("O volubntário nao pode ser incluido nesta barraca pois pertence a uma instituicao diferente");
        }
    }

    public void adicionarVendas(VendaProdutoDia v ) {
        if (v != null) {
            vendaProdutoDias.add(v);
        }
    }

    public Barraca(String instituicao, List<Voluntario> voluntarios, List<StockProdutoDia> stockProdutoDias, List<VendaProdutoDia> vendaProdutoDias){
        this.instituicao=instituicao;
        this.voluntarios=new ArrayList<>();
        this.stockProdutoDias = new ArrayList<>();
        this.vendaProdutoDias= new ArrayList<>();
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

    @Override
    public String toString() {
        return "Barraca:" +instituicao+ ", Voluntarios" +voluntarios;

    }

}
