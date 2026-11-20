public class BankSolid {
    public static void main(String[] args) {

        // Membuat objek rekening
        Tabungan ani = new Tabungan(101, "Ani", 1000000, 2.5);
        Tabungan citra = new Tabungan(102, "Citra", 300000, 2.0);
        Giro budi = new Giro(201, "Budi", 200000, 500000);
        Deposito dewi = new Deposito(301, "Dewi", 5000000, 4.0);

        // Menyusun array rekening
        Rekening[] semua = {
                ani, citra, budi, dewi
        };

        // Menyusun array rekening berbunga
        BerBunga[] berbunga = {
                ani, citra, dewi
        };

        // Membuat objek proses dan laporan
        ProsesAkhirBulan proses = new ProsesAkhirBulan();
        LaporanBank laporan = new LaporanBank();

        // Laporan rekening awal
        laporan.cetakDaftar("REKENING AWAL", semua);

        // Proses akhir bulan
        System.out.println("\n========== AKHIR BULAN ==========");

        proses.potongBiayaAdmin(semua);

        proses.tambahBunga(berbunga);

        proses.autodebet(semua, 50000);

        // Laporan rekening akhir
        laporan.cetakDaftar("REKENING AKHIR", semua);

        laporan.cetakTotal(semua);
    }
}
