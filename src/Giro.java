public class Giro extends Rekening {
    private int batasOverdraft;
    public Giro(int nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || saldo - jumlah < -batasOverdraft) {
            return false;
        }

        saldo -= jumlah;
        return true;
    }

    @Override
    public int potongBiayaAdmin() {
        int biaya = 15000;
        saldo -= biaya;
        return biaya;
    }

    @Override
    public String keterangan() {
        return "Giro, batas overdraft Rp" + formatRupiah(batasOverdraft);
    }

    private String formatRupiah(int jumlah) {
        return String.format("%,d", jumlah).replace(',', '.');
    }
}
