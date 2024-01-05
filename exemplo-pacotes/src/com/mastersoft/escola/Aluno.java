package com.mastersoft.escola;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String novoNome){
        nome = novoNome;
    }

    public String getNome(){
        return nome;
    }


    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public int getIdade(){
        return idade;
    }

}
