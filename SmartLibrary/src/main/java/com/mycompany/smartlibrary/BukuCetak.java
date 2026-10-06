package com.mycompany.smartlibrary;

public class BukuCetak extends Koleksi implements DapatDipinjam, DapatDinilai {
    private int jumlahHalaman;

    public BukuCetak(String judul, String pengarang, int tahunTerbit, int jumlahHalaman) {
        super(judul, pengarang, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanInfo() {
        // ...
    }

    @Override
    public void caraPinjam() {
        // ...
    }

    @Override
    public void hitungDendaKeterlambatan() {
        System.out.println("-> Aturan Denda: Rp 2.000 / hari keterlambatan.");
    }

    @Override
    public void prosesPinjamFisik() {
        System.out.println("-> PROSES PINJAM: Anggota menyerahkan buku fisik & kartu perpustakaan ke Kasir.");
    }

    @Override
    public void beriRating(int bintang) {
        System.out.println("-> ULASAN BUKU: Buku fisik ini mendapat rating " + bintang + "/5 Bintang.");
    }
}