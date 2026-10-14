package Pruebas.personal;

import java.util.ArrayList;

public class Libreria {
    public static void main(String[] args) {
        int id;
        String titulo, autor;
        boolean disponible;

        ArrayList <String> Libro = new ArrayList<>();
        Libro.add("El color del trigo");
        Libro.add("Las Batallas en el Desierto");

        for(int i = 0 ; i< Libro.size(); ++i){
        System.out.println("estos son los libros disponibles: ");
        System.out.println(Libro.get(i));
         }
    }
}
