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
public class Keramik {
     int panjang,lebar,isi,harga,totalKotakKeramik;
    
    Keramik (int p, int l, int s, int h) {
        this.panjang = p;
        this.lebar = l;
        this.isi = s;
        this.harga = h;
    }


    int totalKeramik(){
        int total;
        int luasLantai = 1000000;
        total = luasLantai / (panjang * lebar);
        return total;
    }
    
    int totalBox() {
        int total;
        int luasLantai = 1000000;
        total = (luasLantai / (panjang*lebar)) / isi;
        return total;
    }
    
    int totalBiaya() {
        int total;
        int luasLantai = 1000000;
        total = ((luasLantai / (panjang * lebar)) / isi) * harga;
        return total;
    }
}
