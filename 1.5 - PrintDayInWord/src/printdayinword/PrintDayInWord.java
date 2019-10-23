/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printdayinword;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author viana
 */
public class PrintDayInWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        int dia = dis.readInt();
        
        switch (dia){
            case 1:
                System.out.println("Segunda-Feira");
            case 2:
                System.out.println("Terça-Feira");
            case 3:
                System.out.println("Quarta-Feira");
            case 4:
                System.out.println("Quinta-Feira");
            case 5:
                System.out.println("Sexta-Feira");
            case 6:
                System.out.println("Sábado");
            case 7:
                System.out.println("Domingo");
    }    
}
}
