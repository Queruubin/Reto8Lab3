package com.reto8.Reto8;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto8Application {

	public static void main(String[] args) {
        // 1. Crear animales
        Mamifero leon = new Mamifero("Simba", 5, "Rugido", "Carnívoro", "Carne roja", 190.0, 1.2, "Sabana");
        Ave tucan = new Ave("Zazú", 2, "Canto", "Frugívoro", "Frutas tropicales", 0.5, 0.3, "Selva");

        // 2. Agregar atributos dinámicos (SOLID: Open/Closed)
        leon.agregarAtributoExtra("Color de melena", "Dorado oscuro");
        leon.agregarAtributoExtra("Origen", "África Subsahariana");

        // 3. Crear cuidador e interactuar
        Cuidador juan = new Cuidador("Juan", 30, "Grandes Felinos");
        juan.asignarAnimal(leon);
        juan.alimentar(leon);

        // 4. Crear visitante e interactuar
        Visitante ana = new Visitante("Ana", 25);
        ana.registrarFavorito(leon);
        ana.subirFotografia(tucan);
        ana.darPropina(juan, 20.0);

        // 5. Mostrar atributo dinámico
        System.out.println("El origen de " + leon.getNombre() + " es: " + leon.getAtributoExtra("Origen"));
    }

}
