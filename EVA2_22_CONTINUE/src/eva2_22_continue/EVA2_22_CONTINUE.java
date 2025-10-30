/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author Angie
 */
public class EVA2_22_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Imprimir números pares.
        int i = 0;
        while(i<100){
            int resi = i% 2;
            if(resi != 0){//No es divisible entre 2
                i++;
                continue;//Interrumpe la repetición actual
            }
            System.out.print(i + " - ");
            i++;
            
        }
        
        
    }
    
}
