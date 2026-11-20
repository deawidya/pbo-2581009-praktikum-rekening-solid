public class LaporanBank {
    public void cetakDaftar(String judul, Rekening[] semua) {
        System.out.println("========== " + judul + " ==========");
        for (Rekening rekening : semua) {
            System.out.printf(
                    "%03d | %-6s | Rp%,12d       %s%n",
                    rekening.getNomor(),
                    rekening.getPemilik(),
                    rekening.getSaldo(),
                    rekening.keterangan()
            );
        }
    }

    public void cetakTotal(Rekening[] semua) {
        int total = 0;

        for (Rekening rekening : semua) {
            total += rekening.getSaldo();
        }

        System.out.println("-----------------------------------");
        System.out.printf("Total dana bank : Rp%,d%n", total);
    }
}
