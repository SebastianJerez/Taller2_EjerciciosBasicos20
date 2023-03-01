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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);           
        
        System.out.println("Ingrese un numero: ");
        double a = entrada.nextDouble();
        System.out.println("Ingrese otro numero: ");
        double b = entrada.nextDouble();
        
        double suma = a+b;
        double resta = a-b;
        double multi = a*b;
        
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multi);
        if(b==0){
            System.out.println("El segundo numero es 0 y no se puede dividir entre 0");
        }else{
            double divi = a/b;
            System.out.println("Division: "+divi);
        }
    }
    
}
