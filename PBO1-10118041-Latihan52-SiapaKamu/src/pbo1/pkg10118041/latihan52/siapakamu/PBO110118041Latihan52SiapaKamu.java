/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118041.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA  : Eki salman sya'bani
 * KELAS : IF 1
 * NIM   : 10118041
 * Deskripsi Program : Program ini untuk membuat tampilan dosen dan mahasiswa.
 */
public class PBO110118041Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118014");
        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Jovi D Haris");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO1");
        mahasiswa.kelasApa();
    }
    
}
