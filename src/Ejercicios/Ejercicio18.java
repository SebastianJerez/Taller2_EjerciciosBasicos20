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
public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de su merce:");
        String nombre = entrada.nextLine();
        
        System.out.println("ingrese su primer apellido: ");
        String apellido1 = entrada.nextLine();
        System.out.println("Ingrese su segundo apellido: ");
        String apellido2 = entrada.nextLine();
        
        System.out.println("Sus iniciales son: "+nombre.toUpperCase().charAt(0)+apellido1.toUpperCase().charAt(0)+apellido2.toUpperCase().charAt(0));
    }
}
