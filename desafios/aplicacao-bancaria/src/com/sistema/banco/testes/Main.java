package com.sistema.banco.testes;
import com.sistema.banco.implementacao.ContaCorrente;
import com.sistema.banco.implementacao.Poupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente();
        Poupanca poupanca = new Poupanca();

        cc.depositar(1000);
        cc.informarExtrato();
        cc.sacar(20);
        cc.informarExtrato();
        cc.transferir(500, poupanca);
        cc.informarExtrato();
        poupanca.informarExtrato();
        poupanca.rendimento();
        poupanca.informarExtrato();
        cc.informarExtrato();
    }
}
