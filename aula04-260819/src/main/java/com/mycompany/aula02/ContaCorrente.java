/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(int agencia, int numero, double saldo, double limite){
        super(agencia, numero, saldo);
        this.limite = limite;
    }    
        
    void setLimite (double valor){
        limite = valor;
    }
    
    double getLimite (){
        return limite;
    }
    
    @Override
    public boolean debitar(double valor){
        double saldoLimite = super.getSaldo() + limite;
        
        if(valor > 0){    
            if (saldoLimite >= valor){
                super.debitar(valor);
                return true;
            } else{
                System.out.println("Error! Saldo insuficiente.");
                return false;
            }
        }else{
            System.out.println("Error! Valor inválido");
            return false;
        }
    }
    
    @Override
    public void transferir(Conta conta, double valor){
        if(super.debitar(valor)){
            conta.creditar(valor);
        } else{
            System.out.println("Transferência Negada!");
        }
    }
}
