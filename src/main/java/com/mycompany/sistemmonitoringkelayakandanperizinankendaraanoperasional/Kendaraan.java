/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmonitoringkelayakandanperizinankendaraanoperasional;

/**
 *
 * @author Otniel
 */
public class Kendaraan {

    String platNomor;
    String jenis;
    String merk;
    int tahun;
    String kondisi;

    public Kendaraan(String platNomor, String jenis, String merk, int tahun, String kondisi) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.merk = merk;
        this.tahun = tahun;
        this.kondisi = kondisi;
    }
}