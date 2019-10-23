/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1_4;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author viana
 */
public class Ex1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
             
        DataInputStream dis = new DataInputStream(System.in);
        int number = dis.readInt();
        
        /*if(number = 1){
            System.out.println("A");
        }
        else if(number = 2){
            System.out.println("B");
        }
        else if(number = 3){
            System.out.println("C");
        }
        else ("Escolha outro número");
    
        System.out.println("");*/
        switch (number){
            case 1:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
            case 4:
                System.out.println("D");
            case 5:
                System.out.println("E");
            case 6:
                System.out.println("F");
            case 7:
                System.out.println("G");
            case 8:
                System.out.println("H");
            case 9:
                System.out.println("I");
        }
    } 
}
