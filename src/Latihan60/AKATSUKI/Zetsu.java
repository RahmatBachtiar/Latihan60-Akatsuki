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
public class Zetsu extends Akatsuki{
    private String partnerTim;
    
    public Zetsu() {
        this.nama = "Zetsu";
        this.asalNegara = "-";
        this.elemen = "Kayu";
        this.jutsu = "menyerap cakra";
        this.partnerTim = "Obito";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah mata-mata Akatsuki. Zetsu terdiri dari zetsu hitam dan putih, " +
                "\n sehingga membuatnya memiliki dua kepribadian. Kanibal. Zetsu Hitam diciptakan oleh Kaguya");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
