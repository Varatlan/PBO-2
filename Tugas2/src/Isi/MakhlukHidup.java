/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Isi;

/**
 *
 * @author RIGISEFA
 */
public class MakhlukHidup {
    private String nama;
    private String famili;
    private String genus;
    private String habitat;
    public MakhlukHidup(){
        this.nama = "Ndak tau";
        this.famili = "Yatim";
        this.genus = "Ndak tau";
        this.habitat = "Tidak terdefinisi";
    }
    public MakhlukHidup(String nama){
        this.nama = nama;
        this.famili = "Yatim";
        this.genus = "Tidak diketahui";
        this.habitat = "Tidak terdefinisi";
    }
    public MakhlukHidup(String nama, String famili){
        this.nama = nama;
        this.famili = famili;
        this.genus = "Tidak diketahui";
        this.habitat = "Tidak terdefinisi";
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getFamili() {
        return famili;
    }
    public void setFamili(String famili) {
        this.famili = famili;
    }
    public String getGenus() {
        return genus;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
