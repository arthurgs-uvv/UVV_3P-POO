/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cursoAluno;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {
        Curso c1 = new Curso("CC3N", "Ciencias da Computacao");
        Aluno a1 = new Aluno("Arthur Gomes Siqueira", 2084321, c1);
        
        System.out.println(c1.toString());
        System.out.println(a1.toString());
    }
}

/*
TIPOS DE MODELAGEM

Agregação   -> Classes que não dependem de outras classes
Composição  -> Classes que dependem de outras classes
*/