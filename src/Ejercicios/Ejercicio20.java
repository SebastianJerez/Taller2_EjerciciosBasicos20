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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantas monedas tenemos de 10 centimos");
        int diezCent = entrada.nextInt();
        System.out.println("Cuantas monedas tenemos de 20 centimos");
        int veinteCent = entrada.nextInt();
        System.out.println("Cuantas monedas tenemos de 50 centimos");
        int cincuentaCent = entrada.nextInt();
        System.out.println("Cuantas monedas tenemos de 1 euro");
        int euro = entrada.nextInt();
        System.out.println("Cuantas monedas tenemos de 2 euros");
        int dosEuros = entrada.nextInt();
        
        int totalEuros=0;
        int totalCent=0;
        
        totalCent= (diezCent*10)+(veinteCent*20)+(cincuentaCent*50);
        totalEuros= euro+(dosEuros*2);
        do{
            if(totalCent>99){
                totalEuros++;
                totalCent-=100;
            }
            System.out.println("hola");
        }while(totalCent>99);
        
        System.out.println("Usted tiene un total de "+totalEuros+" euros con "+totalCent+" centimos");
    }
}
