package com.sistema.banco.implementacao;
public interface IConta{
    public void depositar(double valor);
    public void sacar(double valor);
    public void transferir(double valor, IConta contaDestino);
    public void informarExtrato();
}