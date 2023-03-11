/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Raven
 */
public class Dia2ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        sum = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + sum);
                
    }
    
}
