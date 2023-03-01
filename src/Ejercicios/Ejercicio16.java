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
public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la velocidad a la que viaja el carro de adelante (km/h):");
        float carro1 = entrada.nextFloat();
        System.out.println("Ingrese la velocidad a la que viaja el carro de atras (km/h):");
        float carro2 = entrada.nextFloat();
        System.out.println("Ingrese la distancia que los separa (km):");
        float x = entrada.nextFloat();
        
        carro1= carro1*1000/3600;
        carro2= carro2*1000/3600;
        x = x*1000;
        
        float vel = carro2-carro1;
        float tiempo = x / vel;
        
        float min=0;
        do{
            if(tiempo/60>1){
                min++;
                tiempo-=60;
            }
        }while(tiempo/60>1);
        
        System.out.println("El carro de adelante sera alcanzado por el de atras en "+min+" minutos y "+tiempo+" segundos");
        
    }
    
}
