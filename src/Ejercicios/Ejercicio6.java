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
public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] numeros = new double [3];
        double media=0;
        
        System.out.println("Ingrese 3 numeros para calcular la media: ");
        
        for(int i=0;i<3;i++){
            numeros[i] = entrada.nextDouble();
            media+=numeros[i];
        }
        media=media/3;
        System.out.println("La media es "+media);
    }
    
}
