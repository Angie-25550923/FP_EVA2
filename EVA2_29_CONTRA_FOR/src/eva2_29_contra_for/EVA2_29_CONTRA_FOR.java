/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA2_29_CONTRA_FOR {

    final static String USUARIO = "admin";
    final static String PWD = "admin";
    
    public static void main(String[] args) {
        //1.PEDIMOS DATOS DE ACCESO
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        
        System.out.println("Usuario");
        usu = captu.nextLine();
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Contraseña: ");
            contra = captu.nextLine();
            if (contra.equals(PWD)) {
            System.out.println("ACCESO CONCEDIDO");
            break;
        
        } else {
            System.out.println("Contraseña incorrecta. Intentos restantes: " + (4 - i));
                }
            }
        }
    }

        
    
    

