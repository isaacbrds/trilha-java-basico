package com.sistema.banco.implementacao;

public class Poupanca extends Conta {
    public void rendimento(){
        this.saldo *= 1.0005;
    }

    @Override
    public void informarExtrato() {
        System.out.println("============= EXTRATO DE POUPANÇA ===========");
        System.out.println("AG: "+super.agencia);
        System.out.println("CONTA: "+super.numero);
        System.out.println("SALDO: "+super.saldo);
    }    
}
