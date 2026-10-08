/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import controller.Monitoring;
import java.util.Scanner;
import model.Perizinan;
import view.Animasi;
import view.KendaraanView;

/**
 * Titik awal program (main).
 * Main hanya menghubungkan View dan Controller:
 * View   -> input, output, validasi, animasi
 * Controller (Monitoring) -> mengelola data
 */
// pada class: Main tidak perlu diwariskan
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Monitoring monitoring = new Monitoring();
        KendaraanView view = new KendaraanView(input);

        int pilihan;

        Animasi.animasiAwal();

        do {
            view.tampilMenu();
            pilihan = view.inputMenu();

            switch (pilihan) {

                case 1:
                    Animasi.bukaMenu("menu tambah kendaraan");
                    System.out.println("\n=== TAMBAH KENDARAAN ===");

                    String plat = view.inputPlat("Plat Nomor: ");

                    // Plat nomor tidak boleh kembar
                    if (monitoring.platTerdaftar(plat)) {
                        view.tampilPesan(
                            "Plat nomor sudah terdaftar."
                        );
                        break;
                    }

                    String jenis = view.inputJenis("Jenis Kendaraan: ");
                    String merk = view.inputMerk("Merk: ");
                    int tahun = view.inputTahun("Tahun: ");
                    String kondisi = view.pilihKondisi("Pilih kondisi: ");

                    Animasi.loading("Memproses data kendaraan");

                    monitoring.tambah(plat, jenis, merk, tahun, kondisi);
                    view.tampilPesan(
                        "Data kendaraan berhasil ditambahkan."
                    );

                    break;

                case 2:
                    Animasi.bukaMenu("data kendaraan");
                    view.tampilKendaraan(monitoring.getDaftar());
                    break;

                case 3:
                    Animasi.bukaMenu("menu update kondisi");
                    System.out.println("\n=== UPDATE KONDISI ===");

                    String platUpdate = view.inputPlat("Plat Nomor: ");

                    if (!monitoring.platTerdaftar(platUpdate)) {
                        view.tampilPesan("Kendaraan tidak ditemukan.");
                        break;
                    }

                    String kondisiBaru = view.pilihKondisi(
                        "Pilih kondisi baru: "
                    );

                    Animasi.loading();

                    if (monitoring.updateKondisi(platUpdate, kondisiBaru)) {
                        view.tampilPesan(
                            "Kondisi berhasil diperbarui."
                        );
                    } else {
                        view.tampilPesan(
                            "Kendaraan tidak ditemukan."
                        );
                    }

                    break;

                case 4:
                    Animasi.bukaMenu("menu hapus kendaraan");

                    String platHapus = view.inputPlat("\nPlat Nomor: ");

                    Animasi.loading();

                    if (monitoring.hapus(platHapus)) {
                        view.tampilPesan("Data berhasil dihapus.");
                    } else {
                        view.tampilPesan("Data tidak ditemukan.");
                    }

                    break;

                case 5:
                    Animasi.bukaMenu("menu perizinan");
                    System.out.println("\n=== TAMBAH PERIZINAN ===");

                    String nomor = view.inputText(
                        "Nomor Izin: ",
                        3,
                        20
                    );

                    String platIzin = view.inputPlat("Plat Nomor: ");

                    // Izin hanya bisa dibuat untuk kendaraan yang sudah terdaftar
                    if (!monitoring.platTerdaftar(platIzin)) {
                        view.tampilPesan(
                            "Plat nomor belum terdaftar. Tambah kendaraan terlebih dahulu."
                        );
                        break;
                    }

                    String jenisIzin = view.inputHuruf(
                        "Jenis Izin: ",
                        3,
                        30
                    );

                    String tanggal = view.inputTanggal(
                        "Tanggal Berlaku (dd-MM-yyyy): "
                    );

                    Animasi.loading("Menyimpan perizinan");

                    monitoring.tambahPerizinan(
                        new Perizinan(
                            nomor,
                            platIzin,
                            jenisIzin,
                            tanggal
                        )
                    );

                    view.tampilPesan(
                        "Perizinan berhasil ditambahkan."
                    );

                    break;

                case 6:
                    Animasi.bukaMenu("data perizinan");
                    view.tampilPerizinan(monitoring.getDaftarPerizinan());
                    break;

                case 7:
                    Animasi.animasiKeluar();
                    view.tampilPesan("\nProgram selesai.");
                    break;

                default:
                    view.tampilPesan(
                        "\nPilihan tidak tersedia."
                    );
            }

        } while (pilihan != 7);

        input.close();
    }
}