/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package ejercicioaprendizaje14;

import java.util.Scanner;

public class EjercicioAprendizaje14 {
    public static void main(String[] args) {
        double euros;
        String dolares, yenes, libras;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una cantidad en euros: ");
        euros = entrada.nextDouble();
        
        System.out.println("");
        
        System.out.print("¿A qué modena desearía convertirla? (libras/dólares/yenes): ");
        String moneda = entrada.next(); // es mejor pone el next aca, el nextline no me dejaba ingresar nada
        
        while(!(moneda.equals("libras") || moneda.equals("dolares") || moneda.equals("yenes"))){
            System.out.print("Error, digito no válido, digita una moneda: ");
            moneda = entrada.next();
        }
        
        String[] vector = new String[moneda.length()];
        
        for (int i = 0; i < moneda.length(); i++) {
            vector[i] = moneda;
            System.out.println("["+vector[i]+"]");
            break;
        }      
        
        System.out.println("");
        
        conversion(euros, moneda, vector);
        System.out.println("");
    }
    
    public static void conversion(double euros, String moneda, String [] vector){
        double convertir;
        
        switch(moneda){
            case "libras":
                convertir = euros * 0.86;
                System.out.println("El valor en euros convertido a libras es de: "+convertir);
            break;
            case "dolares":
                convertir = euros * 1.28611;
                System.out.println("El valor en euros convertido a dolares es de: "+convertir);
            break;
            case "yenes":
                convertir = euros * 129.852;
                System.out.println("El valor en euros convertido a yenes es de: "+convertir);
            break;
            default:
                System.out.print("Error, digite nuevamente a la moneda que quiere convertir: "); // como tengo un while arriba este default sobra, pero si usara el default lo encierro en un while para permitirme siempre ingresar una entrada nuevamente.
               
        }        
    }
}
