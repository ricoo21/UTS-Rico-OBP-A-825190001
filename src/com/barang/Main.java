//nama=Rico.Handoyo
//NIM=825190001
package com.barang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int harga, terima;
        int bonus = 0;
        double total = 0;
        double komisi = 0;

        //harga lebih kecil dari 500ribu
        System.out.print("Harga Barang: ");
        harga = scan.nextInt();

        while (harga > 500000) {
            System.out.println("Harga maksimal 500ribu");
            System.out.print("Harga Barang: ");
            harga = scan.nextInt();
        }
        System.out.print("Jumlah uang dibayar: ");
        terima = scan.nextInt();

        kembalian(harga, terima, komisi,bonus,total );
    }

    private static void kembalian(int harga, int terima, double komisi,int bonus,double total) {

        int kembali = terima - harga;
        System.out.println("Kembalian: " + kembali);

        int nilai;
        nilai = kembali / 100000;
        kembali -= nilai * 100000;
        System.out.println("Jumlah uang Rp.100000: " + nilai);
        nilai = kembali / 50000;
        kembali -= nilai * 50000;
        System.out.println("Jumlah uang Rp.50000: " + nilai);
        nilai = kembali / 20000;
        kembali -= nilai * 20000;
        System.out.println("Jumlah uang Rp.20000: " + nilai);
        nilai = kembali / 10000;
        System.out.println("Jumlah uang Rp.10000: " + nilai);

        if (harga<=100000){
            bonus=10000;
            komisi=0.1*harga;
            System.out.println("bonus : Rp"+bonus);
            System.out.println("komisi yang didapat 10% :" + komisi);
        }else if (harga<=200000){
            bonus=50000;
            komisi=0.2*harga;
            System.out.println("bonus : Rp"+bonus);
            System.out.println("komisi yang didapat 20%: " +komisi);
        }else if (harga<=300000){
            bonus=75000;
            komisi=0.3*harga;
            System.out.println("bonus : Rp"+bonus);
            System.out.println("komisi yang didapat 30%: " +komisi);
        }else if (harga<=400000){
            bonus=100000;
            komisi=0.4*harga;
            System.out.println("bonus : Rp"+bonus);
            System.out.println("komisi yang didapat 40%: " +komisi);
        }else if (harga<=500000){
            bonus=150000;
            komisi=0.5*harga;
            System.out.println("bonus : Rp"+bonus);
            System.out.println("komisi yang didapat 50%: "+komisi);
        }
        total=  komisi + bonus;
        System.out.println("total bonus dan komisi :" +total);
    }
}