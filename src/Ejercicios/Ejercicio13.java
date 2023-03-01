/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        float num = entrada.nextFloat();
        
        System.out.println("La raiz cuadrada de ese numero es "+ Math.sqrt(num));
        System.out.println("La raiz cubica de ese numero es "+ Math.cbrt(num));
        
    }
    
}
