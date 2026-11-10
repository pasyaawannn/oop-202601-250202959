# Prinsip SOLID di Kode AsetPinjam

## SRP - Single Responsibility Principle

**Kelas: `KatalogAset`**
KatalogAset hanya bertanggung jawab menyimpan dan mencari aset di memori. Ia tidak menghitung denda, tidak memvalidasi peminjaman, dan tidak mengurus jadwal. Setiap perubahan pada cara penyimpanan atau pencarian aset hanya memengaruhi class ini, bukan class lain. Ini membuktikan SRP karena hanya ada satu alasan class ini berubah.

## OCP - Open/Closed Principle

**Kelas: `DendaFlat` dan `DendaProgresif` yang mengimplementasikan `AturanDenda`** Ketika aturan denda baru dibutuhkan, cukup membuat class baru yang mengimplementasikan interface AturanDenda tanpa mengubah class yang sudah ada. Kode pemakai tidak perlu diubah sama sekali karena bergantung pada kontrak AturanDenda, bukan implementasi konkret. Ini membuktikan OCP: terbuka untuk ekstensi, tertutup untuk modifikasi.

## LSP - Liskov Substitution Principle

**Kelas: `Ruang`, `Laptop`, `AlatLab` sebagai subclass `Aset`** Ketiga subclass dapat dipakai di mana pun Aset diharapkan tanpa mengejutkan pemanggilnya. Semua memenuhi kontrak Aset: menolak hari negatif pada hitungDenda, mengembalikan nama dan kode valid, serta bisaDipinjam bekerja sesuai aturan yang sama. Tidak ada subclass yang melempar UnsupportedOperationException untuk method induk.