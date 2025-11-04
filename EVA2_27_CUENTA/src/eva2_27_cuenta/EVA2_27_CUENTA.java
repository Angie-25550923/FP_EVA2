/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        double saldo;
        saldo = 1000000; //saldo inicial

        while (saldo > 0) {
            System.out.println("Saldo actual: $" + saldo);
            System.out.print("¿Cuánto desea retirar?: ");
            double retiro = captu.nextDouble();

            saldo = saldo - retiro; // resta lo retirado

            if (saldo == 0) {
                System.out.println("Su cuenta se ha agotado. Saldo: $0");
                break; //detener si ya no hay dinero
            }
        }
    }
}
            

  


    
    

