package com.stuff;

public class Barang {
    private String nama;
    private int stock;

    public Barang(String nama, int stock) {
        setNama(nama);
        setStock(stock);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
