package Proyecto;

public class Cuadrado {
    public static void main(String[] args) {
        System.out.println("A seleccionado el cuadrado");
        System.out.println("Que desea sacar:");
        System.out.println("1) Area \n 2) Perimetro");
        

        float Permietro, Area, A_P, Calculo ;
        final int Pmo = 2;
        final int Are = 1;
        float Lado ;

         A_P = Float.parseFloat(IO.readln("Dime que opcion quieres: \n"));
         Lado = Float.parseFloat(IO.readln("Dame el Lado de tu cuadrato: \n"));


        if (A_P == Are) {
            Area = Lado* Lado;
            IO.println("El area de tu cuadrado es: " + Area);
        } else  {
            Permietro = Lado*4;
            IO.print("El perimetro de tu cuadrado es: " + Permietro);
        }
    }
}
