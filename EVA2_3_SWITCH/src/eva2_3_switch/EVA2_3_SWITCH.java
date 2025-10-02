/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

/**
 *
 * @author Angie
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade = "lunes";
        switch (cade){//Dias semana, colores, no se puede usar todos los tipos de datos
            case "Lunes":
                System.out.println(1);
                break;
            case "Martes":
                System.out.println(2);
                break;
            default:
                System.out.println("Dia no existente");
              
        }
        
    }
    
}
