/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula01;

/**
 *
 * @author alunodev11
 */
public class Pessoa {
    String nome, CPF, telefone;
    int idade;
    double altura, peso;
    
    Pessoa(String CPF, String nome, int idade, 
            double altura, double peso, String telefone){
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.telefone = telefone;
    }
    
}
