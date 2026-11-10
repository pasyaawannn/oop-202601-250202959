# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Minggu ini saya membuat Class Diagram dan Sequence Diagram dari kode Aset-Pinjam menggunakan Mermaid. Class Diagram mencakup semua class, interface, enum, relasi, multiplicity, dan namespace paket. Sequence Diagram menggambarkan skenario pengajuan peminjaman berhasil dan skenario bentrok menggunakan fragmen alt. Saya juga menulis penjelasan tiga prinsip SOLID yang terlihat di kode.

## Keputusan desain
Saya memilih menunjukkan SRP, OCP, dan LSP karena ketiganya paling jelas terlihat di kode yang sudah ada. SRP pada KatalogAset, OCP pada AturanDenda dan implementasinya, dan LSP pada hierarki subclass Aset.

## Kendala
Kendala utama adalah membuat diagram yang konsisten dengan kode dan rapi tampilannya. Mermaid membantu membuat diagram dari teks sehingga lebih mudah diperbarui.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: membuat kode Mermaid untuk class diagram dan sequence diagram
- Prompt utama:
  1. Buatkan class diagram Mermaid untuk sistem Aset-Pinjam
  2. Buatkan sequence diagram pengajuan peminjaman dengan skenario bentrok
- Yang saya ubah atau tolak dari saran AI: menyesuaikan class diagram dengan
  struktur kode saya sendiri dan menghapus method yang tidak ada di kode saya
- Satu hal yang saya pahami lebih baik sekarang: cara membaca dan membuat UML
  yang konsisten dengan kode, bukan sketsa ideal