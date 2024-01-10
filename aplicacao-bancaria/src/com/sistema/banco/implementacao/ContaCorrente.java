package com.sistema.banco.implementacao;
public class ContaCorrente extends Conta{
    @Override
    public void informarExtrato() {
        System.out.println("============= EXTRATO DE CONTA CORRENTE ===========");
        System.out.println("AG: "+super.agencia);
        System.out.println("CONTA: "+super.numero);
        System.out.println("SALDO: "+super.saldo);
    }
}
