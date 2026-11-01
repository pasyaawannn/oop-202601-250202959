package id.ac.upb.asetpinjam.model;
import id.ac.upb.asetpinjam.config.Varian;

public class Laptop extends Aset {

    private String spesifikasi;
    private String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        if (spesifikasi == null || spesifikasi.isBlank()) {
            throw new IllegalArgumentException("Spesifikasi tidak boleh kosong");
        }
        if (nomorInventaris == null || nomorInventaris.isBlank()) {
            throw new IllegalArgumentException("Nomor inventaris tidak boleh kosong");
        }
        this.spesifikasi = spesifikasi;
        this.nomorInventaris = nomorInventaris;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari tidak boleh negatif");
    }
    return (long) hariTerlambat * 2 * Varian.aktif().dendaPerHari;
    }
}