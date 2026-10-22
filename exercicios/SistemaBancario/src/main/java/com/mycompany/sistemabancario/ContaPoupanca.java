/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author alunolab11
 */
public class ContaPoupanca extends Conta {

    private double taxaRendimento; // ex: 0.5 para 0,5% ao mês

    public ContaPoupanca(int numero, String titular,
                         double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    // SEM validação — permite débito em conta poupança além do saldo
    @Override
    public void debitar(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Débito de R$ " + valor
            + " realizado. Saldo: R$ " + getSaldo());
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$ " + rendimento
            + " aplicado. Saldo: R$ " + getSaldo());
    }

    public double getTaxaRendimento() { return taxaRendimento; }

    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Conta Poupança"
            + " | Taxa de rendimento: " + taxaRendimento + "% ao mês");
    }
}
