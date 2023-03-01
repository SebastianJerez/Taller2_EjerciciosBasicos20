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
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num1 = entrada.nextInt();
        System.out.println("ingrese otro numero: ");
        int num2 = entrada.nextInt();
        
        int distancia = num1 - num2;
        
        System.out.println("la distancia de un numero al otro es de "+Math.abs(distancia)+" numeros");
    }
    
}
