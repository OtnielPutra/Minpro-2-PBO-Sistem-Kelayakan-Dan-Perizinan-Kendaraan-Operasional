/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Kendaraan;
import model.KendaraanLayak;
import model.KendaraanTidakLayak;
import model.Perizinan;

/**
 *
 */
interface Manajemen<T> {

    boolean tambah(T data);

    boolean hapus(String kunci);

    List<T> getDaftar();
}

/**
 * Controller: mengelola data kendaraan dan perizinan.
 * Tidak ada input/output layar di sini (itu tugas View).
 */
public class Monitoring implements Manajemen<Kendaraan> {

    private final ArrayList<Kendaraan> daftarKendaraan =
        new ArrayList<>();

    private final ArrayList<Perizinan> daftarPerizinan =
        new ArrayList<>();

    public Monitoring() {

        daftarKendaraan.add(
            new KendaraanLayak(
                "KT1234AB",
                "Mobil",
                "Toyota",
                2022
            )
        );

        daftarPerizinan.add(
            new Perizinan(
                "IZ001",
                "KT1234AB",
                "Operasional",
                "31-12-2026"
            )
        );
    }

    // Getter mengembalikan daftar read-only, jadi pihak luar tidak bisa
    // menambah/menghapus data langsung tanpa lewat method di class ini.
    @Override
    public List<Kendaraan> getDaftar() {
        return Collections.unmodifiableList(daftarKendaraan);
    }

    public List<Kendaraan> getDaftarKendaraan() {
        return Collections.unmodifiableList(daftarKendaraan);
    }

    public List<Perizinan> getDaftarPerizinan() {
        return Collections.unmodifiableList(daftarPerizinan);
    }

    // private: pencarian dipakai bersama oleh method lain agar tidak menulis loop berulang
    // Mengembalikan indeks data, atau -1 jika tidak ditemukan
    private int cariIndex(String plat) {

        for (int i = 0; i < daftarKendaraan.size(); i++) {

            if (daftarKendaraan.get(i).getPlatNomor().equalsIgnoreCase(plat)) {
                return i;
            }
        }

        return -1;
    }

    // Cek apakah plat nomor sudah terdaftar (untuk validasi di View)
    public boolean platTerdaftar(String plat) {
        return cariIndex(plat) >= 0;
    }

    // Overloading tambah: menerima objek
    // Data kosong atau plat kembar ditolak di sini, jadi daftar selalu valid
    @Override
    public boolean tambah(Kendaraan kendaraan) {

        if (kendaraan == null || platTerdaftar(kendaraan.getPlatNomor())) {
            return false;
        }

        return daftarKendaraan.add(kendaraan);
    }

    // Overloading tambah: menerima data mentah
    public boolean tambah(
        String plat,
        String jenis,
        String merk,
        int tahun,
        String kondisi
    ) {
        return tambah(buatKendaraan(plat, jenis, merk, tahun, kondisi));
    }

    // Overloading hapus: berdasarkan plat nomor
    @Override
    public boolean hapus(String plat) {

        int index = cariIndex(plat);

        if (index < 0) {
            return false;
        }

        daftarKendaraan.remove(index);
        return true;
    }

    // Overloading hapus: berdasarkan indeks
    public boolean hapus(int index) {

        if (index < 0 || index >= daftarKendaraan.size()) {
            return false;
        }

        daftarKendaraan.remove(index);
        return true;
    }

    public boolean updateKondisi(String plat, String kondisiBaru) {

        int index = cariIndex(plat);

        if (index < 0) {
            return false;
        }

        Kendaraan k = daftarKendaraan.get(index);

        daftarKendaraan.set(
            index,
            buatKendaraan(
                k.getPlatNomor(),
                k.getJenis(),
                k.getMerk(),
                k.getTahun(),
                kondisiBaru
            )
        );

        return true;
    }

    public boolean tambahPerizinan(Perizinan perizinan) {

        if (perizinan == null) {
            return false;
        }

        return daftarPerizinan.add(perizinan);
    }

    private Kendaraan buatKendaraan(
        String plat,
        String jenis,
        String merk,
        int tahun,
        String kondisi
    ) {

        if (kondisi.equals(Kendaraan.LAYAK)) {
            return new KendaraanLayak(plat, jenis, merk, tahun);
        }

        return new KendaraanTidakLayak(plat, jenis, merk, tahun);
    }
}
