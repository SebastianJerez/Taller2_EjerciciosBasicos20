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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int [] parciales = new int [3];
        int examFinal, trabajoFinal, suma=0;
        
        for(int i=0;i<3;i++){
            System.out.println("Ingrese la nota del parcial "+(i+1));
            parciales[i] = entrada.nextInt();
            suma += parciales[i];
        }
        suma = suma/3;
        
        System.out.println("Ingrese el valor de su examen final ");
        examFinal = entrada.nextInt();
        System.out.println("ingrese el valor de su trabajo final ");
        trabajoFinal = entrada.nextInt();
        
        float total = (float) ((suma*0.55)+(examFinal*0.30)+(trabajoFinal*0.15));
        
        System.out.println("Su nota final es "+total);
    }
    
}
