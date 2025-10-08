/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);//tama = tamaño
        int tama;
        System.out.print("cuantas calificaciones va a captura?");
        tama = captu.nextInt();
        //creame un arreglo segun lo capturado
        int califas [] = new int[tama];
        for(int i = 0; i < califas.length; i++){
            System.out.println("calificación" + (i + 1) + ":");
            califas [1] = captu.nextInt();   
        }
        for(int i = 0; i < califas.length; i++){
            System.out.println("[" + califas[i] + "]");
        }
        
        
    }
    
}
