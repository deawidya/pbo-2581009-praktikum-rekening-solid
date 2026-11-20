public class ProsesAkhirBulan {
    public void potongBiayaAdmin(Rekening[] semua) {
        for (Rekening rekening : semua) {
            int biaya = rekening.potongBiayaAdmin();

            System.out.printf(
                    "%03d biaya admin  : Rp%,d%n",
                    rekening.getNomor(),
                    biaya
            );
        }
    }

    public void tambahBunga(BerBunga[] berbunga) {
        for (BerBunga rekening : berbunga) {
            int jumlahBunga = rekening.tambahBunga();

            Rekening r = (Rekening) rekening;
            System.out.printf(
                    "%03d bunga        : Rp%,d%n",
                    r.getNomor(),
                    jumlahBunga
            );
        }
    }

    public void autodebet(Rekening[] semua, int jumlah) {
        for (Rekening rekening : semua) {
            boolean berhasil = rekening.tarik(jumlah);

            System.out.printf(
                    "%03d autodebet    : %s%n",
                    rekening.getNomor(),
                    berhasil ? "Rp" + String.format("%,d", jumlah)
                            : "gagal"
            );
        }
    }
}
