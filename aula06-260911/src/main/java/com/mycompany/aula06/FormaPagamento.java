/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author alunolab11
 */
public abstract class FormaPagamento {
    public double valor;
    
    public abstract double calcularTotal();
    
    public void processarPagamento(){
        System.out.println(calcularTotal());
    }
}
