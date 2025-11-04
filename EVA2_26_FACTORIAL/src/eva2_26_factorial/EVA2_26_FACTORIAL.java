/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int m;
        m = captu.nextInt();
        int factorial;
        factorial = 1; // aqui se guardará el resultado

        // ciclo for para multiplicar desde 1 hasta m
        for (int i = 1; i <= m; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + m + " es: " + factorial);
    }

}
    

