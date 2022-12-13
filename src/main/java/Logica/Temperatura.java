

package Logica;

/**
 *
 * @author LENOVO
 */
public class Temperatura {
 public  double convertirTemperatura(double valor, String id){
        double resultado;
        switch (id) {
            case "celsiusPorF" -> resultado=(valor*1.8)+32;
            case "celsiusPorK" -> resultado=(valor+273.15);
            case "fahrenheitPorC" -> resultado=(valor-32)/1.8;
            case "fahrenheitPorK" -> resultado=(valor+459.67)/1.8;
            case "kelvinPorC" -> resultado=(valor-273.15);
            case "kelvinPorF" -> resultado=(valor*9)-459.67;
            default -> throw new AssertionError();
        }
        
        return Math.round(resultado*100)/100.0;
    }
}
