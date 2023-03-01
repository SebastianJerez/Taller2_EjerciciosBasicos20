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
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de preguntas del parcial:");
        int numPreguntas = entrada.nextInt();
        
        int nota=0;
        for(int i=0;i<numPreguntas;i++){
            System.out.println("\nPregunta "+(i+1)+": La respuesta fue correcta, erronea o no contesto?");
            System.out.println("Escriba 'a' para Correcto. 'b' para Erroneo. 'c' para No Contesto");
            String opcion;
            do{
                opcion = entrada.next();
                if(!opcion.equals("a")&&!opcion.equals("b")&&!opcion.equals("c")){
                    System.out.println("Respuesta no valida. Intente de nuevo");
                }
            }while(!opcion.equals("a")&&!opcion.equals("b")&&!opcion.equals("c"));
            
            switch(opcion){
                case "a":
                    nota+=5;
                    break;
                case "b":
                    nota--;
                    break;
                case "c":
                    break;
            }
        }
        System.out.println("El total de puntos fueron: "+nota+" puntos");
    }
}
