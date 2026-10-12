package id.ac.upb.asetpinjam.minggu01;

import id.ac.upb.asetpinjam.config.Varian;
import java.util.function.Function;

/** Minggu 1, gaya FUNGSIONAL: fungsi sebagai nilai (lambda), tanpa state yang berubah. */
public final class HelloFungsional {

    private HelloFungsional() {
    }

    /**
     * TODO minggu 1: kembalikan fungsi yang menerima NAMA dan menghasilkan sapaan
     * yang memuat "Aset-Pinjam", nama tersebut, dan NIM yang diberikan. Gunakan lambda.
     */
   public static Function<String, String> pembuatSapaan(String nim) {
    return nama -> "Aset-Pinjam " + nama + " " + nim;
}

    public static void main(String[] args) {
        Varian v = Varian.aktif();
        System.out.println(pembuatSapaan(v.nim).apply(v.nama));
    }
}
