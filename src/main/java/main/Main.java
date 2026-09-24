/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.Perizinan;
import model.KendaraanTidakLayak;
import model.KendaraanLayak;
import model.Kendaraan;
import model.Monitoring;
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

        daftarPerizinan.add(
            new Perizinan(
                "IZ001",
                "KT1234AB",
                "Operasional",
                "31-12-2026"
            )
        );

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

            pilihan = inputInteger(input, "Pilih menu: ", 1, 7);

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== TAMBAH KENDARAAN ===");

                    String plat = inputText(input, "Plat Nomor: ", 3, 10);
                    String jenis = inputText(
                        input,
                        "Jenis Kendaraan: ",
                        3,
                        30
                    );

                    String merk = inputText(
                        input,
                        "Merk: ",
                        2,
                        30
                    );

                    int tahun = inputInteger(
                        input,
                        "Tahun: ",
                        1900,
                        2026
                    );

                    System.out.println("1. " + status[0]);
                    System.out.println("2. " + status[1]);

                    int pilih = inputInteger(
                        input,
                        "Pilih kondisi: ",
                        1,
                        2
                    );

                    String kondisi;

                    if (pilih == 1) {
                        kondisi = status[0];
                    } else {
                        kondisi = status[1];
                    }

                    loading();

                    if (kondisi.equals("Layak")) {
                        monitoring.tambah(
                            new KendaraanLayak(
                                plat,
                                jenis,
                                merk,
                                tahun,
                                kondisi
                            )
                        );
                    } else {
                        monitoring.tambah(
                            new KendaraanTidakLayak(
                                plat,
                                jenis,
                                merk,
                                tahun,
                                kondisi
                            )
                        );
                    }

                    break;

                case 2:
                    monitoring.tampil();
                    break;

                case 3:
                    System.out.println("\n=== UPDATE KONDISI ===");

                    String platUpdate = inputText(
                        input,
                        "Plat Nomor: ",
                        3,
                        10
                    );

                    System.out.println("1. " + status[0]);
                    System.out.println("2. " + status[1]);

                    int pilihBaru = inputInteger(
                        input,
                        "Pilih kondisi baru: ",
                        1,
                        2
                    );

                    String kondisiBaru;

                    if (pilihBaru == 1) {
                        kondisiBaru = status[0];
                    } else {
                        kondisiBaru = status[1];
                    }

                    boolean ditemukan = false;

                    for (int i = 0;
                         i < monitoring.getDaftarKendaraan().size();
                         i++) {

                        Kendaraan k =
                            monitoring.getDaftarKendaraan().get(i);

                        if (
                            k.getPlatNomor()
                                .equalsIgnoreCase(platUpdate)
                        ) {

                            Kendaraan kendaraanBaru;

                            if (kondisiBaru.equals("Layak")) {

                                kendaraanBaru =
                                    new KendaraanLayak(
                                        k.getPlatNomor(),
                                        k.getJenis(),
                                        k.getMerk(),
                                        k.getTahun(),
                                        kondisiBaru
                                    );

                            } else {

                                kendaraanBaru =
                                    new KendaraanTidakLayak(
                                        k.getPlatNomor(),
                                        k.getJenis(),
                                        k.getMerk(),
                                        k.getTahun(),
                                        kondisiBaru
                                    );
                            }

                            monitoring
                                .getDaftarKendaraan()
                                .set(i, kendaraanBaru);

                            ditemukan = true;
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println(
                            "Kondisi berhasil diperbarui."
                        );
                    } else {
                        System.out.println(
                            "Kendaraan tidak ditemukan."
                        );
                    }

                    break;

                case 4:
                    String platHapus = inputText(
                        input,
                        "\nPlat Nomor: ",
                        3,
                        10
                    );

                    monitoring.hapus(platHapus);
                    break;

                case 5:
                    System.out.println("\n=== TAMBAH PERIZINAN ===");

                    String nomor = inputText(
                        input,
                        "Nomor Izin: ",
                        3,
                        20
                    );

                    String platIzin = inputText(
                        input,
                        "Plat Nomor: ",
                        3,
                        10
                    );

                    String jenisIzin = inputText(
                        input,
                        "Jenis Izin: ",
                        3,
                        30
                    );

                    String tanggal = inputText(
                        input,
                        "Tanggal Berlaku: ",
                        8,
                        20
                    );

                    daftarPerizinan.add(
                        new Perizinan(
                            nomor,
                            platIzin,
                            jenisIzin,
                            tanggal
                        )
                    );

                    System.out.println(
                        "Perizinan berhasil ditambahkan."
                    );

                    break;

                case 6:
                    System.out.println("\n=== DATA PERIZINAN ===");

                    if (daftarPerizinan.isEmpty()) {

                        System.out.println(
                            "Data masih kosong."
                        );

                    } else {

                        for (Perizinan p : daftarPerizinan) {

                            System.out.println(
                                "\nNomor Izin : "
                                + p.getNomorIzin()
                            );

                            System.out.println(
                                "Plat Nomor : "
                                + p.getPlatNomor()
                            );

                            System.out.println(
                                "Jenis Izin : "
                                + p.getJenisIzin()
                            );

                            System.out.println(
                                "Tanggal    : "
                                + p.getTanggalBerlaku()
                            );
                        }
                    }

                    break;

                case 7:
                    loading();
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println(
                        "\nPilihan tidak tersedia."
                    );
            }

        } while (pilihan != 7);

        input.close();
    }

    public static String inputText(
        Scanner input,
        String pesan,
        int min,
        int max
    ) {

        while (true) {

            System.out.print(pesan);
            String data = input.nextLine().trim();

            if (data.isEmpty()) {

                System.out.println(
                    "Input tidak boleh kosong."
                );

            } else if (data.length() < min) {

                System.out.println(
                    "Input minimal "
                    + min
                    + " karakter."
                );

            } else if (data.length() > max) {

                System.out.println(
                    "Input maksimal "
                    + max
                    + " karakter."
                );

            } else {
                return data;
            }
        }
    }

    public static int inputInteger(
        Scanner input,
        String pesan,
        int min,
        int max
    ) {

        while (true) {

            System.out.print(pesan);
            String data = input.nextLine().trim();

            if (data.isEmpty()) {

                System.out.println(
                    "Input tidak boleh kosong."
                );

                continue;
            }

            try {

                int angka = Integer.parseInt(data);

                if (angka < min || angka > max) {

                    System.out.println(
                        "Input harus berada di antara "
                        + min
                        + " dan "
                        + max
                        + "."
                    );

                } else {
                    return angka;
                }

            } catch (NumberFormatException e) {

                System.out.println(
                    "Input harus berupa angka."
                );
            }
        }
    }

    public static void loading() {

        System.out.print("Memproses");

        for (int i = 0; i < 3; i++) {

            System.out.print(".");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
    }
}