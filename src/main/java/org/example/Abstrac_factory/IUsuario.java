package org.example.Abstrac_factory;
import java.util.Scanner;
public class IUsuario {
    Scanner in= new Scanner(System.in);
    public String Opciones(){
        System.out.println("Seleccione el tipo de animal que desea añadir al zoologico:");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Pez");
        System.out.println("4. Salir");

       return in.nextLine();
    }


}
