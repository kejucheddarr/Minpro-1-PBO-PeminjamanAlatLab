/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class AlatLab {
    private int idAlat;
    private String namaAlat;
    private String kondisiAlat;
    private int stok;
    
    //construktor
    public AlatLab (int idAlat, String namaAlat, String kondisiAlat, int stok){
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisiAlat = kondisiAlat;
        this.stok = stok;
    }
    
    //getter setter
    public int getIdAlat() {
        return idAlat;
    }
    
    public String getNamaAlat() {
        return namaAlat;
    }
    
    public String getKondisiAlat() {
        return kondisiAlat;
    }
    
    public int getStok() {
        return stok;
    }
    
    //method perilaku objek
    public void tampilkanInfo() {
        System.out.printf("%-20s | %-20s |%-6d |%-20s\n", idAlat, namaAlat, stok, kondisiAlat);
    }
}
