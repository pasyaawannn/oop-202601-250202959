package id.ac.upb.asetpinjam.model;
import id.ac.upb.asetpinjam.config.Varian;

public class AlatLab extends Aset {

    private String laboratorium;
    private TingkatRisiko tingkatRisiko;

    public AlatLab(String kode, String nama, String laboratorium, TingkatRisiko tingkatRisiko) {
        super(kode, nama);
        if (laboratorium == null || laboratorium.isBlank()) {
            throw new IllegalArgumentException("Laboratorium tidak boleh kosong");
        }
        if (tingkatRisiko == null) {
            throw new IllegalArgumentException("Tingkat risiko tidak boleh null");
        }
        this.laboratorium = laboratorium;
        this.tingkatRisiko = tingkatRisiko;
    }

    public String getLaboratorium() {
        return laboratorium;
    }

    public TingkatRisiko getTingkatRisiko() {
        return tingkatRisiko;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.ALAT_LAB;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
    if (hariTerlambat < 0) {
        throw new IllegalArgumentException("Hari tidak boleh negatif");
    }
    return (long) hariTerlambat * 4 * Varian.aktif().dendaPerHari;
    }
}