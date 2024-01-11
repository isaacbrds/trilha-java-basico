package com.isacosoft.implementacao;

import com.isacosoft.interfaces.IAparelhoTelefonico;
import com.isacosoft.interfaces.INavegadorInternet;
import com.isacosoft.interfaces.IRreprodutorMusica;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IRreprodutorMusica{
    private String modelo;

    public Iphone(String modelo){
        this.modelo = modelo;
    }
    
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando Música no Iphone");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando Música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Selecionando Música no Iphone");
    }

    @Override
    public void exibirPagina() {
        // TODO Auto-generated method stub
        System.out.println("Exibindo Página Web no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando Página Web no Iphone");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando Página Web no Iphone");
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Realizando Ligação pelo Iphone");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo Ligação pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando Correio de Voz do Iphone");
    }
    
    public void exibirConfiguracoes(){
        System.out.println("IPHONE " + this.modelo );
    }
}
