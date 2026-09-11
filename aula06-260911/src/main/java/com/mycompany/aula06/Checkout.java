/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

/**
 *
 * @author alunolab11
 */
public class Checkout {
    public void finalizarCompra(FormaPagamento pagamento){
        System.out.println("- Finalizando compra -\nMetodo " + pagamento + " escolhido");
        pagamento.processarPagamento();
        System.out.println("PAGAMENTO EFETUADO.");
    }
}
