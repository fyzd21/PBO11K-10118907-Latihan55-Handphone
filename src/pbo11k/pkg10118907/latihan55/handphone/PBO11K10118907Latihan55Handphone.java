/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan55.handphone;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan handphone
 * 
 */
public class PBO11K10118907Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        a.setKeyStore("2341bfd3840fo");
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        b.setPinBB("BHS249");
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        w.setWpKeyStore("UUUQIJWORJ");
        
        a.displayProduct();
        System.out.println("Android Key Store : "+a.getKeyStore());
        System.out.println("");
        
        b.displayProduct();
        System.out.println("PIN BB : "+b.getPinBB());
        System.out.println("");
        
        w.displayProduct();
        System.out.println("WP Key Store : "+w.getWpKeyStore());
    }
    
}
