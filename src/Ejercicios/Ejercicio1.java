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
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("Cual es tu nombre: ");
        String saludo = entrada.next();
        
        System.out.println("Hola " + saludo + ". Buen dia!");
    }
    
}
