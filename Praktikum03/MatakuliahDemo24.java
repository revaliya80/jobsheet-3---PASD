package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah24[] arrayOfMatakuliah24 = new Matakuliah24[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data matakuliah ke- " + (i + 1));
            System.out.print("Kode :");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("Sks : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------");

            arrayOfMatakuliah24[i] = new Matakuliah24(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah24[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke- " + (i + 1));
            arrayOfMatakuliah24[i].cetakInfo();
        }

        sc.close();
    }
}
