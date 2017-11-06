
package ejer6.boletin5;

public class Consumo {
    
    public Consumo(){
        
    }
    
    public void tipoConsumo(Producto p1){
        
        if(p1.getvAnuais()>1000){
            System.out.println(p1.getNombre() + " producto de primeira necesidade");
        }else if(p1.getvAnuais()> 500 && p1.getvAnuais()<= 1000 ){
            System.out.println(p1.getNombre() + " producto de alta necesidad");
        }else if(p1.getvAnuais()>100 && p1.getvAnuais()<=500){
            System.out.println(p1.getNombre() + " producto de media necesidad");
        }else{
            System.out.println(p1.getNombre() + " producto de baixa necesidad");
        }
    }
    
}
