# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Minggu ini saya mengubah class Aset menjadi abstract dan menjadikan method
getJenis() dan hitungDenda() sebagai abstract. Saya juga mengisi bisaDipinjam()
yang mengembalikan true hanya jika status TERSEDIA dan kondisi bukan RUSAK_BERAT.
Selain itu saya mengimplementasikan DendaFlat dan DendaProgresif yang mengimplementasikan
interface AturanDenda.

## Keputusan desain
Rumus denda progresif yang saya pilih adalah flat + (flat x hari / 10).
Rumus ini memenuhi semua syarat: 0 hari = 0, tidak pernah lebih murah dari flat,
tidak pernah turun saat hari bertambah, dan pada hari ke-30 lebih mahal dari flat.

## Kendala
Memahami kapan harus pakai abstract class vs interface. Abstract class dipakai
saat ada kode yang bisa dipakai bersama (seperti field dan getter di Aset),
sedangkan interface dipakai saat hanya mendefinisikan kontrak tanpa implementasi.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: mengubah Aset menjadi abstract, DendaFlat, DendaProgresif
- Prompt utama:
  1. Bagaimana cara mengubah class biasa menjadi abstract di Java?
  2. Bagaimana rumus denda progresif yang memenuhi syarat minimal?
- Yang saya ubah atau tolak dari saran AI: rumus progresif saya sederhanakan dari
  saran AI yang lebih kompleks karena hasilnya sama-sama memenuhi syarat
- Satu hal yang saya pahami lebih baik sekarang: perbedaan abstract class dan interface,
  abstract class untuk berbagi kode sedangkan interface hanya untuk kontrak