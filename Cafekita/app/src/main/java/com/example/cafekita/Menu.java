package com.example.cafekita;

public class Menu {
    private String gambar;
    private String nama;
    private String keterangan;
    private String bahan;
    private String harga;
    private String cafe;

    public Menu(String gambar, String nama, String keterangan) {
        this.gambar = gambar;
        this.nama = nama;
        this.keterangan = keterangan;
        this.bahan = bahan;
        this.harga = harga;
        this.cafe = cafe;
    }

    public String getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public String getBahan() {
        return bahan;
    }

    public String getHarga() {
        return harga;
    }

    public String getCafe() {
        return cafe;
    }
}