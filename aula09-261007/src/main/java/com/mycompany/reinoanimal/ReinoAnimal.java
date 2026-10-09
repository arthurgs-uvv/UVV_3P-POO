/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reinoanimal;

/**
 *
 * @author alunolab11
 */

import java.util.ArrayList;
import java.util.List;

public class ReinoAnimal {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new Aguia(15, "AGUIA", 15.0, "Selva"));
        animais.add(new Golfinho("Branco", "GOLFINHO", 15.0, "Selva"));
        animais.add(new Leao("Rei da Selva", "LEAO", 15.0, "Selva"));
        animais.add(new Pato("PATO", 15.0, "Selva"));
        animais.add(new Sapo("Ascabam", "SAPO", 15.0, "Selva"));
        
        for (Animal animal : animais){
            animal.exibirFicha();
            animal.emitirSom();
            animal.alimentar();
            System.out.println("\n");
        }
        
        List<Voar> voadores = new ArrayList<>();
        voadores.add(new Aguia(15, "AGUIA", 15.0, "Selva"));
        voadores.add(new Pato("PATO", 15.0, "Selva"));
        
        for (Voar voam : voadores){
            voam.decolar();
            voam.voar("Sul");
            System.out.println("\n");
        }
        
        List<Nadar> nadadores = new ArrayList<>();
        nadadores.add(new Golfinho("Branco", "GOLFINHO", 15.0, "Selva"));
        nadadores.add(new Pato("PATO", 15.0, "Selva"));
        nadadores.add(new Sapo("Ascabam", "SAPO", 15.0, "Selva"));
        
        for(Nadar nadam : nadadores){
            nadam.nadar("Atlântico Sul");
            nadam.mergulhar(30);
            nadam.emergir();
            System.out.println("\n");
        }
        
        List<Andar> andadores = new ArrayList<>();
        andadores.add(new Leao("Rei da Selva", "LEAO", 15.0, "Selva"));
        andadores.add(new Pato("PATO", 15.0, "Selva"));
        andadores.add(new Sapo("Ascabam", "SAPO", 15.0, "Selva"));
        
        for(Andar andam : andadores){
            andam.andar(100);
            andam.correr(150);
            andam.parar();
            System.out.println("\n");
        }
        
        for (Animal animal : animais){
            String voar = "nao", nadar = "nao", andar = "nao";
            if(animal instanceof Voar) voar = "sim";
            if(animal instanceof Nadar) nadar = "sim";
            if(animal instanceof Andar) andar = "sim";
        
            System.out.println(animal.getNome() + " voa: " + voar + "| nada: " + nadar + "| anda: " + andar);
            System.out.println("\n");
        }
    }
}
