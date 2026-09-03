/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author alunolab11
 * UML DO EXERCICIO DO PORTAL
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super(agencia, numero, saldo);
        this.limite = limite;
        creditar(limite);
    }    
        
    public void atualizarLimite(double limite){
        if(limite >= 0){    
            double diferenca = limite - this.limite;
            
            if(diferenca > 0){
                creditar(diferenca);
            }else if(diferenca < 0){
                debitar(diferenca*-1);
            }
            this.limite = limite;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "Limite: " + limite + "\n"; 
    }
}
