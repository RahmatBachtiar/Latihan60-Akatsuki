/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan60.AKATSUKI;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rahmat Bachtiar
 * KELAS    : FS112B-PBO
 * NIK      : 2022431598
 * Deskripsi Program	: Program ini berisi program untuk
 * menampilkan profile anggota akatsuki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,pilihan;
        char lanjut;
        
        String[] listnama = {
            "Itachi Uchiha", "Deidara", "Hidan", "Kakuzu", "Kisame", "Konan",
            "Obito", "Orochimaru", "Pain", "Sasori", "Zetsu"
        };
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        do {
            System.out.println("===Daftar Anggota Akatsuki===");
            for (i = 0; i < listnama.length; i++) {
                System.out.println(i+1 + " . " + listnama[i]);
            }
            System.out.print("\nMasukan Pilihan Anda (1~"+i+"): ");
            pilihan = scan1.nextInt();
            
            switch(pilihan) {
                case 1:
                    Itachi itachi = new Itachi();
                    itachi.tampilData();
                    System.out.println("Partner : " + itachi.getPartnerTim());
                    itachi.siapaAnda();
                    break;
                case 2:
                    Deidara deidara = new Deidara();
                    deidara.tampilData();
                    System.out.println("Partner : " + deidara.getPartnerTim());
                    deidara.siapaAnda();
                    break;
                case 3:
                    Hidan hidan = new Hidan();
                    hidan.tampilData();
                    System.out.println("Partner : " + hidan.getPartnerTim());
                    hidan.siapaAnda();
                    break;
                case 4:
                    Kakuzu kakuzu = new Kakuzu();
                    kakuzu.tampilData();
                    System.out.println("Partner : " + kakuzu.getPartnerTim());
                    kakuzu.siapaAnda();
                    break;
                case 5:
                    Kisame kisame = new Kisame();
                    kisame.tampilData();
                    System.out.println("Partner : " + kisame.getPartnerTim());
                    kisame.siapaAnda();
                    break;
                case 6:
                    Konan konan = new Konan ();
                    konan.tampilData();
                    System.out.println("Partner : " + konan.getPartnerTim());
                    konan.siapaAnda();
                    break;
                case 7:
                    Obito obito = new Obito();
                    obito.tampilData();
                    System.out.println("Partner : " + obito.getPartnerTim());
                    obito.siapaAnda();
                    break;
                case 8:
                    Orochimaru orochimaru = new Orochimaru();
                    orochimaru.tampilData();
                    System.out.println("Partner : " + orochimaru.getPartnerTim());
                    orochimaru.siapaAnda();
                    break;
                case 9:
                    Pain pain = new Pain();
                    pain.tampilData();
                    System.out.println("Partner : " + pain.getPartnerTim());
                    pain.siapaAnda();
                    break;
                case 10:
                    Sasori sasori = new Sasori();
                    sasori.tampilData();
                    System.out.println("Partner : " + sasori.getPartnerTim());
                    sasori.siapaAnda();
                    break;
                case 11:
                    Zetsu zetsu = new Zetsu();
                    zetsu.tampilData();
                    System.out.println("Partner : " + zetsu.getPartnerTim());
                    zetsu.siapaAnda();
                default:
                    System.out.println("Nomor yang anda pilih belum tersedia");
            }
            System.out.println("\nLanjut (y/n)? : ");
            lanjut = scan2.next().charAt(0);
        }while(lanjut != 'n');
    }
    
}