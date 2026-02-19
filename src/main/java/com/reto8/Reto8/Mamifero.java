package com.reto8.Reto8;

public class Mamifero extends Animal {
    public Mamifero(String nombre, int edad, String sonido, String dieta, String alimento, double peso, double altura, String habitat) {
        super(nombre, edad, sonido, dieta, alimento, peso, altura, habitat);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite un sonido de mamífero: " + "¡Grrr!");
    }
}