# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: tidak bentrok
- Alasan: waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman kedua, tidak tumpang tindih
- Dampak ke kode: (belum diimplementasi)
- Tes yang membuktikan: (belum implementasi)

## A-02: perhitungan denda per hari
- Pertanyaan: bagaimana denda dihitung bila terlambat 1 menit atau 25 jam?
- Keputusan: dibulatkan ke atas, 1 menit = 1 hari, 25 jam = 2 hari
- Alasan: sistem hanya mengenal hari bulat
- Dampak ke kode: hitungDenda()
- Tes yang membuktikan: (belum diimplementasi)

## A-03: normalisasi kode aset
- Pertanyaan: apakah kode aset perlu di-trim atau diubah ke huruf besar?
- Keputusan: tidak dinormalisasi
- Alasan: soal tidak mewajibkan
- Dampak ke kode: Aset.java konstruktor
- Tes yang membuktikan: Minggu02AsetTest

## Asumsi lain

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.
