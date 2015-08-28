/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nahuel
 */
public class TestDate {
    
    public static void main(String[] arg){
        
        GestorDate gestorDate = new GestorDate();
        gestorDate.setFechaActual(new Date());
        
        //retorna fecha sin formato
        System.out.println("Fecha del gestor es: " + gestorDate.getFechaActual());
        
        //retorna fecha con formato
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String cadenafechaGestor = sdf.format(gestorDate.getFechaActual());
        System.out.println("Fecha del gestor con formato: " + cadenafechaGestor);
        
        //estableciendo fecha en formato elegido por el usuario
        Date fechaNacimiento = new Date();//hasta ahi tengo la fecha actual
        
        try {
            fechaNacimiento = sdf.parse("22-11-1999");
            System.out.println("La fecha de nacimiento es: " + sdf.format(fechaNacimiento));
            
            //int resultado = 59/0;
            
        }catch (ParseException pe){
            System.out.println("La fecha ingresada tiene un formato inválido");
        }catch (Exception e){
            System.out.println("Ocurrio un error desconocido");
            e.printStackTrace();
        }
        
        //uso de calendar
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaNacimiento);
        //agrego 45 dias a 
        calendario.add(Calendar.DAY_OF_MONTH,45);
        System.out.println("Fecha del Calendario: " + calendario.getTime());
        
    }
}
