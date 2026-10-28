package id.ac.upb.asetpinjam.model;

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

    public long hitungDenda(int hariTerlambat) {
        throw new UnsupportedOperationException("TODO minggu 4");
    }
}