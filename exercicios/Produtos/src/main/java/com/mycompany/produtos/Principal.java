/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produtos;

import java.util.Arrays;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {
        Bebida b1 = new Bebida(10, 2020, "Guarana", 10.0);
        Pizza p1 = new Pizza("Grande", 35, 
                Arrays.asList("Milho", "Pimentao", "Presunto", "Queijo", "Tomate", "Cebola", "Azeitona")
                , 2021, "Portuguesa", 99.90);
        
        System.out.println(b1.toString());
        System.out.println(p1.toString());
    }
}
