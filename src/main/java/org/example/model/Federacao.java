package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Federacao {
    private String nomefederacao;
    private List<Barraca> barracas;

    public void adicionarBarraca(Barraca b) {
        if (b != null) {
            barracas.add(b);
        }
    }

    public void Federacao(String nomefederacao, List<Barraca> barracas){
        this.nomefederacao=nomefederacao;
        this.barracas=new ArrayList<>();
    }

    public String getNomefederacao() {
        return nomefederacao;
    }

    public void setNomefederacao(String nomefederacao) {
        this.nomefederacao = nomefederacao;
    }

    public List<Barraca> getBarracas() {
        return barracas;
    }

    public void setBarracas(List<Barraca> barracas) {
        this.barracas = barracas;
    }
}
