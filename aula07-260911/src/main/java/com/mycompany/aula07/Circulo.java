/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 *
 * @author alunolab11
 */
public class Circulo extends Forma{
    public double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        double area = 3.14 * raio * raio;
        return area;
    }
}
