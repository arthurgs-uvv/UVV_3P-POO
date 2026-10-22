/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {

        ContaCorrente  cc = new ContaCorrente(1001,  "Ana Lima",    1000.0, 500.0);
        ContaPoupanca  cp = new ContaPoupanca(2001,  "Bruno Costa",  800.0, 0.5);

        // operação 1: débito maior que saldo + limite
        cc.debitar(2000.0);

        // operação 2: débito maior que saldo na poupança
        cp.debitar(1500.0);

        // operação 3: crédito com valor negativo
        cc.creditar(-300.0);

        // operação 4: rendimento sobre saldo negativo
        cp.aplicarRendimento();

        System.out.println(cc);
        System.out.println(cp);
    }
}
