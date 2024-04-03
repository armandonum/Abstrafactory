package org.example.Abstrac_factory;


public class ProgramaZoologico {
    public static void main(String[] args) {
        AnimalFactory mamiferoFactory = new MamiferoFactory();
        AnimalFactory aveFactory = new AveFactory();
        AnimalFactory pezFactory = new PezFactory();

        Animal mamifero = mamiferoFactory.crearAnimal();
        Animal ave = aveFactory.crearAnimal();
        Animal pez = pezFactory.crearAnimal();

        mamifero.crear();
        ave.crear();
        pez.crear();
    }
}

