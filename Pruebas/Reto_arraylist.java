package Pruebas;

import java.util.ArrayList;

public class Reto_arraylist {
    public static void main(String[] args) {
        
        ArrayList <Integer> Lista_aleatoria = new ArrayList<>();

        Lista_aleatoria.add(2);
                Lista_aleatoria.add(6);
                Lista_aleatoria.add(8);
                Lista_aleatoria.add(10);
                Lista_aleatoria.add(4);

                int ayuda;
        for(int i = 0; i < Lista_aleatoria.size() -1; i++){
            for (int j =0 ; j < Lista_aleatoria.size() -1 -i ; j++){
                if (Lista_aleatoria.get(j) > Lista_aleatoria.get(j+1)){
                    ayuda = Lista_aleatoria.get(j);
                    Lista_aleatoria.set(j, Lista_aleatoria.get(j+1));
                    Lista_aleatoria.set(j + 1 , ayuda);
                }
            }
             }
            System.out.println("Numeros ordenados de menor a mayor:");

        for (int i = 0; i < Lista_aleatoria.size(); i++) {
            System.out.println(Lista_aleatoria.get(i));
        }
     }
}
