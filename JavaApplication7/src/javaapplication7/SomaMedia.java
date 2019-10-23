/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author viana
 */
public class SomaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int soma = 1;
        //int number = 0;
        int lowerbound = 1;
        int upperbound = 100;
        
        for (int number = lowerbound; lowerbound >= upperbound; ++number){
            soma += number;
            double average = number+number/soma;
        System.out.println("A média é: " + average);
        }
        System.out.println("A soma de 0 até 100 é: " + soma);*/
        
        int number;
        int soma = 0;
        
        for (number = 1; number <= 100; number++){
            soma = soma+number;
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + soma/number);
    }
}
