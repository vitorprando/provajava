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
public class Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float massaI, massaF;
        int horas = 0, minutos = 0, segundos = 0, segundosTotais = 0;
        
        System.out.println("Massa inicial em gramas: ");
        massaI = sc.nextFloat();
        massaF = massaI;
        
        while (massaF >= 0.5) {
            segundos += 50;
            segundosTotais += 50;
            
            if (segundos > 60) {
                minutos++;
                segundos -= 60;
            }
            if (minutos > 60) {
                horas++;
                minutos -= 60;
            }
            
            massaF = massaF/2;
        }
        
        System.out.println("Massa inicial: " + massaI + " | Massa final: " + massaF);
        System.out.println("Horas, minutos e segundos: " + horas + ":" + minutos + ":" + segundos);
        System.out.println("Segundos totais: " + segundosTotais);
    }
}
