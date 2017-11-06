
package ejer6.boletin5;
//Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
//Vendas anuais			artigo de consumo 
//< = 100 productos				baixo
// >100 e < = 500				medio
//> 500 e < = 100 				alto
//> 1000 					primeira necesidade
//    Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é
public class Ejer6Boletin5 {

    public static void main(String[] args) {
        
        Producto pr1 = new Producto("Pasta",1500);
        Producto pr2 = new Producto("Carne",850);    
        Producto pr3 = new Producto("Camisetas",350);    
        Producto pr4 = new Producto("Anillos de oro",75);    
        Consumo obj = new Consumo();
        
        obj.tipoConsumo(pr2);
        
        
        
    }
    
}
