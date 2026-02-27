package Praktikum03;

public class DataDosen24 {
    public void dataSemuaDosen(Dosen24[] arrayofdosen) {
        for (Dosen24 dsn : arrayofdosen) {
            dsn.cetakInfo();
        }
        System.out.println("=== Data Semua Dosen ===");
    }

    public void jumlahDosenPerJenisKelamin(Dosen24[] arrayofdosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen24 dsn : arrayofdosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah dosen pria: " + pria);
        System.out.println("Jumlah dosen wanita: " + wanita);
    }

    public void reratausiadosenperjeniskelamin(Dosen24[] arrayofdosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlpria = 0, jmlwanita = 0;

        for (Dosen24 dsn : arrayofdosen) {
            if (dsn.jenisKelamin) {
                totalPria += dsn.usia;
                jmlpria++;
            } else {
                totalWanita += dsn.usia;
                jmlwanita++;
            }
        }
        if (jmlpria > 0) {
            System.out.println("Rata-rata usia dosen pria: " + (totalPria / jmlpria));
        }
        if (jmlwanita > 0) {
            System.out.println("Rata-rata usia dosen wanita: " + (totalWanita / jmlwanita));
        }
        System.out.println("----------------------------------");
    }

    public Dosen24 infoDosenPalingTua(Dosen24[] arrayofdosen) {
        Dosen24 tertua = arrayofdosen[0];

        for (int i = 1; i < arrayofdosen.length; i++) {
            if (arrayofdosen[i].usia > tertua.usia) {
                tertua = arrayofdosen[i];
            }
        }
        System.out.println("Dosen Tertua: ");
        tertua.cetakInfo();
        return tertua;

    }

    public Dosen24 infodosenpalingmuda(Dosen24[] arrayofdosen) {
        Dosen24 termuda = arrayofdosen[0];

        for (int i = 1; i < arrayofdosen.length; i++) {
            if (arrayofdosen[i].usia < termuda.usia) {
                termuda = arrayofdosen[i];
            }
        }
        System.out.println("Dosen termuda: ");
        termuda.cetakInfo();
        return termuda;
    }
}
