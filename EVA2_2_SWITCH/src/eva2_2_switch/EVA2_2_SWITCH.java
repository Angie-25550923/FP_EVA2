/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opc;
        System.out.println("1.consultar saldo");
        System.out.println("2.retirar saldo");
        System.out.println("1.depositar saldo");
        System.out.println("selecciona una opción del menú");
        opc = captu.nextInt();
        switch (opc){//valor unico para usar switch
            case 1:
                System.out.println("1.Elegiste consultar saldo");
                break;//romper o detiene la instrucción
            case 2:
                System.out.println("1. Elegiste retirar saldo");
                break;// fin del swicth
            case 3:
                System.out.println("1.Elegiste depositar saldo");
                break;// fin del swicth
                
            default://opcional
                System.out.println("opción incorrecta");
        }
                
        
    
    }
    
}
