# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Minggu ini saya membuat tiga subclass dari Aset yaitu Ruang, Laptop, dan AlatLab.
Masing-masing subclass memiliki field dan konstruktor sendiri yang memanggil super()
untuk validasi kode dan nama dari class induk. Saya juga mengoverride method getJenis()
di tiap subclass agar mengembalikan jenis yang sesuai.

## Keputusan desain
Field yang menjadi milik induk adalah kode, nama, status, dan kondisi karena semua
jenis aset memilikinya. Field spesifik seperti kapasitas, spesifikasi, nomorInventaris,
laboratorium, dan tingkatRisiko menjadi field di subclass masing-masing.

## Kendala
Memahami cara kerja super() di konstruktor subclass. super() harus dipanggil
pertama sebelum validasi field subclass karena Java mengharuskan konstruktor
induk dijalankan lebih dulu.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: konstruktor Ruang, Laptop, AlatLab, dan override getJenis()
- Prompt utama:
  1. Bagaimana cara membuat subclass yang memanggil konstruktor induk di Java?
  2. Bagaimana cara override method getJenis() di subclass?
- Yang saya ubah atau tolak dari saran AI: tidak ada perubahan signifikan
- Satu hal yang saya pahami lebih baik sekarang: super() harus dipanggil pertama di konstruktor subclass sebelum kode lain

## Contoh inheritance kurang tepat dibanding komposisi
Pada sistem ini, jika ada aset yang bisa berfungsi sebagai Laptop sekaligus AlatLab
(misalnya laptop khusus lab), inheritance tidak bisa menanganinya karena Java tidak
mendukung multiple inheritance. Komposisi lebih tepat karena bisa menggabungkan
kemampuan dari beberapa class sekaligus.