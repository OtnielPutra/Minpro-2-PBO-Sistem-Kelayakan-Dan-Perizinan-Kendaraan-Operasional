/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Otniel
 */
public class Monitoring {

    private ArrayList<Kendaraan> daftarKendaraan =
        new ArrayList<>();

    public Monitoring() {

        daftarKendaraan.add(
            new KendaraanLayak(
                "KT1234AB",
                "Mobil",
                "Toyota",
                2022,
                "Layak"
            )
        );
    }

    public ArrayList<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }

    public void tambah(Kendaraan kendaraan) {

        daftarKendaraan.add(kendaraan);

        System.out.println(
            "Data kendaraan berhasil ditambahkan."
        );
    }

    public void tampil() {

        if (daftarKendaraan.isEmpty()) {

            System.out.println(
                "Data kendaraan masih kosong."
            );

        } else {

            System.out.println(
                "\n=== DATA KENDARAAN ==="
            );

            for (int i = 0;
                 i < daftarKendaraan.size();
                 i++) {

                Kendaraan k =
                    daftarKendaraan.get(i);

                System.out.println(
                    "Data ke-" + (i + 1)
                );

                System.out.println(
                    "Plat Nomor : "
                    + k.getPlatNomor()
                );

                System.out.println(
                    "Jenis      : "
                    + k.getJenis()
                );

                System.out.println(
                    "Merk       : "
                    + k.getMerk()
                );

                System.out.println(
                    "Tahun      : "
                    + k.getTahun()
                );

                System.out.println(
                    "Kondisi    : "
                    + k.getKondisi()
                );

                if (k instanceof KendaraanLayak) {

                    ((KendaraanLayak) k)
                        .cekKelayakan();

                } else if (k instanceof KendaraanTidakLayak) {

                    ((KendaraanTidakLayak) k)
                        .cekPerbaikan();
                }

                System.out.println(
                    "-------------------------"
                );
            }
        }
    }

    public void hapus(String plat) {

        for (int i = 0;
             i < daftarKendaraan.size();
             i++) {

            if (
                daftarKendaraan
                    .get(i)
                    .getPlatNomor()
                    .equalsIgnoreCase(plat)
            ) {

                daftarKendaraan.remove(i);

                System.out.println(
                    "Data berhasil dihapus."
                );

                return;
            }
        }

        System.out.println(
            "Data tidak ditemukan."
        );
    }
}