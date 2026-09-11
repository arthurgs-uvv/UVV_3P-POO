/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula07;

/**
 *
 * @author alunolab11
 */
public class Main {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(10);
        Circulo c1 = new Circulo(10);
        
        System.out.println("Valor da area do quadrado: ");
        q1.printArea();
        System.out.println("Valor da area do circulo: ");
        c1.printArea();
    }
}
