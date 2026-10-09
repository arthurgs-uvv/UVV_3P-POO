/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reinoanimal;

/**
 *
 * @author alunolab11
 */
public class Golfinho extends Animal implements Nadar{
    private String especie;

    public Golfinho(String especie, String nome, double peso, String habitat) {
        super(nome, peso, habitat);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("CLIC CLIC CLIC");
    }
    
    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("Encontrando e engolindo peixes;");
    }
    
    @Override
    public void nadar(String local){
        System.out.println("O golfinho nada velorzmente no " + local);
    }
    
    @Override
    public void mergulhar(int profundidade){
        System.out.println("O golfinho está mergulhando até os " + profundidade + "metros.");
    }
    
    @Override
    public void emergir(){
        System.out.println("O golfinho salta acima da superfície ao emergir.");
    }
}
