/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmonitoringkelayakandanperizinankendaraanoperasional;
import java.util.ArrayList;
/**
 *
 * @author Otniel
 */
public class Monitoring {

    ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

    public void tambah(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
        System.out.println("Data kendaraan berhasil ditambahkan.");
    }

    public void tampil() {

        if (daftarKendaraan.isEmpty()) {
            System.out.println("Data kendaraan masih kosong.");
        } else {

            System.out.println("\n=== DATA KENDARAAN ===");

            for (int i = 0; i < daftarKendaraan.size(); i++) {

                Kendaraan k = daftarKendaraan.get(i);

                System.out.println("Data ke-" + (i + 1));
                System.out.println("Plat Nomor : " + k.platNomor);
                System.out.println("Jenis      : " + k.jenis);
                System.out.println("Merk       : " + k.merk);
                System.out.println("Tahun      : " + k.tahun);
                System.out.println("Kondisi    : " + k.kondisi);
                System.out.println("-------------------------");
            }
        }
    }

    public void hapus(String plat) {

        for (int i = 0; i < daftarKendaraan.size(); i++) {

            if (daftarKendaraan.get(i).platNomor.equals(plat)) {
                daftarKendaraan.remove(i);
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }

        System.out.println("Data tidak ditemukan.");
    }
}