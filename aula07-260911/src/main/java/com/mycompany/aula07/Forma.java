/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07;

/**
 *
 * @author alunolab11
 */
public abstract class Forma {
    public abstract double calcularArea();
    
    public void printArea(){
        System.out.println(calcularArea());
    }
}
