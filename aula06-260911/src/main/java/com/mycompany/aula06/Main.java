/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula06;

/**
 *
 * @author alunolab11
 */
public class Main {

    public static void main(String[] args) {
        PagamentoPix Pix = new PagamentoPix(10);
        Checkout check = new Checkout();
        
        check.finalizarCompra(Pix);
    }
}
