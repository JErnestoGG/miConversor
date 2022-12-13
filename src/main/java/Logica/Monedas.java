

package Logica;

/**
 *
 * @author LENOVO
 */
public class Monedas {
 
    public double cambiarDolarPorMonedas(double valor, String id){
        double tasaCambio=0;
        
       
        switch (id) {
            case "euros" -> tasaCambio=0.9481;
            case "libras" -> tasaCambio=0.8158;
            case "yenes" -> tasaCambio=136.58;
            case "won" -> tasaCambio=1304.2700;
        }
        
        return Math.round((valor*tasaCambio)*100)/100.0;
    }
    
     public double cambiarMonedasPorDolar(double valor, String id){
        double tasaCambio=0;
        
        switch (id) {
            case "euros" -> tasaCambio=0.9481;
              case "libras" -> tasaCambio=0.8158;
             case "yenes" -> tasaCambio=136.58;
             case "won" -> tasaCambio=1304.2700;
        }
        
        return Math.round((valor/tasaCambio)*100)/100.0;
    }
    
     
}
