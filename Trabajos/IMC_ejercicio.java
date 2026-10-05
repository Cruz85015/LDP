
package Trabajos;

public class IMC_ejercicio{

    public static void main(String[] args) {

        float IMC, peso, estatura;
        int i;
        int opcion;

        i = Integer.parseInt(
                IO.readln("Cuantas personas desea consultar su IMC: ")
        );

        while (i > 0) {

            IO.println("Vamos con la persona numero: " + i);
            peso = Float.parseFloat(
                    IO.readln("Dime tu peso: \n")
            );
            estatura = Float.parseFloat(
                    IO.readln("Dime tu estatura: \n")
            );
            IMC = peso / (estatura * estatura);
            IO.println("Tu indice de masa corporal es: " + IMC);


            if (IMC < 18.5) {
                opcion = 1;
            } else if (IMC >= 18.5 && IMC <= 24.5) {
                opcion = 2;
            } else if (IMC >= 25 && IMC <= 29.9) {
                opcion = 3;
            } else if (IMC >= 30 && IMC <= 34.9) {
                opcion = 4;
            } else if (IMC >= 35 && IMC < 39.9) {
                opcion = 5;
            } else if (IMC >= 40) {
                opcion = 6;
            } else {
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    IO.println(
                  "Estas bajo de peso\n"
                  + "Recomendaciones:\n"
                  + "- Aumentar la ingesta diaria de forma saludable\n"
                  + "- Hacer ejercicio para aumentar la masa muscular\n"
                  + "- Consulte un medico"
                    );
                    break;

                case 2:
                    IO.println(
                    "Estas en un peso normal\n"
                    + "Recomendaciones:\n"
                    + "- Tener una alimentacion sana\n"
                    + "- Hacer ejercicio recurrente al menos 30 minutos"
                    );
                    break;

                case 3:
                    IO.println(
                    "Tienes sobrepeso\n"
                    + "Recomendaciones:\n"
                    + "- Modificar habitos alimenticios\n"
                    + "- Iniciar con activacion fisica y control medico sugerido"
                    );
                    break;

                case 4:
                    IO.println(
                    "Tienes Obesidad grado 1\n"
                    + "Recomendaciones:\n"
                    + "- Intervencion terapeutica\n"
                    + "- Iniciar con activacion fisica y ejercicio\n"
                    + "- Terapia conductual\n"
                    + "- Reducir ingesta calorica de entre 1000 a 1500 kcal al dia"
                    );
                    break;

                case 5:
                    IO.println(
                    "Tienes Obesidad grado 2\n"
                    + "Recomendaciones:\n"
                    + "- Intervencion terapeutica\n"
                    + "- Iniciar con activacion fisica y ejercicio\n"
                    + "- Terapia conductual\n"
                    + "- Reducir ingesta calorica de entre 1000 a 1500 kcal al dia\n"
                    + "- Iniciar con metas en 6 meses\n"
                    + "- En caso de no llegar, evaluar cirugia"
                    );
                    break;

                case 6:
                    IO.println(
                    "Tienes Obesidad grado 2\n"
                    + "Recomendaciones:\n"
                    + "- Intervencion terapeutica\n"
                     + "- Iniciar con activacion fisica y ejercicio\n"
                    + "- Terapia conductual\n"
                    + "- Reducir ingesta calorica de entre 1000 a 1500 kcal al dia\n"
                     + "- Iniciar con metas en 6 meses\n"
                    + "- En caso de no llegar, evaluar cirugia bariatrica"
                    );
                    break;

                default:
                    IO.println("El IMC no entra en un rango valido.");
                    break;
            }

            i--;
        }
        IO.println("Ya no hay usuarios a los cuales consultar su IMC");
    }
}

