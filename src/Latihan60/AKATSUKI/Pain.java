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
public class Pain extends Akatsuki{
    private String partnerTim;
    
    public Pain() {
        this.nama = "Pain / Nagato Uzumaki";
        this.asalNegara = "Amegakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Yang ";
        this.jutsu = "Banshō Tenin, Chibaku Tensei, Shinra Tensei";
        this.partnerTim = "Konan";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " ketua organisasi akatsuki, pain berjumlah 6 orang yang ternyata "+
                "\ndikendalikan dari jarak jauh oleh Nagato dengan mata rinnegan. ia mulai memimpin " +
                "\nAkatsuki yang baru, yang akan menggunakan cara kekerasan untuk mencapai tujuan mereka.   " +
                "\nSebenarnya Pain bukanlah ketua akatsuki karna yang mengepalai akatsuki yang sebenarnya " +
                "\nadalah Tobi yang mengaku sebagai Madara Uchiha.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
