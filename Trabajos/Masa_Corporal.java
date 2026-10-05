package Trabajos;

public class Masa_Corporal {
    public static void main(String[] args) {
        float IMC, peso, estatura;



        int i ;

 i= Integer.parseInt(IO.readln("Cuantas personas desea consultar su IMC: "));

        while (i > 0) {
            
            IO.println("Vamos con la persona numero: " + i);
        peso = Float.parseFloat(IO.readln("Dime tu peso: \n"));
        estatura = Float.parseFloat(IO.readln("Dime tu estatura:  \n"));

        IMC = (peso/(estatura*estatura));
        IO.println("tu indice de masa muscular es: " + IMC);

        if (IMC<18.5) {
            IO.println("Estas bajo de peso\n"
            +"Recomendaciones:\n-Aumentar la ingesta diaria de forma saludable\n"
            +"-Hacer ejercicio para aumentar la masa muscular\n"
            +"-Consulte un medico"
             );
        } else if (IMC>=18.5 && IMC <= 24.5) {
            IO.println("Estas en un peso normal\n"
            +"Recomendaciones:\n"+
            "-Tener una alimentacion sana\n"+
            "-Hacer ejercicio recurrente al menos 30 minutos"
             );
            
        } else if ( IMC>=25 && IMC<=29.9 ){
             IO.println("Tienes sobrepeso\n"
            +"Recomendaciones:\n"+
            "-Modificar habitos alimenticios\n"+
            "-Iniciar con activacion fisica y control medico sugerido"
             );
        } else if (IMC>= 30 && IMC<=34.9) {
            IO.println("Tienes Obesidad grado 1\n"
            +"Recomendaciones:\n"+
            "-Interbencion terapeutica\n"+
            "-Iniciar con activacion fisica y ejercicio\n"+
            "-Terapia conductual\n"+
            "-Reducir ingesta calorica de entre 1000 a 1500 kcal al dia"
             );
        } else if (IMC>=35 && IMC<39.9) {
              IO.println("Tienes Obesidad grado 2\n"
            +"Recomendaciones:\n"+
            "-Interbencion terapeutica\n"+
            "-Iniciar con activacion fisica y ejercicio\n"+
            "-Terapia conductual\n"+
            "-Reducir ingesta calorica de entre 1000 a 1500 kcal al dia\n"+
            "-Iniciar con metas en 6 meses\n"+
            "-En caso de no llegar, evaluar cirujia"
             );
        } else if (IMC>=40) {
             IO.println("Tienes Obesidad grado 2\n"
            +"Recomendaciones:\n"+
            "-Interbencion terapeutica\n"+
            "-Iniciar con activacion fisica y ejercicio\n"+
            "-Terapia conductual\n"+
            "-Reducir ingesta calorica de entre 1000 a 1500 kcal al dia\n"+
            "-Iniciar con metas en 6 meses\n"+
            "-En caso de no llegar, evaluar cirujia biriatica"
             );
        } 
           i --;}
    }
    
}
