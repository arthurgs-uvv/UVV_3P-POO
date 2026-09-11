/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author alunolab11
 */
public class PagamentoBoleto extends FormaPagamento{
    public PagamentoBoleto(double valor){
        this.valor = valor;
    }
    
    @Override
    public double calcularTotal(){
        return valor + 2;
    }
}
