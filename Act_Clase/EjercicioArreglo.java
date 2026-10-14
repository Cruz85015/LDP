package Act_Clase;

import java.util.ArrayList;

public class EjercicioArreglo {
    public static void main(String[] args) {

        ArrayList <Integer> num_lista = new ArrayList <>();
        
        IO.println("escribe los 10 numeros: ");
        for(int i = 0;i < 10; i++){
            IO.print("numero " +(i + 1) + ": " );
        int num = Integer.parseInt(IO.readln());
            num_lista.add(num);
    }

    int mayor = num_lista.get(0);
    int nomayor = 0 ;
    int menor = num_lista.get(0);
    int nomenor = 0;

    for(int i = 0; i< num_lista.size() ; i++){
        int num_actual = num_lista.get(i);

        if (num_actual > mayor ){
            mayor = num_actual;
            nomayor = i ;
        }
        if (num_actual < menor){
            menor = num_actual;
            nomenor = i ;
        }
    }
    IO.println("Esta es tu lista de numeros: " +num_lista );
    IO.println("El numero mayor es: " + mayor);
    IO.println("su posicion es: " + nomayor );
    IO.println("El numero menor es: " + menor );
    IO.println("su posicion es: " + nomenor );


}
}
