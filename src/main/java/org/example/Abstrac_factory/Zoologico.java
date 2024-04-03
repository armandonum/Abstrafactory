package org.example.Abstrac_factory;

import java.util.ArrayList;
import java.util.List;

// Clase para el zoológico
class Zoologico {
    private String nombre;
    private List<Jaula> listaJaulas;
    private String direccion;
    private String telefono;

    // Constructor
    public Zoologico(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.listaJaulas = new ArrayList<>();
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Método para añadir una jaula al zoológico
    public void añadirJaula(Jaula jaula) {
        listaJaulas.add(jaula);
    }

    // Método para mostrar el zoológico
    public void mostrarZoologico() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Jaulas:");
        for (Jaula jaula : listaJaulas) {
            System.out.println(jaula);
        }
    }
}
