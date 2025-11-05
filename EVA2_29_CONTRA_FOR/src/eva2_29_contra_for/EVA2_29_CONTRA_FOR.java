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
        // TODO code application logic here
        //1.PEDIMOS DATOS DE ACCESO
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //2.VALIDAMOS
        //INCORRECTO -----> VOLVER A PREGUNTAR
        //CORRECTO ---> ACCESO AL SISTEMAS
        do{
        System.out.println("Usuario");
        usu = captu.nextLine();
        System.out.println("Contraseña");
        contra = captu.nextLine();
        }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
        System.out.println("ACCESO CONCEDIDO. BIENVENIDO AL SISTEMA!");
        
    
      }
        
    }

        
    
    

