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
public class Dois {
    public static void main(String[] args) {
        long ano, salario = 1000;
        double aumento = 0.015;
        
        for (ano = 1996; ano < 2022; ano ++) {
            salario *= 1 + (aumento/100);
            aumento = aumento*2;
        }
        
        System.out.println("Salário final em " + ano + " com aumento percentual de " + aumento + ": " + salario);
    }
}
