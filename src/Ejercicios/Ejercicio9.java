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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de su compra: ");
        int compra = entrada.nextInt();
        
        float total = (float) (compra - (compra*0.15));
        
        System.out.println("Su compra tiene un 15% de descuento!");
        System.out.println("El valor a pagar es de "+total+" pesos");
        
    }
    
}
