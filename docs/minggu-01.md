# Minggu 1: Paradigma Pemrograman dan Setup

Bobot: Quiz 2%, Praktikum 3%, Observasi 1%.

## Tujuan

- Membedakan paradigma prosedural, OOP, dan functional lewat satu program kecil yang sama.
- Menyiapkan JDK 21, Maven, Git, dan repo.

## Yang dikerjakan

- `core/src/main/java/id/ac/upb/asetpinjam/minggu01/HelloProsedural.java`, `HelloOOP.java`, `HelloFungsional.java`: isi `TODO`.
- Isi `core/src/main/resources/mahasiswa.properties` dengan NIM dan nama Anda.

## Aturan pasti (dipakai tes)

- Ketiga gaya menghasilkan teks yang sama: memuat "Aset-Pinjam", nama, dan NIM.
- Gaya prosedural: fungsi statis. OOP: class dengan field private. Fungsional: lambda yang dikembalikan sebuah fungsi.

## Keputusan Anda

- Bentuk kalimat sapaan (selama memuat tiga unsur di atas).

## Tes

`core/src/test/java/id/ac/upb/asetpinjam/Minggu01Test.java`

Jalankan: `bash scripts/uji.sh` (atau `.\scripts\uji.ps1` di PowerShell).

## Catatan

- Tulis di catatan: satu kelebihan dan satu keterbatasan tiap gaya untuk sistem peminjaman aset.

## Pengumpulan

- Commit dengan format `minggu-01: ringkasan`.
- Isi `catatan/minggu-01.md` dari `catatan/_template.md`, termasuk bagian **Penggunaan AI**.
- Bukti penilaian: CI hijau pada commit terakhir sebelum tenggat.
