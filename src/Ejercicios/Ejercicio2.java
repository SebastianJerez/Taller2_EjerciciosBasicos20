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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("perimetro y area de un rectangulo");
        System.out.println("ingrese la longitud del rectangulo (parte mas larga)");
        double l = entrada.nextDouble();
        System.out.println("ingrese el ancho del rectangulo (parte mas corta)");
        double w = entrada.nextDouble();
        
        double p = (2*l)+(2*w);
        double a = l*w;
        
        System.out.println("El perimetro del rectangulo es "+p+" y su area es "+a);
        
    }
    
}
