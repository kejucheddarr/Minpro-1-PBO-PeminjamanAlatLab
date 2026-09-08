# Minpro-1-PBO-PeminjamanAlatLab
## Deskripsi Singkat Program
PeminjamanAlatLab adalah program sistem sederhana berbasis Java untuk mengelola peminjaman alat pada laboratorium biologi. Program ini menyediakan fitur untuk menambah peminjaman, menampilkan riwayat peminjaman, dan mengembalikan alat melalui menunya.

## Penjelasan Alur Program
Saat program pertama kali di run, sistem akan memberikan output menu utama yang terdiri dari empat pilihan:
1. Tambah Peminjaman
2. Tampilkan Riwayat Peminjaman
3. Kembalikan Alat
4. Keluar
<br/>
<img width="1506" height="570" alt="image" src="https://github.com/user-attachments/assets/8674df6e-131f-4baa-804d-d084bc45f90d" />
<br/>
Saat petugas ingin meminjam alat, mereka pilih menu 1 dan mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data berhasil dimasukkan, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan”, dan akan balik ke manu awal. <br/>
<img width="800" height="538" alt="image" src="https://github.com/user-attachments/assets/03ab5eca-ef34-417d-adec-a339d0c970c4" /> <br/>
Jika petugas ingin melihat riwayat peminjamannya, mereka dapat melihatnya pada menu 2, yang akan menampilkan, ID peminjaman, nama petugas, nama alat, dan jumlah alat yang dipinjam. Status “Dipinjam” akan ditambahkan secara otomatis oleh sistem. Setelah itu program akan balik ke menu awal. <br/>
<img width="715" height="483" alt="image" src="https://github.com/user-attachments/assets/7ac95144-b963-40d5-b27f-70bd0b8238f4" /> <br/>
Kemudian setelah alat dikembalikan, petugas dapat memilih menu 3 dan memasukkan ID peminjamannya. Sistem akan menampilkan pesan “Alat berhasil dikembalikan” dan mencatat bahwa alat yang dipinjam telah dikembalikan, dan balik ke menu awal. <br/>
<img width="737" height="403" alt="image" src="https://github.com/user-attachments/assets/d758acbc-8bbd-47e8-babd-837e8e6ba2b8" /> <br/>
Status peminjaman alat dapat dilihat kembali melalui menu 2, dengan status yang telah diperbarui menjadi “Dikembalikan” setelah alat dikembalikan. <br/>
<img width="799" height="303" alt="image" src="https://github.com/user-attachments/assets/86a37492-d324-469b-bfed-0198a9e6fd55" /> <br/>
Petugas dapat keluar dari program saat memilih menu 4, dan pengulangan pada menu akan berhenti. <br/>
<img width="786" height="342" alt="image" src="https://github.com/user-attachments/assets/0758c4f7-55fe-453f-ba1b-e16ebbbdbc9c" />

## Penerapan nilai tambah
### Access Modifier
Penerapan access modifier private diterapkan pada atribut di class AlatLab, Peminjaman, dan PeminjamanService, untuk membatasi akses terhadap data. <br/>
<img width="425" height="157" alt="image" src="https://github.com/user-attachments/assets/036360b4-ad78-4555-9b9e-43ca01b8f59d" /> <br/>
<img width="421" height="127" alt="image" src="https://github.com/user-attachments/assets/301014bb-97ee-4200-9e40-f9fed3a786e8" /> <br/>
<img width="828" height="50" alt="image" src="https://github.com/user-attachments/assets/f7684553-5342-4924-a46d-42958d889417" /> <br/>
### Enkapsulasi (getter & setter)
Enkapsulasi diterapkan dengan menggunakan access modifier private pada atribut untuk membatasi akses langsung dari luar class. Data kemudian hanya dapat diakases melalui getter dan setter. <br/>
<img width="1111" height="543" alt="image" src="https://github.com/user-attachments/assets/c3520f2d-bb11-414c-9fe9-41644bbb8c5e" /> <br/>
<img width="859" height="551" alt="image" src="https://github.com/user-attachments/assets/a4db3d80-b42f-4fbc-abe8-9f700a6c2e27" /> <br/>
