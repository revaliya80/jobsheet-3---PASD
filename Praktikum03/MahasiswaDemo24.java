package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa24[] arrayofMahasiswa24 = new Mahasiswa24[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofMahasiswa24[i] = new Mahasiswa24();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            arrayofMahasiswa24[i].nim = sc.nextLine();
            System.out.print("Nama:  ");
            arrayofMahasiswa24[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayofMahasiswa24[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayofMahasiswa24[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }
        for (int i = 0; i < arrayofMahasiswa24.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            arrayofMahasiswa24[i].cetakInfo();
        }
        sc.close();
    }
}
