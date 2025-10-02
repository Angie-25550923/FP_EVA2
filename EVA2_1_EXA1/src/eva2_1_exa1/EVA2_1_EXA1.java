/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int pin, opc, monto;
        int saldo = 5000;
        int calculo;
        System.out.println("Introduce el PIN");
        pin = captu.nextInt();
        if(pin == 1234){//primera parte resuelta
            System.out.println("1.consultar saldo");
            System.out.println("2.retirar saldo");
            System.out.println("1.depositar saldo");
            System.out.println("selecciona la operación");
            opc = captu.nextInt();
            if(opc == 1){
                System.out.println(" Tu saldo es" + saldo);
                
            }else if(opc == 2){
                System.out.println("cuanto vas a retirar");
                monto = captu.nextInt();
                if (monto <= saldo){
                    calculo = saldo - monto;
                    System.out.println(" Tu saldo es + calculo");
                }else{
                    System.out.println("Monto mayor al saldo!!");
              
                }
            }else if (opc == 3){
                System.out.println("cuanto vas a depositar?");
                monto = captu.nextInt();
                if (monto >= 0){
                    calculo = saldo + monto;
                    System.out.println("Tu saldo es + calculo");
                }else{
                    System.out.println("Monto negativo!!");
                }
              
 
                
                
                
            }
            
        }
        
    }
    
}
