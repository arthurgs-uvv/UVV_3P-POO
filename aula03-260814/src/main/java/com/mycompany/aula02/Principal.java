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
        
        System.out.println(c2.toString());
        System.out.println(c2.toString());
        
        c1.transferir(c2, 550.00);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c2.transferir(c1, 5550.0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c2.transferir(c1, 100);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
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