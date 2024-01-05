package com.mastersoft.escola;

public class Escola {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("João");
        aluno.setIdade(17);

        System.out.println("Nome: "+ aluno.getNome() + " Idade: " + aluno.getIdade());
    }
    
}
