/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author alunolab11
 */
public class Conta {
    private int agencia, numero;
    private double saldo;
    
    Conta(){
        
    }
    
    Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
    }
    
    Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    public int getAgencia(){
        return agencia;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void creditar(double valor){
        if(valor > 0)
            saldo += valor;
        else
            System.out.println("Error! Valor inválido.");
    }
    
    public boolean debitar(double valor){
        if(valor > 0 && saldo >= valor){    
            saldo -= valor;
            return true;
        }else{
            System.out.println("Error! Valor inválido");
            return false;
        }
    }
    
    public void transferir(double valor, Conta conta){
        if(debitar(valor) && conta != null){
            conta.creditar(valor);
        } else{
            System.out.println("Transferência Negada!");
        }
    }
    
    @Override // Override serve para sobrescrever um método de java.
    public String toString(){
        return "|Conta|\nNumero da Agencia: " + getAgencia() + "\nNumero da Conta: " + 
                getNumero() + "\nSaldo: " + getSaldo() + "\n"; 
    }
}

