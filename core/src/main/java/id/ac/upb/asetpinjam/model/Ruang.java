package id.ac.upb.asetpinjam.model;

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

    public long hitungDenda(int hariTerlambat) {
        throw new UnsupportedOperationException("TODO minggu 4");
    }
}