package org.example.Abstrac_factory;

abstract class AbstracFactory {
    abstract Animal crearMamifero();
    abstract Animal crearAve();
    abstract Animal crearPez();

    public static AnimalFactory getanimal(String animalType) {
        if (animalType.equalsIgnoreCase("Mamifero")) {
            return new MamiferoFactory();
        } else if (animalType.equalsIgnoreCase("Ave")) {
            return new AveFactory();
        } else if (animalType.equalsIgnoreCase("Pez")) {
            return new PezFactory();
        }
        return null;
    }
}
