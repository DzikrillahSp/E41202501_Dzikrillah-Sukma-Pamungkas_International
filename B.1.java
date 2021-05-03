/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasarpewarisan;

/**
 *
 * @author acer
 */
public class B extends A {// mendeklarasikan class B yang diturunkan
    int z;                  // dari class A
    
    void TampilkanJumlah (){
        // subclass dapat mengakses member dari superclass
        System.out.println("Jumlah : " + (x+y+z));
    }
}
