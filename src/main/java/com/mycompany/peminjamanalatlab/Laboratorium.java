/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peminjamanalatlab;

import java.util.Scanner;
import model.AlatLab;
import model.Peminjaman;
import service.PeminjamanService;

/**
 *
 * @author HP
 */
public class Laboratorium {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        PeminjamanService service = new PeminjamanService();
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN PEMINJAMAN ALAT LABORATORIUM BIOLOGI ===");
            System.out.println("1. Tambah Peminjaman");
            System.out.println("2. Tampilkan Riwayat Peminjaman");
            System.out.println("3. Kembalikan Alat");
            System.out.println("4. Keluar");
            System.out.println("Pilih Menu (1-4): ");
            //opsiiiiiiiiiw
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1 ->{
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
                case 2 ->{
                    service.tampilkanPeminjaman();
                }
                case 3 ->{
                    System.out.println("Masukkan ID Peminjaman: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();
                    
                    service.kembalikanAlat(idTarget);
                }
                case 4 ->{
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
