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
public class Orochimaru extends Akatsuki{
    private String partnerTim;
    
    public Orochimaru() {
        this.nama = "Orochimaru";
        this.asalNegara = "Konohagakure";
        this.elemen = "Angin, Petir, Tanah, Air, Api, Kayu, Yin, Yang ";
        this.jutsu = "Teknik Memanggil, Teknik Klon Ular, Edo Tensei";
        this.partnerTim = "Sasori";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah salah satu Sannin legendaris dari  " + asalNegara+
                ". \nOrochimaru dulu pernah menjadi anggota akatsuki sebelum dia hijrah ke Otogakure " +
                "\ndan memutuskan untuk bersolo karir. Dia keluar setelah gagal mengambil tubuh " +
                "\nItachi Uchiha lalu pergi ke desa Otogakure.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}