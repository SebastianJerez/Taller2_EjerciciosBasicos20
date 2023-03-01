/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sebas
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        long datos = entrada.nextLong();
        
        long horas=TimeUnit.MINUTES.toHours(datos);
        long minutos = TimeUnit.MINUTES.toMinutes(datos) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(datos));
        
        System.out.println(horas+":"+minutos);
    }
}
