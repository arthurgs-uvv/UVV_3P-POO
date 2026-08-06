/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula02;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(222, 898, 1000000.00);
        Conta c2 = new Conta(111, 777, 5000.00);
        
        System.out.println("Usuario 1");
        System.out.println("Agencia: " + c1.agencia);
        System.out.println("Numero: " + c1.numero);
        System.out.println("Saldo: R$" + c1.getSaldo() + '\n');
        
        System.out.println("Usuario 2");
        System.out.println("Agencia: " + c2.agencia);
        System.out.println("Numero: " + c2.numero);
        System.out.println("Saldo: R$" + c2.getSaldo() + '\n');
        
        c1.transferir(c2, 550.00);
        
        System.out.println("Usuario 1");
        System.out.println("Agencia: " + c1.agencia);
        System.out.println("Numero: " + c1.numero);
        System.out.println("Saldo: R$" + c1.getSaldo() + '\n');
        
        System.out.println("Usuario 2");
        System.out.println("Agencia: " + c2.agencia);
        System.out.println("Numero: " + c2.numero);
        System.out.println("Saldo: R$" + c2.getSaldo());
    }
}
