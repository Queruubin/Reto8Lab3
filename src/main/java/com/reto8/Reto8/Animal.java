package com.reto8.Reto8;

import java.util.*;

public abstract class Animal {
    private String nombre;
    private int edad;
    private String sonidoCaracteristico;
    private String dieta;
    private String alimentoPreferido;
    private double peso;
    private double altura;
    private String estadoSalud; // sano, enfermo, cuarentena
    private String habitat;
    
    // Atributos dinámicos (Principio Open/Closed)
    private Map<String, Object> atributosExtra = new HashMap<>();

    public Animal(String nombre, int edad, String sonido, String dieta, String alimento, double peso, double altura, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.sonidoCaracteristico = sonido;
        this.dieta = dieta;
        this.alimentoPreferido = alimento;
        this.peso = peso;
        this.altura = altura;
        this.estadoSalud = "sano"; // Estado inicial por defecto
        this.habitat = habitat;
    }

    // Método abstracto para polimorfismo
    public abstract void emitirSonido();

    // Gestión de atributos dinámicos
    public void agregarAtributoExtra(String clave, Object valor) {
        this.atributosExtra.put(clave, valor);
    }

    public Object getAtributoExtra(String clave) {
        return this.atributosExtra.getOrDefault(clave, "No registrado");
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getAlimentoPreferido() { return alimentoPreferido; }
    public String getHabitat() { return habitat; }
    public String getEstadoSalud() { return estadoSalud; }
    public void setEstadoSalud(String estadoSalud) { this.estadoSalud = estadoSalud; }
}