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
    int agencia, numero;
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
        this.saldo += valor;
    }
    
    void debitar(double valor){
        this.saldo -= valor;
    }
    
    void transferir(Conta conta,  double valor){
        debitar(valor);
        conta.creditar(valor);
    }
}
