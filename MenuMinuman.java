/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarray;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class MenuMinuman {
  
    public static void main (String[] args){
           
          Scanner input = new Scanner(System.in);
        int pesan,pilih;
           System.out.print("      CAFE CERIA\n     ANEKA MINUMAN\n --------------------- ");
    System.out.print("\nSpecial Menu:\n 1. Soft Drink\n 2. Mix Juice\n 3. Nescafe\n 4. Soda Milk\n 5. Tea\n ---------------------");
        String nama;
        System.out.print("\nMasukkan nama pembeli : ");
        nama = input.next();
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        pilih = input.nextInt();
          
      
        switch(pilih){
            case 1:

                System.out.println("Minuman yang anda pesan adalah : Soft Drink");
              System.out.println("Pesanan akan segera kami antar");
         System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
             
            break;
            case 2:
            
                System.out.println("Minuman yang anda pesan adalah : Mix Juice");
              System.out.println("Pesanan akan segera kami antar");
         System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
            break;
            case 3:
            
                System.out.println("Minuman yang anda pesan adalah : Nescafe");
                System.out.println("Pesanan akan segera kami antar");
         System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
            break;
            case 4:
              
                System.out.println("Minuman yang anda pesan adalah : Soda Milk");
                 System.out.println("Pesanan akan segera kami antar");
         System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
            break;
            case 5:
               
                System.out.println("Minuman yang anda pesan adalah : Tea");
               System.out.println("Pesanan akan segera kami antar");
         System.out.println("Terima Kasih "+ nama + " telah berkunjung diCafe Ceria");
         
            break;
            default:
            System.out.println("Salah Pilih ! :(");
           
        }
    }
}
