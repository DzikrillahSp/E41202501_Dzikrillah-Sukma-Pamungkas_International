/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulanganfor;
import java.util.Scanner;
/**
 *
 * @author acer
 */

public class nilairatarata {
    public static void main (String []args){
       int maksimum, minimum, jumlah, i, array[];
       int rata=0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukan banyaknya data nilai = ");
    jumlah = scan.nextInt();
    array = new int[jumlah];
    for(i = 0; i < jumlah; i++) {
      System.out.print("Masukan data nilai ke-"+ (i+1) +" = " );
      array[i] = scan.nextInt();
    }
    maksimum = array[0];
    minimum = array[0];
    rata = maksimum - minimum;
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
      }
      else if(array[i] < minimum){
                 minimum = array[i];    
            }    
    }
    for ( int tambah : array ){
            rata = rata+tambah;}
             rata = rata/jumlah;
    System.out.println("Nilai minimum = "+minimum);
     System.out.println("Nilai maksimum = "+maksimum);
    System.out.println("Nilai rata ratanya adalah = "+rata);
  }
}