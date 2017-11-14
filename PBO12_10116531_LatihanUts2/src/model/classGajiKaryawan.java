/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class classGajiKaryawan {
    private String nama;
    private String alamat;
    private int uangTrans;
    private int uangTun;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTrans() {
        return uangTrans;
    }

    public void setUangTrans(int uangTrans) {
        this.uangTrans = uangTrans;
    }

    public int getUangTun() {
        return uangTun;
    }

    public void setUangTun(int uangTun) {
        this.uangTun = uangTun;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
        return uangTun + uangTrans + gajiPokok;
    }
}
