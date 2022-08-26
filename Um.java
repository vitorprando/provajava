/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanylucasli.provajava;
import java.util.Scanner;

/**
 *
 * @author labinfo
 */
public class Um {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        Scanner sc = new Scanner (System.in);
        int i = 0, maior = 0, menor;
        
        for (i = 0; i<5; i++) {
            System.out.println("Forneça o número " + (i+1));
            numeros[i] = sc.nextInt();
        }
        
        menor = numeros[0];
        
        for (i = 0; i<5; i++) {
            System.out.println(numeros[i]);
        }
        
        for (i = 0; i<5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
