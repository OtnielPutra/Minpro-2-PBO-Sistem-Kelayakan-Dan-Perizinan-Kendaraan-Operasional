/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 * Kumpulan animasi tampilan untuk program.
 * Semua animasi memakai teks yang ditambah satu per satu (tanpa \r atau \b)
 * supaya tetap rapi di console NetBeans, CMD, maupun terminal lain.
 */
public class Animasi {

    // final pada konstanta: panjang bar default tidak berubah
    private static final int PANJANG_BAR = 32;

    // Class utilitas (constructor private), tidak perlu dibuat objeknya
    private Animasi() {
    }

    // ===================== DASAR =====================

    private static void tidur(int ms) {

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Efek mesin tik
    public static void ketik(String teks, int delay) {

        for (int i = 0; i < teks.length(); i++) {
            System.out.print(teks.charAt(i));
            tidur(delay);
        }

        System.out.println();
    }

    // ===================== LOADING (OVERLOADING) =====================

    // loading(): gelombang titik sederhana
    public static void loading() {

        System.out.print("Memproses ");

        for (int i = 0; i < 6; i++) {
            System.out.print(i % 2 == 0 ? "o" : ".");
            tidur(180);
        }

        System.out.println(" selesai!");
    }

    // loading(String): progress bar dengan pesan
    public static void loading(String pesan) {
        loading(pesan, PANJANG_BAR);
    }

    // loading(String, int): progress bar dengan panjang yang bisa diatur.
    // Kecepatan berubah-ubah: lambat di awal, cepat di tengah, lambat lagi di akhir
    // supaya terasa seperti sedang "bekerja" sungguhan.
    public static void loading(String pesan, int panjang) {

        System.out.print(pesan + " [");

        for (int i = 1; i <= panjang; i++) {

            System.out.print("=");

            // Penanda persen di dalam bar
            if (i == panjang / 4) {
                System.out.print("25%");
            } else if (i == panjang / 2) {
                System.out.print("50%");
            } else if (i == (panjang * 3) / 4) {
                System.out.print("75%");
            }

            double posisi = (double) i / panjang;
            int delay = 20 + (int) (70 * Math.abs(Math.cos(Math.PI * posisi)));
            tidur(delay);
        }

        System.out.println("] 100%");
    }

    // Loading bertahap: tiap tahap muncul satu per satu lalu diberi tanda OK
    public static void loadingBertahap(String[] tahap) {

        for (int i = 0; i < tahap.length; i++) {

            System.out.print("  [" + (i + 1) + "/" + tahap.length + "] " + tahap[i] + " ");

            for (int j = 0; j < 5; j++) {
                System.out.print(".");
                tidur(120);
            }

            System.out.println(" OK");
            tidur(150);
        }
    }

    // Transisi saat membuka menu
    public static void bukaMenu(String namaMenu) {

        System.out.print("Membuka " + namaMenu + " ");

        for (int i = 0; i < 4; i++) {
            System.out.print(">");
            tidur(120);
        }

        System.out.println();
        tidur(100);
    }

    // ===================== ANIMASI PROGRAM =====================

    public static void animasiAwal() {

        String garis = "+====================================================+";

        System.out.println();

        // Bingkai judul digambar baris demi baris
        String[] bingkai = {
            garis,
            "|                                                    |",
            "|          SISTEM MONITORING KELAYAKAN DAN           |",
            "|          PERIZINAN KENDARAAN OPERASIONAL           |",
            "|                                                    |",
            garis
        };

        for (String baris : bingkai) {
            System.out.println(baris);
            tidur(150);
        }

        System.out.println();
        ketik("Selamat datang! Sistem sedang disiapkan...", 25);
        System.out.println();

        loadingBertahap(new String[] {
            "Memuat modul sistem",
            "Menyiapkan data kendaraan",
            "Memeriksa data perizinan",
            "Menyinkronkan data"
        });

        System.out.println();
        loading("Menyelesaikan persiapan");

        System.out.println();
        ketik("Sistem siap digunakan.", 30);
    }

    public static void animasiKeluar() {

        System.out.println();
        loadingBertahap(new String[] {
            "Menyimpan sesi",
            "Menutup koneksi data"
        });

        ketik("Terima kasih telah menggunakan sistem ini. Sampai jumpa!", 20);
    }
}
