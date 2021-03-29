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
public class Konan extends Akatsuki{
    private String partnerTim;
    
    public Konan() {
        this.nama = "Konan";
        this.asalNegara = "Amegakure";
        this.elemen = "Kertas";
        this.jutsu = "Tenshi no Fukuin";
        this.partnerTim = "Pain";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah rekan Pain, dan memiliki jurus origami yaitu kertas lipat, "+
                "\ndia juga dapat membuat tubuhnya menjadi lembaran-lembaran kertas. Bersama Yahiko dan Nagato " +
                "\nmereka bertiga adalah bekas murid Jiraiya sannin, mereka bertigalah yang awalnya membentuk " +
                "\nakatsuki untuk menciptakan perdamaian dengan cara bermusyawarah tanpa kekerasan, namun " +
                "\nYahiko terbunuh dan Nagato akhirnya bekerja sama dengan Tobi dan mengubah tujuan akatsuki.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
