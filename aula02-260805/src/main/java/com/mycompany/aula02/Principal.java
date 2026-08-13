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
        
        c1.printarDados("c1");
        
        /*
        System.out.println("Usuario 1");
        System.out.println("Agencia: " + c1.getAgencia());
        System.out.println("Numero: " + c1.getNumero());
        System.out.println("Saldo: R$" + c1.getSaldo() + '\n');
        */
        
        c2.printarDados("c2");

        /*
        System.out.println("Usuario 2");
        System.out.println("Agencia: " + c2.getAgencia());
        System.out.println("Numero: " + c2.getNumero());
        System.out.println("Saldo: R$" + c2.getSaldo() + '\n');
        */
        
        c1.transferir(c2, 550.00);
        
        System.out.println("Usuario 1");
        System.out.println("Agencia: " + c1.getAgencia());
        System.out.println("Numero: " + c1.getNumero());
        System.out.println("Saldo: R$" + c1.getSaldo() + '\n');
        
        System.out.println("Usuario 2");
        System.out.println("Agencia: " + c2.getAgencia());
        System.out.println("Numero: " + c2.getNumero());
        System.out.println("Saldo: R$" + c2.getSaldo());
    }
}

/*

- Utilizar 'this.' apenas quando um parâmetro do método (variavel local)
    tiver o mesmo nome da variavel global da Classe;
- 'SOUT' -> System out abreviado;
- Utilizar sempre a variavel local no teste do if;
- Alt + insert -> Atalho para criar get e set;
- Dontpad -> Compartilhar codigos
*/