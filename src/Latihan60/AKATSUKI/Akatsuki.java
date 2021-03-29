/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan60.AKATSUKI;

/**
 *
 * @author 
 * NAMA     : Rahmat Bachtiar
 * KELAS    : FS112B-PBO
 * NIK      : 2022431598
 * Deskripsi Program	: Program ini berisi program untuk
 * menampilkan profile anggota akatsuki
 */
public class Akatsuki {
    protected String nama, asalNegara, elemen, jutsu;
    
    public Akatsuki() {
        this.nama = " ";
        this.asalNegara = " ";
        this.elemen = " ";
        this.jutsu = " ";
    }
    public void tampilData() {
        System.out.println("-------------------");
        System.out.println("Nama        : " + nama);
        System.out.println("Asal Negara : " + asalNegara);
        System.out.println("Elemen      : " + elemen);
        System.out.println("Jutsu       : " + jutsu);
    }
    public void siapaAnda() {
        System.out.println(nama + "adalah anggota akatsuki");
    }
}
