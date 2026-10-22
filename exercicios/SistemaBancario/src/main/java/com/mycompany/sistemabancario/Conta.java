/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author alunolab11
 */
public abstract class Conta {

    private int    numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero  = numero;
        this.titular = titular;
        this.saldo   = saldo;
    }

    // SEM validação, aceita qualquer valor
    public void creditar(double valor) {
        saldo += valor;
        System.out.println("Crédito de R$ " + valor
            + " realizado. Saldo: R$ " + saldo);
    }

    // SEM validação, aceita valor maior que saldo
    public void debitar(double valor) {
        saldo -= valor;
        System.out.println("Débito de R$ " + valor
            + " realizado. Saldo: R$ " + saldo);
    }

    public int    getNumero()  { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo()   { return saldo; }
    public void   setSaldo(double saldo) { this.saldo = saldo; }

    public abstract void exibirTipo();

    @Override
    public String toString() {
        return "Conta " + numero
            + " | Titular: " + titular
            + " | Saldo: R$ " + saldo;
    }
}
