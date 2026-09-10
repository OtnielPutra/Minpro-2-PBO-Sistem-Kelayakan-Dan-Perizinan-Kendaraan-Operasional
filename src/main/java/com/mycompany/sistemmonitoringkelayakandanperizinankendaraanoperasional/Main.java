/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmonitoringkelayakandanperizinankendaraanoperasional;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Otniel
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Monitoring monitoring = new Monitoring();
        ArrayList<Perizinan> daftarPerizinan = new ArrayList<>();

        String[] status = {"Layak", "Tidak Layak"};
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MONITORING KENDARAAN ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Kendaraan");
            System.out.println("3. Update Kondisi");
            System.out.println("4. Hapus Kendaraan");
            System.out.println("5. Tambah Perizinan");
            System.out.println("6. Tampilkan Perizinan");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== TAMBAH KENDARAAN ===");

                    System.out.print("Plat Nomor: ");
                    String plat = input.nextLine();

                    System.out.print("Jenis Kendaraan: ");
                    String jenis = input.nextLine();

                    System.out.print("Merk: ");
                    String merk = input.nextLine();

                    System.out.print("Tahun: ");
                    int tahun = input.nextInt();

                    System.out.println("1. " + status[0]);
                    System.out.println("2. " + status[1]);
                    System.out.print("Pilih kondisi: ");
                    int pilih = input.nextInt();
                    input.nextLine();

                    String kondisi;

                    if (pilih == 1) {
                        kondisi = status[0];
                    } else if (pilih == 2) {
                        kondisi = status[1];
                    } else {
                        kondisi = "Tidak diketahui";
                    }

                    monitoring.tambah(
                        new Kendaraan(plat, jenis, merk, tahun, kondisi)
                    );

                    break;

                case 2:
                    monitoring.tampil();
                    break;

                case 3:
                    System.out.println("\n=== UPDATE KONDISI ===");

                    System.out.print("Plat Nomor: ");
                    String platUpdate = input.nextLine();

                    System.out.println("1. " + status[0]);
                    System.out.println("2. " + status[1]);
                    System.out.print("Pilih kondisi baru: ");
                    int pilihBaru = input.nextInt();
                    input.nextLine();

                    String kondisiBaru;

                    if (pilihBaru == 1) {
                        kondisiBaru = status[0];
                    } else if (pilihBaru == 2) {
                        kondisiBaru = status[1];
                    } else {
                        kondisiBaru = "Tidak diketahui";
                    }

                    boolean ditemukan = false;

                    for (Kendaraan k : monitoring.daftarKendaraan) {

                        if (k.platNomor.equals(platUpdate)) {
                            k.kondisi = kondisiBaru;
                            ditemukan = true;
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Kondisi berhasil diperbarui.");
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }

                    break;

                case 4:
                    System.out.print("\nPlat Nomor: ");
                    monitoring.hapus(input.nextLine());
                    break;

                case 5:
                    System.out.println("\n=== TAMBAH PERIZINAN ===");

                    System.out.print("Nomor Izin: ");
                    String nomor = input.nextLine();

                    System.out.print("Plat Nomor: ");
                    String platIzin = input.nextLine();

                    System.out.print("Jenis Izin: ");
                    String jenisIzin = input.nextLine();

                    System.out.print("Tanggal Berlaku: ");
                    String tanggal = input.nextLine();

                    daftarPerizinan.add(
                        new Perizinan(
                            nomor,
                            platIzin,
                            jenisIzin,
                            tanggal
                        )
                    );

                    System.out.println("Perizinan berhasil ditambahkan.");

                    break;

                case 6:
                    System.out.println("\n=== DATA PERIZINAN ===");

                    if (daftarPerizinan.isEmpty()) {
                        System.out.println("Data masih kosong.");
                    } else {
                        for (Perizinan p : daftarPerizinan) {

                            System.out.println("\nNomor Izin : " + p.nomorIzin);
                            System.out.println("Plat Nomor : " + p.platNomor);
                            System.out.println("Jenis Izin : " + p.jenisIzin);
                            System.out.println("Tanggal    : " + p.tanggalBerlaku);
                        }
                    }

                    break;

                case 7:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia.");
            }

        } while (pilihan != 7);

        input.close();
    }
}