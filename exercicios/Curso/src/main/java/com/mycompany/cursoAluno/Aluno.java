/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cursoAluno;

/**
 *
 * @author alunolab11
 */
public class Aluno {
    private String nome;
    private int matricula;
    private Curso curso;

    public Aluno(){
        
    }
    
    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + 
                ", curso=" + curso.getNome() + '}';
    }
}
