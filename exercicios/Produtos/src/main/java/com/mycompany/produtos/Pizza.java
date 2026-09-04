/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtos;

import java.util.List;

/**
 *
 * @author alunolab11
 */
public class Pizza extends Produto {
    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    public Pizza() {
        super();
    }

    public Pizza(String tamanho, int diametro, List ingredientes , int codigo, String nome, double valor) {
        super(codigo, nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Produto: " + super.toString() + "Pizza{" + "tamanho=" + tamanho + ", diametro=" + diametro + ", ingredientes=" + ingredientes + '}';
    }
    
    
}
