/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursoAluno;

/**
 *
 * @author alunolab11
 */
public class Curso {
    private String codigo, nome;
    
    public Curso(){        
    
    }
    
    public Curso(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
}
