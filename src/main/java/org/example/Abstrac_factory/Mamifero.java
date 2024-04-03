package org.example.Abstrac_factory;

// Clases concretas para los animales
class Mamifero implements Animal {
    public void crear() {
        System.out.println("Se ha creado un mamífero");
    }

    public void mostrar() {
        System.out.println("Este es un mamífero");
    }
}
