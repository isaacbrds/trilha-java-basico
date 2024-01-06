package com.mastersoft.ibge;

public class SistemaIbge {
    public static void main(String[] args) {
        
        for(EstadoBrasileiro estado:  EstadoBrasileiro.values()){
            System.out.println(estado.getNome() + "-" + estado.getSigla());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;

        System.out.println(eb.getNome() + "-" + eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
