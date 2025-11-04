/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primos;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_28_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);//variable para leer
        int numero;//variable para asiganar el numero a revisar
        boolean primo = true;//variable que defien si el numero es primo true=es primo false=no es primo
        System.out.println("Ingrese un numero");//imprimir mensaje 
        numero = scanner.nextInt();//guardar el numero dado en la variable numero
        for (int i=2; i<numero; i++){//ciclo que asigna a i todo s los valores desde 2 hasta el numero asignado 
            if(numero%i==0){//realiza la divicion de el numero dado entre todos los numeros anteriores hasta el dos y revisa si el residuo es 0
            primo = false;//si el residuo asigna que el numero no es primo
            
            }
        }
         if (primo){//si el numero es primo aparece el mensaje 
         System.out.println(numero+" es primo");
         }
         else{//si no es primo imprime este mensaje 
         System.out.println(numero+" no es primo");
         }
        
      
    }
    
}
