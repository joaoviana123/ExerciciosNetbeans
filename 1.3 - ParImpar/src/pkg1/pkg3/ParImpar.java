/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3;

/**
 *
 * @author viana
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0;
        System.out.println("O número de referência é " + number);
        
        if (number % 2 == 0){
            System.out.println("Este é um número par");
        }
        else{
            System.out.println("Este é um número ímpar");
        }
    }   
}
