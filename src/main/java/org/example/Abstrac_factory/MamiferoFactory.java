package org.example.Abstrac_factory;

// Clases concretas para las fábricas de animales
class MamiferoFactory implements AnimalFactory {
    public Animal crearAnimal() {
        return new Mamifero();
    }
}
