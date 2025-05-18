package com.main;

import com.stuff.Barang;
import com.stuff.StokTidakCukupException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Barang> DaftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Character input;

        do {
            try {
                System.out.println("============================");
                System.out.println("== Menu Management Stocks ==");
                System.out.println("============================");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Tampilkan Semua Barang");
                System.out.println("3. Kurangi Stock");
                System.out.println("4. Keluar");
                System.out.println("============================");
                System.out.print("Pilih menu: ");
                int menu = scanner.nextInt();
                scanner.nextLine();

                switch (menu) {
                    case 1:
                        try {
                            System.out.println("============================");
                            System.out.println("==== Tambah Barang Baru ====");
                            System.out.println("============================");
                            System.out.print("Masukkan nama barang: ");
                            String nama = scanner.nextLine();

                            System.out.print("Masukkan stock barang: ");
                            int stock = scanner.nextInt();
                            scanner.nextLine();

                            Barang barang = new Barang(nama, stock);

                            DaftarBarang.add(barang);

                            System.out.println("============================");
                            System.out.println("Barang " + barang.getNama() + " berhasil ditambahkan");

                        } catch (InputMismatchException e) {
                            System.out.println("=============================");
                            System.out.println("Input stok harus berupa angka! Silakan coba lagi.");
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        if (DaftarBarang.isEmpty()) {
                            System.out.println("Tidak ada barang yang ditambahkan.");
                        } else {
                            System.out.println("============================");
                            System.out.println("Daftar Barang :");
                            System.out.println("============================");

                            Iterator<Barang> iterator = DaftarBarang.iterator();
                            int index = 0;
                            while (iterator.hasNext()) {
                                Barang b = iterator.next();
                                System.out.println("Index: " + index);
                                System.out.println("Nama Barang: " + b.getNama());
                                System.out.println("Stock Barang: " + b.getStock());
                                index++;
                                System.out.println("============================");
                            }
                        }
                        break;
                    case 3:
                        if (DaftarBarang.isEmpty()) {
                            System.out.println("Tidak ada barang yang ditambahkan.");
                        } else {
                            System.out.println("============================");
                            System.out.println("Daftar Barang :");
                            System.out.println("============================");

                            Iterator<Barang> iterator = DaftarBarang.iterator();
                            int index = 0;
                            while (iterator.hasNext()) {
                                Barang b = iterator.next();
                                System.out.println("Index: " + index);
                                System.out.println("Nama Barang: " + b.getNama());
                                System.out.println("Stock Barang: " + b.getStock());
                                index++;
                                System.out.println("============================");
                            }
                            try {
                                System.out.print("Masukkan index barang yang ingin dikurangi stock: ");
                                int indexBarang = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Masukkan jumlah stock yang ingin dikurangi: ");
                                int jumlahKurang = scanner.nextInt();
                                scanner.nextLine();

                                try {
                                    Barang barang = DaftarBarang.get(indexBarang);

                                    if (barang.getStock() >= jumlahKurang) {
                                        barang.setStock(barang.getStock() - jumlahKurang);

                                        System.out.println("=============================");
                                        System.out.println("Stock barang " + barang.getNama() + " berhasil dikurangi.");
                                    } else {
                                        System.out.println("=============================");
                                        throw new StokTidakCukupException(
                                                "Stock barang tidak mencukupi untuk dikurangi.");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Index barang tidak valid! Silakan coba lagi.");
                                }
                            } catch (IndexOutOfBoundsException e) {
                                System.out
                                        .println("Input index dan jumlah stock harus berupa angka! Silakan coba lagi.");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Terjadi kesalahan : " + e.getMessage());
                                System.out.println("Silakan coba lagi.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Menu tidak valid! Silakan coba lagi.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input menu harus berupa angka! Silakan coba lagi.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan : " + e.getMessage());
                System.out.println("Silakan coba lagi.");
            }
            System.out.println("Apakah Anda ingin kembali ke menu? (y/n)");
            input = scanner.nextLine().charAt(0);
        } while (input == 'y' || input == 'Y');
        System.out.println("Terima kasih telah menggunakan aplikasi ini.");
        scanner.close();
    }
}