package com.reto8.Reto8;

import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private String nombre;
    private int edad;
    private String especialidad;
    private List<Animal> animalesAsignados;

    public Cuidador(String nombre, int edad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.animalesAsignados = new ArrayList<>();
    }

    public void asignarAnimal(Animal animal) {
        this.animalesAsignados.add(animal);
    }

    public void alimentar(Animal a) {
        System.out.println("Cuidador " + nombre + " está alimentando a " + a.getNombre() + 
                           " con " + a.getAlimentoPreferido());
    }

    public void bañar(Animal a) {
        System.out.println("Bañando a " + a.getNombre() + " en su hábitat: " + a.getHabitat());
    }

    public void limpiarHabitat(Animal a) {
        System.out.println("Limpiando el hábitat de tipo: " + a.getHabitat());
    }

    public String getNombre() { return nombre; }
}