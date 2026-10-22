/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author alunolab11
 */
public class ContaCorrente extends Conta {

    private double limite; // limite do cheque especial

    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    // SEM validação do limite, permite saldo negativo além do limite
    @Override
    public void debitar(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Débito de R$ " + valor
            + " realizado. Saldo: R$ " + getSaldo());
    }

    public double getLimite() { return limite; }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Conta Corrente"
            + " | Limite cheque especial: R$ " + limite);
    }
}
