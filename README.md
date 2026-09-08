# Minpro-1-PBO-PeminjamanAlatLab
## Deskripsi Singkat Program
PeminjamanAlatLab adalah program sistem sederhana berbasis javascript untuk mengelola peminjaman alat pada laboratorium biologi. Program ini menyediakan fitur untuk menambah peminjaman, menampilkan riwayat peminjaman, dan mengembalikan alat melalui menunya.

## Penjelasan Alur Program
Saat file pertama kali di run, sistem akan memberikan output menu utama yang terdiri dari empat pilihan:
1. Tambah Peminjaman
2. Tampilkan Riwayat Peminjaman
3. Kembalikan Alat
4. Keluar
<br/>
<img width="1506" height="570" alt="image" src="https://github.com/user-attachments/assets/8674df6e-131f-4baa-804d-d084bc45f90d" />
<br/>
Saat petugas ingin meminjam alat, mereka pilih menu 1 dan mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data berhasil dimasukkan, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan.”
<img width="734" height="360" alt="image" src="https://github.com/user-attachments/assets/c9953f6b-f23c-4074-bad7-1d9de6a4eae2" />
<br/>
Jika petugas ingin melihat riwayat peminjamannya, mereka dapat melihatnya pada menu 2, yang akan menampilkan, ID peminjaman, nama petugas, nama alat, dan jumlah alat yang dipinjam. Status “Dipinjam” akan ditambahkan secara otomatis oleh sistem.
<img width="757" height="323" alt="image" src="https://github.com/user-attachments/assets/c422ce65-f889-4856-9811-914f7f421f09" />
<br/>


Kemudian setelah alat dikembalikan, petugas dapat memilih menu 3 dan memasukkan ID peminjamannya. Sistem akan menampilkan pesan “Alat berhasil dikembalikan” dan mencatat bahwa alat yang dipinjam telah dikembalikan.
<br/>
<img width="831" height="223" alt="image" src="https://github.com/user-attachments/assets/39e714ae-61b9-43c7-8ce8-500a2d5840ac" />
<br/>
Status peminjaman alat dapat dilihat kembali melalui menu 2, dengan status yang telah diperbarui menjadi “Dikembalikan” setelah alat dikembalikan.


<img width="799" height="303" alt="image" src="https://github.com/user-attachments/assets/86a37492-d324-469b-bfed-0198a9e6fd55" />
<br/>
Petugas dapat keluar dari program saat memilih menu 4.
<img width="848" height="337" alt="image" src="https://github.com/user-attachments/assets/84a3842e-41d5-4919-ba9d-a7cd9ba43c59" />

## Penerapan nilai tambah
### Access Modifier
Penerapan access modifier private diterapkan pada atribut di class AlatLab, Peminjaman, dan PeminjamanService, untuk membatasi akses terhadap data.
<img width="425" height="157" alt="image" src="https://github.com/user-attachments/assets/036360b4-ad78-4555-9b9e-43ca01b8f59d" />
<img width="421" height="127" alt="image" src="https://github.com/user-attachments/assets/301014bb-97ee-4200-9e40-f9fed3a786e8" />
<img width="828" height="50" alt="image" src="https://github.com/user-attachments/assets/f7684553-5342-4924-a46d-42958d889417" />
### Enkapsulasi (getter & setter)
Enkapsulasi diterapkan dengan menggunakan access modifier private pada atribut untuk membatasi akses langsung dari luar class. Data kemudian hanya dapat diakases melalui getter dan setter.
<img width="1111" height="543" alt="image" src="https://github.com/user-attachments/assets/c3520f2d-bb11-414c-9fe9-41644bbb8c5e" />
<img width="859" height="551" alt="image" src="https://github.com/user-attachments/assets/a4db3d80-b42f-4fbc-abe8-9f700a6c2e27" />
