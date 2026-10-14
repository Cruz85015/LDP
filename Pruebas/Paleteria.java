package Pruebas;
public class Paleteria{
    public static void main(String[] args) {
        
        int venta, venta_1, venta_2, fresa_1, fresa_2, limon_1, limon_2, coco_1,coco_2, costofinal, costo_1, costo_2;
        final int coco = 18 ;
        final int fresa = 15;
        final int limon = 12;
            costo_1 =0;
            costo_2 = 0;
        venta_1 = Integer.parseInt(IO.readln("Cuantas paletas vendiste el 1er dia? "));
        fresa_1 = Integer.parseInt(IO.readln("Cuantas fueron de fresa? "));
        limon_1 = Integer.parseInt(IO.readln("Cuantas fueron de limon? "));
        coco_1 = Integer.parseInt(IO.readln("Cuantas fueron de coco? "));

        venta_2 = Integer.parseInt(IO.readln("Cuantas paletas vendiste el 2do dia? "));
        fresa_2 = Integer.parseInt(IO.readln("Cuantas fueron de fresa? "));
        limon_2 = Integer.parseInt(IO.readln("Cuantas fueron de limon? "));
        coco_2  = Integer.parseInt(IO.readln("Cuantas fueron de coco? "));
        
        venta = venta_1 + venta_2 ;
        for(int i=0; i < fresa_1; i++){
            costo_1 = costo_1;
            costo_1=  fresa + costo_1;
        }
        for(int i=0; i < limon_1; i++){
            costo_1 = costo_1;
            costo_1=  limon + costo_1;
        }
        for(int i=0; i < coco_1; i++){
            costo_1 = costo_1;
            costo_1=  coco_1 + costo_1;
        }
        System.out.println("La ganancia del primer dia es: " + costo_1);

        for(int i=0; i < fresa_2; i++){
            costo_2 = costo_2;
            costo_2=  fresa + costo_2;
        }
        for(int i=0; i < coco_2; i++){
            costo_2 = costo_2;
            costo_2=  costo_2 + costo_2;
        }
        for(int i=0; i < limon_2; i++){
            costo_2 = costo_2;
            costo_2=  limon_2 + costo_2;
        }
        System.out.println("La ganancia del 2do dia es: " + costo_2);
        costofinal = costo_1 + costo_2 ; 
        System.out.println("Se vendieron en total : " + venta+  " Paletas");
        System.out.println("La ganancia total es de: " + costofinal);
       }
}