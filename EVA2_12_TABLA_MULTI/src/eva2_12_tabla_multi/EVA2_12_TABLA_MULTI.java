/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_12_TABLA_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
