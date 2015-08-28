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
public class GestorEstructurasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b, resultado = 0;
        a = 18;
        b = 0;
        char operador = '/';
        
        switch (operador){
            case '+': resultado = a + b;
                break;
            case '-': resultado = a - b;
                break;
            case '/': {
                        try{
                           resultado = a / b; 
                        }
                        catch (ArithmeticException ae){
                            System.out.println("Erro al dividir por 0");
                        }
                        catch (Exception e){
//                            e.printStackTrace();
                            System.out.println("Error desconocido");
                        }
                        
                        break;
                      }
            case '*': resultado = a * b;
                break;
            default : resultado = 0;
        }
        System.out.println("El resultado de: " + operador + " es " + resultado);
            
            
                
        
//        if (operador == '+'){
//            resultado = a + b;
//            System.out.println("El resultado es: " + resultado);
//        }else if (operador == '-'){
//            resultado = a - b;
//            System.out.println("El resultado es: " + resultado);
//        }else if (operador == '*'){
//            resultado = a * b;
//            System.out.println("El resultado es: " + resultado);
//        }
//        System.out.println("fin del programa...");
    }
    
}
