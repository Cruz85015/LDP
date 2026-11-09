package Proyecto;

public class Cuadrado_cordenadas {
    public static void main(String[] args) {
        int cancel;

        System.out.println("Has seleccionado el cuadrado por coordenadas para evaluar el costo de su terreno/parcela");

        do {
            System.out.println("Ingrese las siguientes coordenadas:");
            double x1 = Double.parseDouble(IO.readln("Ingrese x1: "));
            double y1 = Double.parseDouble(IO.readln("Ingrese y1: "));
            double x2 = Double.parseDouble(IO.readln("Ingrese x2: "));
            double y2 = Double.parseDouble(IO.readln("Ingrese y2: "));
            double costom2 = Double.parseDouble(IO.readln("Ingrese el costo por m2: "));
            double diagonalCuadrada = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
            double lado = Math.sqrt(diagonalCuadrada / 2);
            double perimetro;
            double area;

            int seleccion;
            do {
                seleccion = Integer.parseInt(IO.readln("Que desea sacar?\n1) Perimetro\n2) Area\n3)Valor Parcela \n:"));
                switch (seleccion) {
                    case 1:
                        perimetro = 4*lado;
                        System.out.printf("El perimetro es: %.2f m \n",perimetro);
                        break;
                    case 2:
                        area = lado * lado;
                        System.out.printf("El area es: %.2f m \n",area);
                        break;
                    case 3 :
                        System.out.printf("El costo de tu terreno/parcela es: $ %.2f%n", (costom2*(lado*lado)));
                        break;
                    default:
                        System.out.println("La opcion no existe");
                        break;
                }
                
                cancel = Integer.parseInt(IO.readln("Que desea hacer?\n1) Volver a operar\n"
                +"2) Volver a colocar datos \n:"));
            } while (cancel == 1);


        } while (cancel == 2);
    }
}
