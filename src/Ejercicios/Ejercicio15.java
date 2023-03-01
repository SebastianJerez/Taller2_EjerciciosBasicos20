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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese un valor A:");
        int A = entrada.nextInt();
        System.out.println("Ingrese un valor B:");
        int B = entrada.nextInt();
        
        int C = A;
        A = B;
        B = C;
        
        System.out.println("Los valores se han invertido, el valor A es "+A+" y el valor B es "+B);
    }
    
}
