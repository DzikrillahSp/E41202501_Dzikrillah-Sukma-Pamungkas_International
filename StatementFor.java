/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class StatementFor {
    public static void main (String [] args){
        for (int i=0; i<=5; i++){
            for (int a=0; a<=i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
