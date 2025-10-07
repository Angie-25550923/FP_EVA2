/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NÚMEROS DEL 1 -20:
        // 1 - 2 - 3 - 4 - 5 - 6 ..... 20
        for (int i = 1; i <= 20; i++){
            System.out.print(i + " - ");                    
        }
        System.out.println();
         //IMPRIMIR LOS NÚMEROS PARES DE 0 A 100
            // 0 - 2 - 4 - 6.... 100
            //+= suma, -=resta, *=multilplica
        for (int i = 0; i <= 100; i+=2){
            System.out.print(i + " - ");
        }
        System.out.println();
        for (int i = 100; i >= 0; i-=2){
            System.out.print(i + " - ");
        }
        System.out.println();
        for (int i = -20; i <= -5; i ++){
            System.out.print(i + " - ");
        }
        System.out.println();
        for (int i = -5; i <= -20; i--){
            System.out.print(i + " - ");
        }//Imprimir alguna tabla de multiplicar que el usuario quiera
        System.out.println();

        Scanner captu = new Scanner(System.in);
        int tabla;
        //AQUI EL USUARIO ELIGE LA TABLA: 1 - 2 - 3 - 4- 5....10
        System.out.print("Elige una tabla de multiplicar: ");
        tabla = captu.nextInt();//GUARDA EL NUMERO ELEGIDO
        //IMPRIMIR TABLA ELEGIDA
        System.out.println("Tabla del " + tabla);
        for(int i = 1; i<= 10; i++ ){// Se le doice que solo se pueden las tablas de 1-10 
            //SE HACE LA OPERACIÓN: 3X1= 3, 3X2= 6 Y ASI SUCESIVAMENTE
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
  
        }
    }
}


