/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peminjamanalatlab;

import java.util.Scanner;
import java.util.ArrayList;
import model.AlatLab;
import model.Peminjaman;
import service.PeminjamanService;

/**
 *
 * @author HP
 */
public class Laboratorium {
    public static void main(String [] args) {
        ArrayList<AlatLab> rakLab = new ArrayList<>();
        rakLab.add(new AlatLab(1, "Labu Erlenmeyer", "Baik", 10));
        rakLab.add(new AlatLab(2, "Beaker Glass", "Baik", 5));
        rakLab.add(new AlatLab(3, "Mikroskop", "Baik", 2));
        rakLab.add(new AlatLab(4, "Petri dish", "Baik", 15));
        
        Scanner scanner = new Scanner(System.in);
        PeminjamanService service = new PeminjamanService();
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN PEMINJAMAN ALAT LABORATORIUM BIOLOGI ===");
            System.out.println("1. Tampilkan Alat");
            System.out.println("2. Tambah Peminjaman");
            System.out.println("3. Tampilkan Riwayat Peminjaman");
            System.out.println("4. Kembalikan Alat");
            System.out.println("5. Keluar");
            System.out.println("Pilih Menu (1-5): ");
            //opsiiiiiiiiiw
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1 ->{
                    System.out.println("\n=== Daftar Alat Laboratorium ===");
                    for (AlatLab a : rakLab) {
                        System.out.println("-------------------------------");
                        System.out.println("ID Alat: " + a.getIdAlat());
                        System.out.println("Nama Alat: " + a.getNamaAlat());
                        System.out.println("Kondisi Alat: " + a.getKondisiAlat());
                        System.out.println("Stok: " + a.getStok());
                    }
                }
                case 2 ->{
                    System.out.println("ID Peminjaman: ");
                    int idPeminjaman = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("Nama Petugas: ");
                    String namaPetugas = scanner.nextLine();
                    
                    System.out.println("Nama Alat: ");
                    String namaAlat = scanner.nextLine();
                    
                    System.out.println("Jumlah Pinjam: ");
                    int jumlahPinjam = scanner.nextInt();
                    
                    Peminjaman peminjaman = new Peminjaman (idPeminjaman, namaPetugas, namaAlat, jumlahPinjam);
                    service.tambahPeminjaman(peminjaman);
                }
                case 3 ->{
                    service.tampilkanPeminjaman();
                }
                case 4 ->{
                    System.out.println("Masukkan ID Peminjaman: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();
                    
                    service.kembalikanAlat(idTarget);
                }
                case 5 ->{
                    berjalan = false;
                    System.out.println(">> Program selesai.");
                }
                default ->{
                    System.out.println(">> Pilihan Tidak Valid!");
                }
            }
        }
        scanner.close();
    }
}
