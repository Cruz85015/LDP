package Act_Clase ;

import java.util.Scanner;

public class Paleteria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] sabores = {"fresa", "limón", "coco"};
        double[] precios = {15.0, 12.0, 18.0};
        int dias = 2;
        
        double gananciaTotalGeneral = 0;
        int totalPaletasGeneral = 0;

        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("\n--- Registro del Día " + dia + " ---");
            int totalPaletasDia = 0;
            double dineroRecaudadoDia = 0;

            for (int i = 0; i < sabores.length; i++) {
                System.out.print("Ingrese la cantidad de paletas de " + sabores[i] + " vendidas: ");
                int cantidad = scanner.nextInt();
                totalPaletasDia += cantidad;
                dineroRecaudadoDia += cantidad * precios[i];
            }
            gananciaTotalGeneral += dineroRecaudadoDia;
            totalPaletasGeneral += totalPaletasDia;

            System.out.println("Total de paletas vendidas en el Día " + dia + ": " + totalPaletasDia);
            System.out.println("Dinero recaudado en el Día " + dia + ": $" + dineroRecaudadoDia);
        }
        System.out.println("Total de paletas vendidas en total: " + totalPaletasGeneral);
        System.out.println("Ganancia total recaudada: $" + gananciaTotalGeneral);

        scanner.close();
    }

   
