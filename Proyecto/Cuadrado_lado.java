package Proyecto;

public class Cuadrado_lado {
    public static void main(String[] args) {

        int cancel;
        System.out.println("A seleccionado el calculo de su terreno por medio de una evaluacion en forma de cuadrado mediante un lado");


        do{
            double lado = Double.parseDouble(IO.readln("Ingrese el tamaño de su lado en metros: "));
            double costom2 = Double.parseDouble(IO.readln("Ingrese el costo por m2 de su zona: "));

            int seleccion;
            do{
            seleccion = Integer.parseInt(IO.readln("Que desea sacar?\n1) Perimetro\n2) Area\n3)Valor Parcela \n:")) ;
             switch (seleccion) {
                case 1:
                     double peri = lado*4 ;
                    System.out.println("El perimetro de tu parcela es: %.2f%n"+ peri+"m");
                    break;
                case 2:
                     double area = lado*lado ;
                    System.out.println("El area de tu parcela es: %.2f%n"+ area+"m2");
                    break;
                case 3 :
                    System.out.printf("El valor de su parcela es de: $%.2f%n",(costom2*(lado*lado)));
                break;
                default:
                    System.out.println("La opcion no existe");
                    break;
             }
             cancel = Integer.parseInt(IO.readln("Que desea hacer?\n1) Volver a operar\n"
                +"2) Volver a colocar datos \n:"));
            } while (cancel ==1);
        } while (cancel ==2 );
    }
}
