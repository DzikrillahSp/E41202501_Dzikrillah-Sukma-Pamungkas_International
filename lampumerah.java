/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg3.array;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class lampumerah {
    public static void main (String [] args){
        // membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        // mengambil input
        System.out.print("Input nama warna : ");
        lampu = scan.nextLine();
        
        switch (lampu){
            case "merah":
            System.out.println("lampu merah, berhenti!");
            break;
            case "kuning":
                System.out.println("lampu kuning, Berhati-hatilah!");
                break;
            case "hijau":
                System.out.println("lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("warna lampu salah!");
        }
    }
    
}
