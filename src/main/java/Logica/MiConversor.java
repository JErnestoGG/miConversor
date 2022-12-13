/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Logica;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class MiConversor {

    public static void main(String[] args) {
       conversor();
    }
    
    public static void conversor(){
        
        //Creando el menu principal del conversor
        String moneda = (JOptionPane.showInputDialog(null, "Selecciona el conversor que necesitas", "Mi Conversor",
 JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Moneda", "Temperatura"}, "Moneda")).toString(); 
        
         switch (moneda) {
            case "Moneda":
                Monedas cambiarMoneda=new Monedas();
                String valorTxt=(JOptionPane.showInputDialog(null, "Introduce la cantidad que deseas convertir "
                        ,"Conversor de monedas", JOptionPane.PLAIN_MESSAGE));
                double valor;

                if (valorTxt.matches("^[0-9]+([\\.,][0-9]+)?$")){
                   valor=Double.parseDouble(valorTxt);
                    
                } else {
                    JOptionPane.showConfirmDialog(null, "Valor no válido",
                            "Mi conversor", JOptionPane.CLOSED_OPTION,
                            JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
 
                
                    String cambioMoneda = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Mi conversor de Moneda",
            JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Selecciona", "Dólares a Euros", "Dólares a Libras","Dólares a Yenes","Dólares a Won Coreano",
            "Euros a Dólares", "Libras a Dólares", "Yenes a Dólares", "Won Coreano a Dólares"}, "Selecciona")).toString();
       
                 switch (cambioMoneda){
                     case "Dólares a Euros" -> {        
                          JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarDolarPorMonedas(valor, "euros") + " Euros",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);    
                }                
                     case "Dólares a Libras" -> {
                       JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarDolarPorMonedas(valor, "libras") + " Libras",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                  case "Dólares a Yenes" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarDolarPorMonedas(valor, "yenes") + " Yenes",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                  case "Dólares a Won Coreano" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarDolarPorMonedas(valor, "won") + " Wones Surcoreanos",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                  case "Euros a Dólares" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarMonedasPorDolar(valor, "euros") + " Dólares",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                    case "Libras a Dólares" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarMonedasPorDolar(valor, "libras") + " Dólares",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                        case "Yenes a Dólares" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarMonedasPorDolar(valor, "yenes") + " Dólares",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                         case "Won Coreano a Dólares" -> {
                         JOptionPane.showMessageDialog(null, "Tienes " + cambiarMoneda.cambiarMonedasPorDolar(valor, "won")+ " Dólares",
                "Mi conversor de moneda", JOptionPane.INFORMATION_MESSAGE);
                }
                 
                    
                      default -> throw new AssertionError();
            }
                break;

                
                
                
            case "Temperatura":
                Temperatura conversionTemperatura=new Temperatura();
                
                String valorTemperatura=(JOptionPane.showInputDialog(null, "Introduce el valor que deseas convertir "
                        ,"Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
                 double valor2;

                if (valorTemperatura.matches("^-?[0-9]+([\\.,][0-9]+)?$")){
                   valor2=Double.parseDouble(valorTemperatura);
                    
                } else {
                    JOptionPane.showConfirmDialog(null, "Valor no válido",
                            "Mi conversor", JOptionPane.CLOSED_OPTION,
                            JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
                
                String cambioTemperatura = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Mi conversor de Moneda",
            JOptionPane.PLAIN_MESSAGE,null, new Object [] { "Celsius a Fahrenheit", "Celsius a Kelvin","Fahrenheit a Celsius","Fahrenheit a Kelvin",
            "Kelvin a Celsius", "Kelvin a Fahrenheit"}, "Celsius a Fahrenheit")).toString();
       
             switch (cambioTemperatura){
                     case "Celsius a Fahrenheit" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "celsiusPorF") + " grados Fahrenheit",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                }
                     case "Celsius a Kelvin" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "celsiusPorK") + " grados Kelvin",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                } 
                     case "Fahrenheit a Celsius" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "fahrenheitPorC") + " grados Celsius",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                } 
                    case "Fahrenheit a Kelvin" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "fahrenheitPorK") + " grados Kelvin",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                }
                    case "Kelvin a Celsius" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "kelvinPorC") + " grados Celsius",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                }
                    case "Kelvin a Fahrenheit" -> {        
                          JOptionPane.showMessageDialog(null, "El resultado es: " + conversionTemperatura.convertirTemperatura(valor2, "kelvinPorF") + " grados Fahrenheit",
                "Mi conversor de temperatura", JOptionPane.INFORMATION_MESSAGE);    
                }
                     
                      default -> throw new AssertionError();
            }
                break;

               
            default:
                throw new AssertionError();
        }
        
        finalizar();

    }
    
       public static void finalizar(){
                int resp =JOptionPane.showConfirmDialog(null, "¿Deseas continuar?",
                "Mi Conversor", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE); 
        
        if (resp==0){
          conversor();
        }else{
            
        JOptionPane.showConfirmDialog(null, "Programa Finalizado",
                "Mi conversor", JOptionPane.CLOSED_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
   
}
