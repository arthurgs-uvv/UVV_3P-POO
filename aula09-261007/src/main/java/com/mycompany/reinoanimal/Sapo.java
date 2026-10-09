
package com.mycompany.reinoanimal;

public class Sapo extends Animal implements Nadar, Andar{
    String tipoVeneno; //Tipo de veneno produzido

    public Sapo(String tipoVeneno, String nome, double peso, String habitat){
        super(nome, peso, habitat);
        this.tipoVeneno = tipoVeneno;
    }

    @Override
    public void emitirSom(){
        System.out.println("COAX COAX COAX");
    }

    @Override
    public void alimentar(){
        emitirSom();
        System.out.println("O sapo está disparando a lingua contra insetor no ar.");
    }

    @Override
    public void nadar(String local){
        System.out.println("O sapo nada com as patas traseiras no " + local);
    }

    @Override
    public void mergulhar(int profundidade){
        System.out.println("O sapo mergulha para se esconder a " + profundidade + "metros");
    }

    @Override
    public void emergir(){
        System.out.println("O sapo emerge e salta para uma pedra próxima");
    }

    @Override
    public void andar(int velocidade){
        System.out.println("O sapo salta lentamenta pela floresta a " + velocidade + "km/h");
    }

    @Override
    public void correr(int velocidade){
        System.out.println("O sapo usa o veneno e foge saltando rapidamente a " + velocidade + "km/h");
    }

    @Override
    public void parar(){
        System.out.println("O sapo para imóvel e se camufla entre as folhas");
    }
}