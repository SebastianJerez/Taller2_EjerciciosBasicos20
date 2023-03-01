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
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 2 cifras");
        String num = entrada.next();
        
        System.out.println("el numero invertido es ");
        for(int i=num.length();i>0;i--){
            System.out.print(num.charAt(i-1));
        }
        System.out.println(" ");
    }
    
}
