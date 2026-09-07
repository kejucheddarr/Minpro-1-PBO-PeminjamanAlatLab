/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Peminjaman;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class PeminjamanService {
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();

    public void tambahPeminjaman (Peminjaman peminjaman) {
        daftarPeminjaman.add(peminjaman);
        System.out.println(">> Peminjaman berhasil ditambahkan!");
    }
    
    public void tampilkanPeminjaman() {
        if (daftarPeminjaman.isEmpty()) {
            System.out.println(">> Belum ada data peminjaman.");
            return;
        }
        
        for (Peminjaman p : daftarPeminjaman) {
            System.out.println("\n=====================================");
            System.out.println("ID Peminjaman: " + p.getIdPeminjaman());
            System.out.println("Nama Petugas: " + p.getNamaPetugas());
            System.out.println("Nama Alat: " + p.getNamaAlat());
            System.out.println("Jumlah Pinjam: " + p.getJumlahPinjam());
            System.out.println("Status: " + p.getStatus());
        }
    }
    
    public void kembalikanAlat(int idTarget) {
        for (Peminjaman p : daftarPeminjaman) {
            if (p.getIdPeminjaman() == idTarget) {
                if (p.getStatus().equals("Dikembalikan")) {
                    System.out.println(">> Alat sudah dikembalikan.");
                } else {
                    p.setStatus("Dikembalikan");
                    System.out.println(">> Alat berhasil dikembalikan!");
                }
                return;
            }
        }
        System.out.println(">> ID peminjaman tidak ditemukan.");
    }
}
