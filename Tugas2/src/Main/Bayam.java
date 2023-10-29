/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Isi.Genus;

public class Bayam{
    public static void main(String[] args){
    Genus Bayam = new Genus("Bayam");
    Bayam.setNama("Bayam");
    Bayam.setHabitat("Darat");
    Bayam.setFamili("Amaranthaceae");
    Bayam.setGenus("Spinacia L");
    System.out.println("Nama makhluk hidup " + Bayam.getNama());
    System.out.println("Tinggal mana " + Bayam.getHabitat());
    System.out.println("Famili apa " + Bayam.getFamili());
    System.out.println("Genus mana " + Bayam.getGenus());
    }
}
