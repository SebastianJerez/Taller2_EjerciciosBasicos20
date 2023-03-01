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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float sueldo;
        
        System.out.println("Ingrese su sueldo: ");
        sueldo = entrada.nextFloat();
        
        int numeroComisiones;
        
        System.out.println("Ingrese la cantidad de comisiones que realizo:");
        numeroComisiones=entrada.nextInt();
        float [] comisiones = new float [numeroComisiones];
        
        float suma=0;
        for(int i=0;i<numeroComisiones;i++){
            System.out.println("Ingrese el valor de la venta "+(i+1));
            comisiones[i]=entrada.nextFloat();
            suma += comisiones[i];
        }
        System.out.println(suma);
        float total = (float) (sueldo + (suma*0.10));
        
        System.out.println("El total de su sueldo es: "+total);
        
        
    }
    
}
