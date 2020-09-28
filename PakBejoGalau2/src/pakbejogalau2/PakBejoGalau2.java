/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakbejogalau2;

/**
 *
 * @author User
 */
public class PakBejoGalau2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik(30,30,10,54000);
        System.out.println("Total keramik A adalah " + k1.totalKeramik() + " Buah");
        System.out.println("Total Box keramik A adalah " + k1.totalBox() + " Box");
        System.out.println("Total Harga keramik A adalah Rp " + k1.totalBiaya() + " Rupiah");
        System.out.println("--------------------------------------------------------------");
                
        Keramik k2 = new Keramik(40,40,5,65000);
        System.out.println("Total Keramik B adalah " + k2.totalKeramik() + " Buah");
        System.out.println("Total Box keramik B adalah " + k2.totalBox() + " Box");
        System.out.println("Total Harga keramik B adalah Rp " + k2.totalBiaya() + " Rupiah");
        System.out.println("--------------------------------------------------------------");
                
        Keramik k3 = new Keramik(30,40,8,60000);
        System.out.println("Total keramik C adalah " + k3.totalKeramik() + " Buah");
        System.out.println("Total Box keramik C adalah " + k3.totalBox() + " Box");
        System.out.println("Total Harga keramik C adalah Rp " + k3.totalBiaya() + " Rupiah");
        System.out.println("--------------------------------------------------------------");
    }
}

    
    

