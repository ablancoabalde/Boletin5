
package ejer2.boletin5;

import java.util.Scanner;

public class Ejer2Boletin5 {

    public static void main(String[] args) {
       short num1,num2;
       Metodo algo = new Metodo();
       Scanner entrada = new Scanner (System.in);
       System.out.println("Introduzca num1");
       num1=entrada.nextShort();
       System.out.println("Introduzca num2");
       num2=entrada.nextShort();
       algo.numPositivo(num1, num2);
     
       
       
    }
    
}
