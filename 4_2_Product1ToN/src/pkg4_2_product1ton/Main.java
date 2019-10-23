/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_2_product1ton;

/**
 *
 * @author viana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int produto = 1;
        //int i;
        int lowerbound = 1;
        int upperbound = 10;
        
        for (int i = lowerbound; i<=upperbound; i++){
            System.out.println(produto*i);
        }
    }
    
}
