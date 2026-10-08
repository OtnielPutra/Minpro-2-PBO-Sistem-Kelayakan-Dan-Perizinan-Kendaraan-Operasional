/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Kendaraan yang berstatus layak.
 * Access modifier: public (bisa diakses package lain).
 * final pada class: class ini tidak bisa diwariskan lagi.
 */
public final class KendaraanLayak extends Kendaraan {

    // private: hanya dipakai di dalam class ini
    // final: nilainya tetap, tidak bisa diubah
    private static final String KETERANGAN =
        "Kendaraan layak digunakan.";

    // public: constructor harus bisa dipanggil dari controller
    // Kondisi tidak diminta lagi, karena class ini pasti "Layak"
    public KendaraanLayak(
        String platNomor,
        String jenis,
        String merk,
        int tahun
    ) {

        super(
            platNomor,
            jenis,
            merk,
            tahun,
            LAYAK
        );
    }

    // Overriding abstract method
    @Override
    public String getKeterangan() {
        return KETERANGAN;
    }

    // Overriding method dari Object
    @Override
    public String toString() {
        return "[LAYAK] " + getInfo(true);
    }
}
