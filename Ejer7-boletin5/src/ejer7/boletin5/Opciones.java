
package ejer7.boletin5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opciones {
    
    public Opciones(){
        
    }
    
    public void metodoOpcion(int num){
        Scanner entrada= new Scanner (System.in);
        DecimalFormat formato = new DecimalFormat("#####.0##"); // Clase para formatear lo valores decimales que debe
        //mostrar.
        switch(num){
            case 1:
                System.out.println("Calculo area do Cadrado");
                System.out.println("Introduzca valor de lado");                
                System.out.println("Area del cuadrado " + (Math.pow(entrada.nextFloat(),2)));
                break;
            case 2: 
                System.out.println("Calculo area do Triangulo");
                System.out.println("Introduzca valor de base");
                float base = entrada.nextFloat();
                System.out.println("Introduzca valor de la altura");
                float altura = entrada.nextFloat();
                System.out.println("Area del triangulo " + ((base*altura)/2));
                break;
            case 3:
                System.out.println("Calculo area do Circulo");
                System.out.println("Introduzca valor del radio");
                System.out.println("Area del circulo " + formato.format((Math.PI*Math.pow(entrada.nextFloat(),2))));
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        
    }
    
}
