public class Deposito extends Rekening implements BerBunga {
    private double bunga;
    public Deposito(int nomor, String pemilik, int saldo, double bunga) {
        super(nomor, pemilik, saldo);
        this.bunga = bunga;
    }

    @Override
    public boolean tarik(int jumlah) {
        return false;
    }

    @Override
    public int potongBiayaAdmin() {
        return 0;
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
                "Deposito, bunga %.1f%% per bulan",
                bunga
        );
    }
}
