/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg1.pkg2;

/**
 *
 * @author viana
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
	int mark = 51;
        System.out.println("O número de referência é " + mark);
	if (mark >= 50){
            System.out.println("O resultado é maior que 50 --> PASS");
	}
	else{
            System.out.println("O resultado é menor que 50 --> FAIL");
    }
}
    
}
