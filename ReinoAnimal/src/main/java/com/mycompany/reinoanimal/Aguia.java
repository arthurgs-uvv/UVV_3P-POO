/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reinoanimal;

/**
 *
 * @author alunolab11
 */
public class Aguia extends Animal implements Voar{
    private double envergadura;

    public Aguia(double envergadura, String nome, double peso, String habitat) {
        super(nome, peso, habitat);
        this.envergadura = envergadura;
    }
    
    public double getEnvergadura() {
        return envergadura;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("KREEE KREEE");
    }
    
    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("A ave desce e captura o peixe num voo rasante.");
    }
    
    @Override
    public void decolar(){
        System.out.println("A ave abre as asas e decola das rochas.");
    }
    
    @Override
    public void voar(String destino){
        System.out.println("A ave planeja voar até " + destino);
    }
    
    @Override
    public void pousar(){
        System.out.println("A ave fecha as asas e pousa no topo da montanha.");
    }
}
