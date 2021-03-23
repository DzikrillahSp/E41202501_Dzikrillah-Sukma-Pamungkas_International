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
public class tugaskasir2 {
     public static void main(String[] args) {
        // TODO code application logic here
         Scanner belanja = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("          Kharisma Agung Plaza < KAP >");
        System.out.println("            Promo Belanja Berhadiah");
        System.out.println("        Khusus Pembelian 5 Barang Pertama");
        System.out.println("         Dengan harga minimum Rp 10000,00");
        System.out.println("---------------------------------------------");
        
        // Nama Pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = belanja.nextLine();
        System.out.println();
        // Harga Barang
        System.out.print("Masukkan harga barang ke-1  : Rp ");
            int harga1 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-2  : Rp ");
            int harga2 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-3  : Rp ");
            int harga3 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-4  : Rp ");
            int harga4 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-5  : Rp ");
            int harga5 = belanja.nextInt();
        // Total
        int total = harga1 + harga2 + harga3 + harga4 + harga5;
        
        System.out.print("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println();
        System.out.println("Selamat.....");
        System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("                Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
        
    }
    
}