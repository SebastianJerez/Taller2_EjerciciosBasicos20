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
public class Ejercicio17 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora=0;
        int minutos=0;
        int segundos=0;
        
        System.out.println("Ingrese la hora en la que salio el ciclista de la ciudad A:");
        System.out.println("Hora:");
        do{
            hora = entrada.nextInt();
            if(hora<0 || hora>23){
                System.out.println("hora erronea, digite la de nuevo");
            }
        }while(hora<0 || hora>23);
        
        System.out.println("Minutos:");
        do{
            minutos = entrada.nextInt();
            if(minutos<0 || minutos>59){
                System.out.println("hora erronea, digitela de nuevo");
            }
        }while(minutos<0 || minutos>59);
        
        System.out.println("Segundos:");
        do{
            segundos = entrada.nextInt();
            if(segundos<0 || segundos>59){
                System.out.println("hora erronea, digitela de nuevo");
            }
        }while(segundos<0 || segundos>59);
        
        System.out.println("Ingrese el tiempo (en segundos) que demorara el ciclista en llegar a la ciudad B:");
        int tiempo = entrada.nextInt();
        segundos += tiempo;
        do{
            if(segundos>59){
                minutos++;
                segundos-=60;
            }
        }while(segundos>59);
        do{
            if(minutos>59){
                hora++;
                minutos-=60;
            }
        }while(minutos>59);
        if(hora>23){
            hora=0;
        }
        
        System.out.println("El ciclista llegara a la ciudad B a las "+hora+":"+minutos+":"+segundos+" horas");
        
        
    }
}
