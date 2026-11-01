package id.ac.upb.asetpinjam.model;
import id.ac.upb.asetpinjam.config.Varian;

public class Ruang extends Aset {

    private int kapasitas;

    public Ruang(String kode, String nama, int kapasitas) {
        super(kode, nama);
        if (kapasitas <= 0) {
            throw new IllegalArgumentException("Kapasitas harus lebih dari 0");
        }
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.RUANG;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari tidak boleh negatif");
    }
    return (long) hariTerlambat * 1 * Varian.aktif().dendaPerHari;
    }
}