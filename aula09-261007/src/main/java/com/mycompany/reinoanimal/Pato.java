package com.mycompany.reinoanimal;

public class Pato extends Animal implements Voar, Nadar, Andar{
    
    public Pato(String nome, double peso, String habitat){
        super(nome, peso, habitat);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("QUACK QUACK QUACK");
    }

    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("O Pato está filtando água com o bico.");
    }

    @Override
    public void decolar(){
        System.out.println("O pato bate as asas e decola da água.");
    }

    @Override
    public void voar(String destino){
        System.out.println("O pato voa em formação migratória rumo ao "+ destino);
    }

    @Override
    public void pousar(){
        System.out.println("O pato desce e desliza sobre o lago.");
    }

    @Override
    public void nadar(String local){
        System.out.println("O pato nada tranquilamente no " + local);
    }

    @Override
    public void mergulhar(int profundidade){
        System.out.println("O pato mergulha até " + profundidade + "metros");
    }

    @Override
    public void emergir(){
        System.out.println("O pato emerge sacudindo as penas");
    }

    @Override
    public void andar(int velocidade){
        System.out.println("O pato caminha bambolejando pela margem a "+ velocidade + "km/h");
    }

    @Override
    public void correr(int velocidade){
        System.out.println("O pato corre batendo as asas a " + velocidade + "km/h");
    }

    @Override
    public void parar(){
        System.out.println("O pato para na beira do lago e sacode as penas");
    }
}