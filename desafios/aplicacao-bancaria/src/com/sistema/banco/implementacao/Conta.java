package com.sistema.banco.implementacao;

public class Conta implements IConta{
    
    private static int SEQUENCIA = 1;
    private static String AGENCIA_PADRAO = "0001";

    protected String agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIA++;
        saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void informarExtrato() {
        
    }

    @Override
    public void sacar(double valor) {

        if(saldo > valor)
            this.saldo -= valor;
        else
            System.out.println("Você não pode realizar essa ação");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
