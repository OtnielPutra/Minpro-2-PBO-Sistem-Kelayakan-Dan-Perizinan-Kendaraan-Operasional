/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Otniel
 */
public class Kendaraan {

    private final String platNomor;
    private String jenis;
    private String merk;
    private int tahun;
    private String kondisi;

    public Kendaraan(
        String platNomor,
        String jenis,
        String merk,
        int tahun,
        String kondisi
    ) {

        this.platNomor = platNomor;
        this.jenis = jenis;
        this.merk = merk;
        this.tahun = tahun;
        this.kondisi = kondisi;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}