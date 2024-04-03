package org.example.Abstrac_factory;

class AveFactory implements AnimalFactory {
    public Animal crearAnimal() {
        return new Ave();
    }
}
