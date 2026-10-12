package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;

/** Minggu 1, gaya PROSEDURAL: hanya fungsi statis dan data primitif, tanpa objek buatan sendiri. */
public final class HelloProsedural {

    private HelloProsedural() {
    }

    /**
     * TODO minggu 1: kembalikan sapaan yang memuat kata "Aset-Pinjam", nama, dan NIM.
     * Contoh bentuk: "Hello Aset-Pinjam, saya Budi (2310112345)".
     */
    public static String sapa(String nama, String nim) {
    return "Aset-Pinjam " + nama + " " + nim;
    }

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(sapa(v.nama, v.nim));
    }
}
