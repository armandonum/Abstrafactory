package org.example.Abstrac_factory;

// Clase para las jaulas
class Jaula {
    private Animal animal;
    private int alto;
    private int ancho;
    private int largo;

    // Constructor
    public Jaula(Animal animal, int alto, int ancho, int largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Animal: " + animal + ", Alto: " + alto + ", Ancho: " + ancho + ", Largo: " + largo;
    }
}
