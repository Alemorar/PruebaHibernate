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
public class GestorString {
    
    private String cadena;

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    public int longitudCadena(){
        int longitud = cadena.length();
        return longitud;
    }
    
    public void compararCadena(String otraCadena){
//        if (cadena == otraCadena){
        if (cadena.equals(otraCadena)){//es para comparar objetos
            System.out.println("Son iguales las cadenas");    
        }else{
            System.out.println("Son diferentes las cadenas");
        }
    }
    
    
}
