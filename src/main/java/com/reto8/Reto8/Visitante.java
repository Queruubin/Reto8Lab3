package com.reto8.Reto8;

import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nombre;
    private int edad;
    private List<Animal> animalesFavoritos;

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.animalesFavoritos = new ArrayList<>();
    }

    public void registrarFavorito(Animal a) {
        this.animalesFavoritos.add(a);
        System.out.println(nombre + " agregó a " + a.getNombre() + " a sus favoritos.");
    }

    public void alimentarAnimal(Animal a) {
        System.out.println(nombre + " le lanza un snack permitido a " + a.getNombre());
    }

    public void darPropina(Cuidador c, double monto) {
        System.out.println(nombre + " le dio una propina de $" + monto + " a " + c.getNombre());
    }

    public void subirFotografia(Animal a) {
        System.out.println("Foto de " + a.getNombre() + " subida a Instagram por " + nombre);
    }
}