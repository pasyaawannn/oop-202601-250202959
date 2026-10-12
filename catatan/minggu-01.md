# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Minggu pertama saya mengerjakan tiga file Java yaitu HelloProsedural, HelloOOP, dan HelloFungsional
yang masing-masing mengimplementasikan paradigma berbeda namun menghasilkan output yang sama.
Saya juga mengisi file mahasiswa.properties dengan NIM dan nama saya, serta melakukan setup
JDK 21, Maven, dan Git di komputer saya.

## Keputusan desain
Saya memilih format sapaan "Aset-Pinjam [nama] [nim]" karena singkat dan memenuhi
ketiga unsur yang diminta. Pada HelloOOP saya menambahkan field private nama dan nim
lalu mengisinya lewat konstruktor. Pada HelloFungsional saya menggunakan lambda
yang menerima nama dan menggabungkannya dengan nim dari parameter luar.

## Kendala
Kendala terbesar adalah proses instalasi JDK 21 dan Maven karena harus mengatur
PATH dan JAVA_HOME secara manual di System Variables Windows. Awalnya perintah
mvn tidak dikenali terminal, setelah PATH diatur dengan benar barulah Maven bisa berjalan.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: setup environment JDK dan Maven, pengisian kode HelloOOP dan HelloFungsional
- Prompt utama:
  1. Bagaimana cara install JDK 21 dan Maven di Windows?
  2. Bagaimana cara mengisi konstruktor HelloOOP dengan field private?
  3. Bagaimana cara membuat lambda di HelloFungsional?
- Yang saya ubah atau tolak dari saran AI: format sapaan saya tentukan sendiri agar berbeda
- Satu hal yang saya pahami lebih baik sekarang: perbedaan cara kerja antara paradigma prosedural, OOP, dan fungsional dalam Java

## Kelebihan dan Keterbatasan Tiap Gaya

- Prosedural
  1. Kelebihan: Sederhana dan mudah dipahami untuk program kecil
  2. Keterbatasan: Tidak cocok untuk sistem besar karena data dan fungsi terpisah

- OOP
  1. Kelebihan: Data terlindungi lewat field private dan kode lebih terstruktur
  2. Keterbatasan: Perlu lebih banyak kode untuk program yang sederhana

- Fungsional
  1. Kelebihan: Kode ringkas dan fungsi bisa diperlakukan sebagai nilai
  2. Keterbatasan: Konsep lambda dan higher-order function sulit dipahami pemula