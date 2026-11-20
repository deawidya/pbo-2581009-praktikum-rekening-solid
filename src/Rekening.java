public abstract class Rekening {
    protected int nomor;
    protected String pemilik;
    protected int saldo;

    public Rekening(int nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setor(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    // Kontrak: true kalau berhasil, false kalau gagal,
    // tidak pernah melempar exception.
    public abstract boolean tarik(int jumlah);

    public abstract int potongBiayaAdmin();

    public abstract String keterangan();
}
