/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 *
 * @author alunolab11
 */
public class Quadrado extends Forma{
    public double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        double area = lado * lado;
        return area;
    }
}
