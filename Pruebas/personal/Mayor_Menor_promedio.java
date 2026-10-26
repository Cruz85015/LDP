package Pruebas.personal;

import java.util.ArrayList;

public class Mayor_Menor_promedio {
    public static void main(String[] args) {
        
        ArrayList <Integer> N_datos = new  ArrayList<>();
        String respuesta;
        do{
            N_datos.add(Integer.parseInt(IO.readln("Dame el numero: ")));
            respuesta= IO.readln("Quieres meter otro nuemro \n 1)si \n 2)no\n");
        }while(respuesta.equalsIgnoreCase("si"));
        
        

    }
}
