package Praktikum03;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen24[] arrayofdosen = new Dosen24[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayofdosen[i] = new Dosen24();

            System.out.println("Masukkan data dosen ke- " + (i + 1));
            System.out.print("Kode: ");
            arrayofdosen[i].kode = sc.nextLine();
            System.out.print("Nama: ");
            arrayofdosen[i].nama = sc.nextLine();
            System.out.print("Jenis kelamin (pria/wanita): ");
            dummy = sc.nextLine();
            if (dummy.equalsIgnoreCase("Pria")) {
                arrayofdosen[i].jenisKelamin = true;
            } else {
                arrayofdosen[i].jenisKelamin = false;
            }

            System.out.print("Usia: ");
            dummy = sc.nextLine();
            arrayofdosen[i].usia = Integer.parseInt(dummy);
            System.out.println("---------------------------------");
        }
        for (Dosen24 dsn : arrayofdosen) {
            dsn.cetakInfo();
        }
        sc.close();
    }
}
