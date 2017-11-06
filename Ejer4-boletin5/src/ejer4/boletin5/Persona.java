
package ejer4.boletin5;

public class Persona {
    String nome;
    float peso;
       
    public Persona(String nom,float pes){
        nome=nom;
        peso=pes;
    }
    
    public void setNome(String nom){
        nome=nom;
    }
    public String getNome(){
        return nome;
    }
    
    public void setPeso(float pes){
        peso=pes;
    }
    public float getPeso(){
        return peso;
    }
    
    public static void quienesmasPesado(Persona p1, Persona p2){
           
      if(p1.getPeso()>p2.getPeso()){
          System.out.println(p1.getNome() + " es más pesado que " + p2.getNome() + " con una diferencia de " + (p1.getPeso()-p2.getPeso()) + " Kg");
      }else{
          System.out.println(p2.getNome() + " es más pesado que " + p1.getNome() + " con una diferencia de " + (Math.abs(p1.getPeso()-p2.getPeso())) + " Kg");
      } // función Math.abs() pasa un número negativo a positivo
        
        
    }
    
}
