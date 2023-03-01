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
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        double far = entrada.nextDouble();
        
        double cel = (far -32)/1.8;
        
        System.out.println("La temperatura en Celcius es: "+cel);
    }
    
}
