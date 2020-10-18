//nama=Rico.Handoyo
//NIM=825190001
package com.barang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int harga, terima;
        //harga harus lebih kecil dari 100ribu
        System.out.print("Harga Barang: ");
        harga = scan.nextInt();

        while (harga > 100000) {
            System.out.println("Harga maksimal 100ribu");
            System.out.print("Harga Barang: ");
            harga = scan.nextInt();
        }
        System.out.print("Jumlah uang dibayar: ");
        terima = scan.nextInt();

        kembalian(harga, terima);
    }
    static void kembalian(int harga, int terima) {

        int kembali = terima - harga;
        System.out.println("Kembalian: " + kembali);

        int nilai;
        nilai = kembali / 20000;
        kembali -= nilai * 20000;
        System.out.println("Jumlah uang Rp.20000: " + nilai);
        nilai = kembali / 10000;
        kembali -= nilai * 10000;
        System.out.println("Jumlah uang Rp.10000: " + nilai);
        nilai = kembali / 5000;
        kembali -= nilai * 5000;
        System.out.println("Jumlah uang Rp.5000: " + nilai);
        nilai = kembali / 1000;
        System.out.println("Jumlah uang Rp.1000: " + nilai);
    }
}