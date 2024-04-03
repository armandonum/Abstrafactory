package org.example.Abstrac_factory;

class PezFactory implements AnimalFactory {
    public Animal crearAnimal() {
        return new Pez();
    }
}
