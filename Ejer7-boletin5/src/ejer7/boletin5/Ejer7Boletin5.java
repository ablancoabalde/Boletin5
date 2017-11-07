
package ejer7.boletin5;

import java.util.Scanner;

public class Ejer7Boletin5 {

    public static void main(String[] args) {
       Opciones opcion = new Opciones();
       Scanner entrada= new Scanner(System.in);
       
        System.out.println("Seleccione una opción del 1 al 3");
        
       opcion.metodoOpcion(entrada.nextInt());
        
    }
    
}
