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
        System.out.println("Hello World!");
    }
    
    public static void miConversor(){
        
        //Creando el menu principal del conversor
        String moneda = (JOptionPane.showInputDialog(null, "Selecciona el conversor que necesitas", "Mi Conversor",
 JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Moneda", "Temperatura"}, "Moneda")).toString(); 
        
    }
}
