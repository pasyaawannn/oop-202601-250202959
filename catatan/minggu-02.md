# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
Minggu ini saya mengerjakan file ```Aset.java``` dengan menambahkan field private
kode, nama, status, dan kondisi. Saya membuat konstruktor yang memvalidasi
kode dan nama agar tidak null atau kosong. Saya juga menambahkan getter untuk
semua field dan setter untuk nama, status, dan kondisi beserta validasinya.

## Keputusan desain
Saya tidak menormalisasi kode dengan trim atau huruf besar karena soal tidak
mewajibkannya. Untuk validasi saya menggunakan isBlank() agar string yang
hanya berisi spasi juga ditolak. Nilai default status diset TERSEDIA dan
kondisi diset BAIK sesuai aturan.

## Kendala
Kendala yang saya alami adalah memahami perbedaan IllegalArgumentException
dan UnsupportedOperationException. IllegalArgumentException dipakai untuk
validasi input yang salah, sedangkan UnsupportedOperationException dipakai
untuk method yang belum diimplementasi.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: field private, konstruktor, getter, setter, dan validasi di Aset.java
- Prompt utama:
  1. Bagaimana cara membuat field private dengan nilai default di Java?
  2. Bagaimana cara validasi null dan string kosong di konstruktor Java?
  3. Kapan pakai IllegalArgumentException?
- Yang saya ubah atau tolak dari saran AI: tidak ada perubahan signifikan
- Satu hal yang saya pahami lebih baik sekarang: encapsulation melindungi data dengan field private dan validasi di setter