/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Otniel
 */
public class KendaraanLayak extends Kendaraan {

    public KendaraanLayak(
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

    public void cekKelayakan() {

        System.out.println(
            "Kendaraan layak digunakan."
        );
    }
}