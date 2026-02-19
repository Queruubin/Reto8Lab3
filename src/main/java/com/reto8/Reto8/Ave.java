package com.reto8.Reto8;

public class Ave extends Animal {
    public Ave(String nombre, int edad, String sonido, String dieta, String alimento, double peso, double altura, String habitat) {
        super(nombre, edad, sonido, dieta, alimento, peso, altura, habitat);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " trina: " + "¡Pío pío!");
    }
}