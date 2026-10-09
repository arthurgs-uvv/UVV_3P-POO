/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reinoanimal;

/**
 *
 * @author alunolab11
 */
public class Leao extends Animal implements Andar{
    private String alcunha; //Título do animal (Rei da Savana)
    
    public Leao(String alcunha, String nome, double peso, String habitat){
        super(nome, peso, habitat)
        this.alcunha = alcunha;
    }

    @Override
    public void emitirSom(){
        System.out.println("ROAARRR");
    }
    
    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("Os leões começam a caçar e comer a presa capturada.");
    }
    
    @Override
    public void andar(int velocidade){
        System.out.println("O Leão caminha na selva a " + velocidade + "km/h");
    }

    @Override
    public void correr(int velocidade){
        System.out.println("O Leão dispara em perseguição na velocidade máxima: " + velocidade + "km/h");
    }
    
    @Override
    public void parar(){
        System.out.println("O Leão para, espreita e observa a presa ao longe.");
    }
}