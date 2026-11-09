package Act_Clase_3er_parcial;

public class venta_vivero {
    public static void main(String[] args) {
        
        
        String  []Productos ={"Cactus", "Suculenta", "Marcela", "Tierra", "Fertilizante"};
        String [] Dias_semana = {"Lunes", "Martes", "Miercoles", "Miercoles", "Jueves", "Viernes","Sabado"};
        double [] Costos ={45.5,35.5,60,80,95};
        double [][] Ventas = new double[7][5];
        double [][] Monto_venta = new double [7][5];
        System.out.println("Ingrese la cantidad de productos por dia");

        for(int i =0;i< Ventas.length; i++){
            for (int j = 0; j< Ventas[i].length; j++){
                Ventas[i][j] = Double.parseDouble(IO.readln("ventas del dia "+ Dias_semana[i]  + " del producto: " +Productos[j]+"\n:"));
            }
        };
        for(int i = 0; i < Monto_venta.length; i++){
            for (int j =0; j< Monto_venta[i].length; j++){
                Monto_venta [i][j] = Ventas[i][j] + Costos[j] ;
            }
        };
        
        double totalGeneral = 0;

        for (int i = 0; i < Dias_semana.length; i++) {
            System.out.println("\n- Día: " + Dias_semana[i] + " -");
            double totalDia = 0;

            for (int j = 0; j < Productos.length; j++) {
                System.out.printf("  * %s -> Cantidad: %.0f | Monto: $%.2f%n", 
                                  Productos[j], Ventas[i][j], Monto_venta[i][j]);
                totalDia += Monto_venta[i][j];
            }
            System.out.printf(">>> Total generado el %s: $%.2f%n", Dias_semana[i], totalDia);
            totalGeneral += totalDia;
        }
        System.out.printf(" INGRESOS TOTALES DE LA SEMANA: $%.2f%n", totalGeneral);
        
    }
}
