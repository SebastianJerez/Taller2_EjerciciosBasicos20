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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el cateto opuesto:");
        double co = entrada.nextDouble();
        System.out.println("Ingrese el cateto adyacente:");
        double ca = entrada.nextDouble();
        
        double res = Math.sqrt(Math.pow(ca,2)+Math.pow(co,2));
        
        System.out.println("La hipotenusa es "+res);
    }
    
}
