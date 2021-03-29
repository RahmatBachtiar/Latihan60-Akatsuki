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
public class Itachi extends Akatsuki {
    private String partnerTim;
    
    public Itachi() {
        this.nama = "Itachi Uchiha";
        this.asalNegara = "Konohagakure";
        this.elemen = "Api, Angin, Air";
        this.jutsu = "Amaterasu, Sharingan, Susanoo, Tsukoyomi";
        this.partnerTim = "Kisame";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + "adalah anggota Akatsuki dan bekerja untuk " + asalNegara);
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
