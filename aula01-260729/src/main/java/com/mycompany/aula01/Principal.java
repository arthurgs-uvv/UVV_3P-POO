/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula01;

/**
 *
 * @author arthuur_uvv
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa people1 = new Pessoa("17238", "Arthur Gomes Siqueira", 21, 1.80, 87, "27995145931");       
        
        people1.CPF = "111.111.111-22";
        
        System.out.println("--- Dados do Cliente ---");
        System.out.println("CPF: " + people1.CPF);
        System.out.println("Nome: " + people1.nome);
        System.out.println("Idade: " + people1.idade + " anos");
        System.out.println("Altura: " + people1.altura + "m");
        System.out.println("Peso: " + people1.peso + "Kg");
        System.out.println("Telefone: " + people1.telefone);
        
    }
}

/*
Arquivo             -> Classe ("Entidade" em BDD)
Arquivo principal   -> Main
Funções em Objeto   -> Método

Característica de uma classe = Variável (Atributo)
Classe determina o que é comum dentro de um grupo de objetos

ALT + SHIFT + F     -> Organiza o código em tablatura
*/