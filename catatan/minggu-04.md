# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Minggu ini saya mengoverride method hitungDenda() di tiga subclass Ruang, Laptop, dan AlatLab dengan multiplier berbeda. Saya juga mengimplementasikan dua overload method cari() di KatalogAset untuk mencari aset berdasarkan nama dan jenis.

## Keputusan desain
Tarif denda dibaca dari Varian.aktif().dendaPerHari sesuai varian NIM saya yaitu berangka 9 Rp 6.000 per hari. Multiplier yang dipakai: Ruang 1x, Laptop 2x, AlatLab 4x. Pencarian nama menggunakan toLowerCase() agar tidak membedakan huruf besar/kecil.

## Kendala
Memahami perbedaan overriding dan overloading. Overriding adalah mengubah implementasi method yang sama di subclass, sedangkan overloading adalah membuat method dengan nama sama tapi parameter berbeda di class yang sama.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: hitungDenda() di Ruang, Laptop, AlatLab dan cari() di KatalogAset
- Prompt utama:
  1. Bagaimana cara override hitungDenda() di subclass dengan multiplier berbeda?
  2. Bagaimana cara membuat overload method cari() dengan parameter berbeda?
- Yang saya ubah atau tolak dari saran AI: saran AI menggunakan stream dan lambda 
  untuk method cari(), tapi saya memilih menggunakan for loop biasa karena lebih 
  mudah dipahami dan hasilnya sama
- Satu hal yang saya pahami lebih baik sekarang: perbedaan overriding dan overloading dalam Java