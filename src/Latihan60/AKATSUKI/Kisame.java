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
public class Kisame extends Akatsuki{
    private String partnerTim;
    
    public Kisame() {
        this.nama = "Kisame Hoshigaki";
        this.asalNegara = "Kirigakure";
        this.elemen = "Air";
        this.jutsu = "Jurus Elemen Air";
        this.partnerTim = "Itachi Uchiha";
    }
    
    @Override
    public void siapaAnda() {
        System.out.println(nama + " dijuluki sebagai bijuu tanpa ekor karna dia memiliki cakra yang sangat banyak " +
                "\nseperti para bijuu, dia pengguna pedang Samehadaku yang dapat menyerap cakra lawan.\n");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
