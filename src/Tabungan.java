public class Tabungan extends Rekening implements BerBunga {
    private double bunga;
    public Tabungan(int nomor, String pemilik, int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || saldo < jumlah) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    @Override
    public int potongBiayaAdmin() {
        int biaya = saldo < 500000 ? 5000 : 0;
        saldo -= biaya;
        return biaya;
    }

    @Override
    public int tambahBunga() {
        int jumlahBunga = (int) (saldo * bunga / 100);
        saldo += jumlahBunga;
        return jumlahBunga;
    }

    @Override
    public String keterangan() {
        return String.format(
                java.util.Locale.US,
                "Tabungan, bunga %.1f%% per bulan",
                bunga
        );
    }
}
