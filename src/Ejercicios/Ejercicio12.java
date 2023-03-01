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
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese dos puntos en el plano");
        System.out.println("x1:");
        int x1=entrada.nextInt();
        System.out.println("y1:");
        int y1=entrada.nextInt();
        System.out.println("x2:");
        int x2=entrada.nextInt();
        System.out.println("y2:");
        int y2=entrada.nextInt();
        
        float distancia = (float) (Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        
        System.out.println("La distancia entre los 2 puntos es de "+Math.sqrt(distancia)+" unidades");
        
    }
    
}
