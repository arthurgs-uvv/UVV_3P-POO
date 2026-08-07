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
    
    double getSaldo(){
        return saldo;
    }
    
    void setAgencia(int agencia){
        this.agencia = agencia;
    }
    
    int getAgencia(){
        return agencia;
    }
    
    void setNumero(int numero){
        this.numero = numero;
    }
    
    int getNumero(){
        return numero;
    }
    
    void creditar(double valor){
        saldo += valor;
    }
    
    boolean debitar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        } else{
            System.out.println("Error! Saldo insuficiente.");
            return false;
        }
    }
    
    void transferir(Conta conta,  double valor){
        if(debitar(valor)){
            conta.creditar(valor);
        } else{
            System.out.println("Transferência Negada!");
        }
    }
    
    void printarDados(String conta){
        System.out.println("Usuario " + conta);
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: R$" + getSaldo() + '\n');
    }
}
