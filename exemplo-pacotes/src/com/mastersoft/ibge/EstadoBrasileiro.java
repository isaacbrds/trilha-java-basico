package com.mastersoft.ibge;

public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo"),
    MARANHAO("MA", "Maranhão"),
    PIAUI("PI", "Piauí"),
    CEARA("CE", "Ceará");

    private String  sigla, nome;
    
    
    private EstadoBrasileiro(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
