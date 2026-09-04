/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.produtos;

/**
 *
 * @author alunolab11
 */
public class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida(int quantidadeEstoque, int codigo, String nome, double valor) {
        super(codigo, nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void darEntrada(int quantidade){
        if(quantidade > 0){
            quantidadeEstoque += quantidade;
        }else{
            System.out.println("VALOR INVALIDO");
        }
    }
    
    public void darBaixa(int quantidade){
        if(quantidade > 0){
            if(quantidade <= quantidadeEstoque){
                quantidadeEstoque -= quantidade;
            }else{
                System.out.println("Quantidade superior ao do estoque\nQuantidade atual do estoque: " + getQuantidadeEstoque());
            }     
        }else{
            System.out.println("VALOR INVALIDO");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Bebida{" + super.toString() + "quantidadeEstoque=" + quantidadeEstoque + '}';
    }
    
    
}
