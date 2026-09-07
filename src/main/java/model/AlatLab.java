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
    private String idAlat;
    private String namaAlat;
    private String kondisiAlat;
    private int stok;
    
    //construktor
    public AlatLab (String idAlat, String namaAlat, int stok, String kondisiAlat){
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kondisiAlat = kondisiAlat;
        this.stok = stok;
    }
    
    //getter setter
    public String getIdAlat() {
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
    
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println(">> ERROR VALIDASI : Stok tidak this.stok = 0");
        }
    }
    
    //method perilaku objek
    public void tampilkanInfo() {
        System.out.printf("%-20s | %-20s |%-6d |%-20s\n", idAlat, namaAlat, stok, kondisiAlat);
    }
}
