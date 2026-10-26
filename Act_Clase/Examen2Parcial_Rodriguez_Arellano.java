package Act_Clase;

import java.util.ArrayList;

public class Examen2Parcial_Rodriguez_Arellano {
    public static void main(String[] args) {
        //Caso de tienda
        //Hacer lista con los productos y sus precios

        String[] productos = new String[5];

        productos[1] = "Chocolate";
        productos[2] = "Paleta";
        productos[3] = "Gomitas";
        productos[4] = "Galletas";

        int[] precio = new int[5];
        precio[1] = 18;
        precio[2] = 12;
        precio[3] = 25;
        precio[4] = 15;

        //arreglo para los clientes
        ArrayList<String> clientes = new ArrayList<>();
        String respuesta_c;
        int clientes_totales = 0;

        do {
            clientes.add(IO.readln("Escribe el nombre del cliente: "));
            respuesta_c = IO.readln("Hay otro cliente? \n 1)si \n 2)no \n : ");
            clientes_totales++;
        } while (respuesta_c.equalsIgnoreCase("si"));

        // Catalogo de productos
        System.out.println("Estos son los productos que manejamos");
        for (int i = 1; i < productos.length; i++) {
            System.out.println(i + ": " + productos[i] + " $" + precio[i]);
        }

        // solicitar que codigo de producto quiere
        ArrayList<Integer> producto_compra = new ArrayList<>();
        ArrayList<Integer> cantidad_producto = new ArrayList<>();
        int producto;
        int cant_producto;
        String repuesta_a;
        int costo_1= 0;
        int costo_2 =0;
        int costo_3 = 0;
        int costro_4 =0;
        int importe = 0;
        int cant_1 = 0;
        int cant_2 = 0;
                int cant_3 = 0;
                int cant_4 = 0;


        for (int i = 1; i <= clientes.size(); i++) {
            do{
                System.out.println(clientes.get(i - 1));
            producto = Integer.parseInt(IO.readln("Que producto desear agregar? "));

            switch (producto) {
                case 1:
                    cant_producto = Integer.parseInt(IO.readln("Cuantas unidades deseas comprar? "));
                    producto_compra.add(producto);
                    cantidad_producto.add(cant_producto);
                    costo_1= cant_producto * precio[1];
                    cant_1 += cant_producto;
                    break;
                case 2:
                    cant_producto = Integer.parseInt(IO.readln("Cuantas unidades deseas comprar? "));
                    producto_compra.add(producto);
                    cantidad_producto.add(cant_producto);
                    costo_2 = cant_producto * precio[2];
                    cant_2 += cant_producto;
                    break;
                case 3:
                    cant_producto = Integer.parseInt(IO.readln("Cuantas unidades deseas comprar? "));
                    producto_compra.add(producto);
                    cantidad_producto.add(cant_producto);
                    costo_3 = cant_producto * precio[3];
                    cant_3 += cant_producto;
                    break;
                case 4:
                    cant_producto = Integer.parseInt(IO.readln("Cuantas unidades deseas comprar? "));
                    producto_compra.add(producto);
                    cantidad_producto.add(cant_producto);
                    costro_4 = cant_producto * precio[4];
                    cant_4 += cant_producto;
                    break;
                default:
                    System.out.println("Producto inválido");
                    break;
            }

                repuesta_a = IO.readln("Deseas agregar otro producto? \n 1)si \n 2)no \n : ");
        }
             while (repuesta_a.equalsIgnoreCase("si"));
                
            }

            // importes y costos totales

            System.out.println( productos[1] + "$"+precio[1]+ "cantidad total que se vendio: " + cant_1 + "\n Importe total: " + costo_1);
            System.out.println( productos[2] + "$"+precio[2]+ "cantidad total que se vendio: " + cant_2 + "\n Importe total: " + costo_2 );
            System.out.println( productos[3] + "$"+precio[3]+ "cantidad total que se vendio: " + cant_3 + "\n Importe total: " + costo_3 );
            System.out.println( productos[4] + "$"+precio[4]+ "cantidad total que se vendio: " + cant_4 + "\n Importe total: " + costro_4 );

System.out.println("Clientes atendidos: " + clientes.size());
System.out.println("nombre de los clientes:");
for (int i = 0; i < clientes.size(); i++) {
    System.out.println(clientes.get(i));
}
importe = costo_1+ costo_2 + costo_3 + costro_4 ;

int total ;
total = importe / clientes.size();
System.out.println("El promedio de venta es : " + total );
        }
    }

    


