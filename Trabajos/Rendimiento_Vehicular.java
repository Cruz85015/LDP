package Trabajos;
public class Rendimiento_Vehicular {
    //Declaracion de variables y constantes
    void main (){
        // Definir y declarar variables y constantes con su tipo de dato
            
        String Num_Serie;
       float Km_recorrido, Lts_usados, Costo_lts, R_esperado, R_real, Porcentaje, Total_R;
       float Porc1, Porc2, Costo_total;
       double Margen_1 ;

       final double Margen = 0.1 ;

       //Entrada de datos
     Num_Serie = IO.readln("Dame tu Matricula");
     Km_recorrido = Float.parseFloat(IO.readln("Kilometros recorridos: "));
     Lts_usados =  Float.parseFloat(IO.readln("Litros usados: "));
     Costo_lts = Float.parseFloat(IO.readln("Ingrese el costo por litro: "));
     R_esperado = Float.parseFloat(IO.readln("Escribe el rendimiento esperado"));

     // Calcular todos los datos necesarios
     R_real = (Km_recorrido/R_esperado);
     Total_R = (R_esperado + R_real);
     Porc1 = ((R_esperado*100)/Total_R);
     Porc2 = ((R_real*100)/Total_R);

     Costo_total = (Costo_lts*Lts_usados);

     Porcentaje = (Porc1 - Porc2);
     Margen_1 = (Porc1 * Margen);

     //Hacer la seleccion de rendimiento
     if (Porc2 > Porc1) {
        System.out.println(
            "Tu rendimiento es eficiente"
        ); }
        else if (Porcentaje <= Margen_1) {
            System.out.println(
                "Tu rendimiento es aceptable"
            );
        } else {System.out.println(
            "Tu rendimiento es pesimo"
        );
            
        }

        System.out.println(
            " Tu matricula es: " + Num_Serie);
            System.out.println(
                "Tu rendimiento esperado era: \n"+ R_esperado
            );
        System.out.println(
            "Tu rendimiento real es: \n" + R_real
        );
        System.out.println(
            "La diferencia en rendimineto es: \n" + Porcentaje
        );
        System.out.println(
            "El costo total de compbustible es: \n" + Costo_total
        );


    }
}

