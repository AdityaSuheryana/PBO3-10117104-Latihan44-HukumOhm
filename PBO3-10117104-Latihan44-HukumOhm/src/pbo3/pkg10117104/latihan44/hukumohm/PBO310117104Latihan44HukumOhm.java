/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan44.hukumohm;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Program ini menggunakan konstruktor untuk dapat 
 * menampilkan keterangan tentang hukum Ohm dan dapat menampilkan 
 * hasil perhitungan tegangan arus listrik tapi tidak dapat di input 
 * oleh keyboard User 
 */
public class PBO310117104Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai Bt = new Baterai();
        System.out.println("");
        System.out.println("Kuat Arus : "+Bt.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+Bt.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+Bt.hitungTegangan()+" volt");
        
    }
    
}
