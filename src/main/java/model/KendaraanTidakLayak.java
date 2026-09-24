/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Otniel
 */
public class KendaraanTidakLayak extends Kendaraan {

    public KendaraanTidakLayak(
        String platNomor,
        String jenis,
        String merk,
        int tahun,
        String kondisi
    ) {

        super(
            platNomor,
            jenis,
            merk,
            tahun,
            kondisi
        );
    }

    public void cekPerbaikan() {

        System.out.println(
            "Kendaraan tidak layak dan perlu diperiksa."
        );
    }
}