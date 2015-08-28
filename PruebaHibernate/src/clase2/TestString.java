/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author nahuel
 */
public class TestString {
    
    public static void main(String[] arg){
        
        GestorString gestorString = new GestorString();
        gestorString.setCadena("Hola mundo");
        
        System.out.println("longitud de cadena: " + gestorString.longitudCadena());
        System.out.println("Cadena tiene: " + gestorString.getCadena());
        
        gestorString.compararCadena("Hola mndo");
        
    }
}
