
package ejer2.boletin5;

public class Metodo {
    
        public Metodo(){
        
    }
    
    public  void numPositivo(short num1, short num2){
             if(num1>=num2){
                 
            System.out.println("Resta " + (num1-num2));
            System.out.println("Suma " + (num1+num2));
        }else{
            System.out.println("Suma " + (num1+num2));
        }
    }
}
