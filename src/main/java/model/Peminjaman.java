/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Peminjaman {
    private int idPeminjaman;
    private String namaPetugas;
    private String namaAlat;
    private int jumlahPinjam;
    private String status;
    
    //construktor
    public Peminjaman (int idPeminjaman, String namaPetugas, String namaAlat, int jumlahPinjam) {
        this.idPeminjaman = idPeminjaman;
        this.namaPetugas = namaPetugas;
        this.namaAlat = namaAlat;
        this.jumlahPinjam = jumlahPinjam;
        this.status = "Dipinjam";
    }
    
    //getter setter
    public int getIdPeminjaman() {
        return idPeminjaman; 
    }
    
    public String getNamaPetugas() {
        return namaPetugas;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    //method perilaku objek
    public void tampilkanInfo() {
        System.out.printf("%-6d | %-20s | %-20s | %-6d | %-20s\n", idPeminjaman, namaPetugas, namaAlat, jumlahPinjam, status);
    }
}
