/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Otniel
 */
public class Perizinan {

    private final String nomorIzin;
    private String platNomor;
    private String jenisIzin;
    private String tanggalBerlaku;

    public Perizinan(
        String nomorIzin,
        String platNomor,
        String jenisIzin,
        String tanggalBerlaku
    ) {

        this.nomorIzin = nomorIzin;
        this.platNomor = platNomor;
        this.jenisIzin = jenisIzin;
        this.tanggalBerlaku = tanggalBerlaku;
    }

    public String getNomorIzin() {
        return nomorIzin;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getJenisIzin() {
        return jenisIzin;
    }

    public void setJenisIzin(String jenisIzin) {
        this.jenisIzin = jenisIzin;
    }

    public String getTanggalBerlaku() {
        return tanggalBerlaku;
    }

    public void setTanggalBerlaku(String tanggalBerlaku) {
        this.tanggalBerlaku = tanggalBerlaku;
    }
}
