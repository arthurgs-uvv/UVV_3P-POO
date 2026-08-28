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
   
        ContaCorrente c1 = new ContaCorrente(222, 333, 1000.00, 200);
        
        /*
        System.out.println(c1.toString());
        c1.creditar(200);
        System.out.println(c1.toString());
        c1.setLimite(800.00);
        System.out.println(c1.toString());
        c1.debitar(1300);
        System.out.println(c1.toString());
        */
        
        System.out.println(c1.getSaldoReal());
    }
}

/*

- Utilizar 'this.' apenas quando um parâmetro do método (variavel local)
    tiver o mesmo nome da variavel global da Classe;
- 'SOUT' -> System out abreviado;
- Utilizar sempre a variavel local no teste do if;
- Alt + insert -> Atalho para criar get e set;
- Dontpad -> Compartilhar codigos
- 
*/