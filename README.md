# Minpro-1-PBO-PeminjamanAlatLab
## Deskripsi Singkat Program
PeminjamanAlatLab adalah program sistem sederhana berbasis Java untuk mengelola peminjaman alat pada laboratorium biologi. Program ini menyediakan fitur untuk menambah peminjaman, menampilkan riwayat peminjaman, dan mengembalikan alat melalui menunya.

## Penjelasan Alur Program
Saat program pertama kali di run, sistem akan memberikan output menu utama yang terdiri dari empat pilihan:
1. Tampilkan Alat
2. Tambah Peminjaman
3. Tampilkan Riwayat Peminjaman
4. Kembalikan Alat
5. Keluar
<br/>
<img width="1223" height="635" alt="image" src="https://github.com/user-attachments/assets/a1ef1d54-6cbb-4ce6-9745-2ebbeae066e2" /> <br/>
Petugas dapat melihat daftar alat yang tersedia di laboratorium melalui pilihan menu 1. Setelah daftar alat ditampilkan, program akan otomatis kembali ke menu utama. <br/>
<img width="858" height="706" alt="image" src="https://github.com/user-attachments/assets/c5e4e64a-5947-41ee-9257-8063bae996d4" /> <br/>
Saat petugas ingin meminjam alat, mereka pilih menu 2 dan mengisi detail-detail seperti ID peminjaman, nama petugas, nama alat, dan jumlah yang dipinjam. Setelah data berhasil dimasukkan, sistem akan menampilkan pesan “Peminjaman berhasil ditambahkan”, dan akan balik ke menu awal. <br/>
<img width="654" height="558" alt="image" src="https://github.com/user-attachments/assets/e3de66f3-c18b-4f89-bcc3-467de4548470" /> <br/>
Jika petugas ingin melihat riwayat peminjamannya, mereka dapat melihatnya pada menu 3, yang akan menampilkan, ID peminjaman, nama petugas, nama alat, dan jumlah alat yang dipinjam. Status “Dipinjam” akan ditambahkan secara otomatis oleh sistem. Setelah itu program akan balik ke menu awal. <br/>
<img width="705" height="516" alt="image" src="https://github.com/user-attachments/assets/08c60ac3-1d4d-43fa-a38b-bc984fb11414" /> <br/>
Setelah petugas telah mengembalikan alat yang mereka pinjam, mereka dapat memilih menu 4 dan memasukkan ID peminjaman untuk mencatat pengembalian. Sistem akan menampilkan pesan “Alat berhasil dikembalikan” dan mencatat bahwa alat yang dipinjam telah dikembalikan, dan balik ke menu awal. <br/>
<img width="757" height="451" alt="image" src="https://github.com/user-attachments/assets/a78fba55-7abd-43f9-9763-a492be97f185" /> <br/>
Habis melakukan pengembalian, status peminjaman alat dapat dilihat kembali melalui menu 3, dengan status yang otomatis diperbarui menjadi “Dikembalikan”. <br/>
<img width="741" height="517" alt="image" src="https://github.com/user-attachments/assets/a9e69f5e-26d6-4d53-b5ba-672aa72e1164" /> <br/>
Petugas dapat keluar dari program saat memilih menu 5, dan pengulangan pada menu akan berhenti. <br/>
<img width="760" height="356" alt="image" src="https://github.com/user-attachments/assets/c76dc3e1-75ea-495f-912b-5e4bb5bb280a" />

## Penerapan nilai tambah
### Access Modifier
Penerapan access modifier private diterapkan pada atribut di class AlatLab, Peminjaman, dan PeminjamanService, untuk membatasi akses terhadap data. <br/>
<img width="425" height="157" alt="image" src="https://github.com/user-attachments/assets/036360b4-ad78-4555-9b9e-43ca01b8f59d" /> <br/>
<img width="421" height="127" alt="image" src="https://github.com/user-attachments/assets/301014bb-97ee-4200-9e40-f9fed3a786e8" /> <br/>
<img width="828" height="50" alt="image" src="https://github.com/user-attachments/assets/f7684553-5342-4924-a46d-42958d889417" /> <br/>
### Enkapsulasi (getter & setter)
Enkapsulasi diterapkan dengan menggunakan access modifier private pada atribut untuk membatasi akses langsung dari luar class. Data kemudian hanya dapat diakases melalui getter dan setter. <br/>
<img width="726" height="383" alt="image" src="https://github.com/user-attachments/assets/7c366fbf-ea0a-40aa-a10d-98ec8b1c02ea" /> <br/>
<img width="859" height="551" alt="image" src="https://github.com/user-attachments/assets/a4db3d80-b42f-4fbc-abe8-9f700a6c2e27" /> <br/>
