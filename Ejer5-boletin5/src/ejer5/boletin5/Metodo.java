
package ejer5.boletin5;

public class Metodo {
    
    public Metodo(){
        
    }
    
    public void numMayor(int num1,int num2, int num3){
        if(num1> num2 && num1>num3){
         
                System.out.println("Es mayor num1 "+ num1);
                      
                       
        }else if(num2>num1 && num2>3){
            System.out.println("Es mayor num2 "+ num2);
        }else  {
            System.out.println("Es mayor num3"+ num3);
        }
        
    }
    
}
