package Act_Clase;

import java.util.ArrayList;

public class Carrera_Aritmetica {
    public static void main(String[] args) {
        final int d_entrada = 25;
    System.out.println("Que mes naciste? ");
    int mes_nacimiento = Integer.parseInt(IO.readln());
    int salida;
    int promedio;
    int num = 0;
    int L_promedio [] = {7, 9 , 6, 8, 10};
    System.out.println("Etapa_1 \n");
    //Etapa 1
    //hacer el promedio
    for (int i = 0; i<L_promedio.length; i++){
        num += L_promedio[i];
    }
    final int N_datos = 5 ;
    promedio = num/N_datos;
    salida = d_entrada + promedio;
    //salida 1ra etapa
System.out.println(salida + "\n");
System.out.println("Etapa 2 \n");
    //Etapa 2
    //residuo de la salida anterior
    int residuo ;
    residuo = salida%7;
    salida = salida + residuo;
    System.out.println(salida + "\n");

    System.out.println("Etapa 3 \n");
    // Etapa 3
    //porcentaje
    final double porc_1  = 0.12;
    double salida_3 = salida+(salida * porc_1);
    System.out.println(salida_3 + "\n");

    System.out.println("Etapa 4\n");
    //Etapa 4
    //suma de valores "n"
    ArrayList <Integer> cadena_n = new ArrayList<>();
    String respuesta;
    int suma_3 = 0;
    do {
        cadena_n.add(Integer.parseInt(IO.readln("Ingrese el numero= ")));
        respuesta = IO.readln("Quieres meter otro numero \n si / no = ");
    } while (respuesta.equalsIgnoreCase("si"));
    // sumar los numeros del arreglo
    for(int i = 0; i < cadena_n.size(); i++){
     suma_3 = cadena_n.get(i);
    }
    double salida_4 = salida_3 + suma_3;
    System.out.println(salida_4 + "\n");

    System.out.println("Etapa 5\n");
    //Etapa 5
    //pedir numero y dividir
    int divisor = Integer.parseInt(IO.readln("Elige el divisor de entre 1 a 9 = "));
    double salida_5 = salida_4/divisor;
    System.out.println(salida_5 + "\n");

    System.out.println("Etapa switch\n");
    //caso de swich y case
    switch (mes_nacimiento) {
        case 2,4,6,8,10,12:
            System.out.println("Numero entrero: " + (int)salida_5 );
            break;
        case 1,3,5,7,9,11:
            System.out.printf("Salida con decima3les %.4f%n", salida_5 % 1);
            break;
    }
}
}
