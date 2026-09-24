<div align="center">
  
# MINPRO 2 PBO

</div>

Nama : Otniel Putra Wardana

Nim : 2509116081

----

##  Deskripsi Singkat Program

Program ini merupakan Sistem Monitoring Kelayakan dan Perizinan Kendaraan Operasional yang dibuat untuk membantu perusahaan atau instansi dalam mengelola dan memantau kondisi serta perizinan kendaraan operasional. Program ini diperuntukkan bagi pihak yang bertanggung jawab terhadap kendaraan agar dapat mengetahui data kendaraan, kondisi kelayakannya, serta informasi perizinan yang dimiliki. Dengan adanya program ini, proses pengelolaan data kendaraan menjadi lebih terstruktur dan mudah dipantau, sehingga dapat membantu memastikan kendaraan yang digunakan berada dalam kondisi layak dan memiliki perizinan yang sesuai.

## Fitur Program

* Tambah Data Kendaraan Operasional
* Menampilkan Data Kendaraan
* Mengubah Kondisi Kelayakan Kendaraan
* Menghapus Data Kendaraan
* Menampilkan Status Kelayakan Kendaraan
* Tambah Data Perizinan Kendaraan
* Menampilkan Data Perizinan Kendaraan

## Alur dan Penjelasan Program

### 1. Class yang ada dan kegunaan masing-masing

Program ini memiliki 6 class utama yang memiliki fungsi masing-masing dalam sistem:
* Main.java -> Menjadi class utama yang menjalankan program, menampilkan menu, menerima input pengguna, dan mengatur alur program.
* Kendaraan.java -> Menjadi superclass yang menyimpan data dasar kendaraan seperti plat nomor, jenis, merk, tahun, dan kondisi.
* KendaraanLayak.java -> Subclass dari Kendaraan yang digunakan untuk kendaraan dengan kondisi layak.
* KendaraanTidakLayak.java -> Subclass dari Kendaraan yang digunakan untuk kendaraan dengan kondisi tidak layak.
* Monitoring.java -> Mengelola data kendaraan, seperti menambahkan, menampilkan, dan menghapus data kendaraan.
* Perizinan.java -> Mengelola informasi perizinan kendaraan seperti nomor izin, plat nomor, jenis izin, dan tanggal berlaku.

<img width="272" height="185" alt="image" src="https://github.com/user-attachments/assets/449172f0-3e8d-4a68-a7e2-5491b73d943b" />

### 2. Menu Utama Program

Jika pengguna menjalankan program ini, maka pengguna akan langsung masuk kedalam menu. Menu ini menjadi pusat navigasi bagi pengguna untuk mengakses berbagai fitur yang tersedia dalam sistem. Pada menu utama, pengguna akan diberikan beberapa pilihan berupa nomor yang dapat dipilih sesuai kebutuhan. Pengguna cukup memasukkan nomor pilihan, kemudian program akan menjalankan fitur yang dipilih. Setelah fitur selesai digunakan, pengguna dapat kembali ke menu utama untuk memilih fitur lainnya atau memilih opsi keluar untuk mengakhiri program.

<img width="323" height="203" alt="image" src="https://github.com/user-attachments/assets/baa3f5d0-2abc-45d0-abb0-8947148149ee" />

### 3. Menambahkan Kendaraan

Fitur Tambah Kendaraan digunakan untuk memasukkan data kendaraan operasional baru ke dalam sistem. Pengguna akan diminta mengisi beberapa informasi seperti plat nomor, jenis kendaraan, merk, tahun kendaraan, dan kondisi kendaraan. Setiap input akan divalidasi terlebih dahulu agar data yang dimasukkan sesuai dengan ketentuan. Setelah semua data valid, kendaraan akan disimpan ke dalam sistem dan dapat dilihat melalui fitur Tampilkan Kendaraan.

<img width="405" height="417" alt="image" src="https://github.com/user-attachments/assets/95b1d44c-c064-46b0-824d-ebb44381e098" />

### 4. Menampilkan Kendaraan 

Fitur Tampilkan Kendaraan digunakan untuk melihat seluruh data kendaraan yang telah tersimpan di dalam sistem. Pada fitur ini, pengguna dapat melihat informasi seperti plat nomor, jenis kendaraan, merk, tahun, dan kondisi kendaraan. Sistem juga menampilkan keterangan mengenai status kendaraan, apakah kendaraan tersebut layak digunakan atau tidak layak dan perlu diperiksa.

<img width="306" height="540" alt="image" src="https://github.com/user-attachments/assets/9f879102-a887-4fcd-b797-433b1e3ae75d" />

### 5. Memperbarui Kondisi Kendaraan

Fitur Update Kondisi digunakan untuk mengubah kondisi atau status kelayakan kendaraan yang sudah tersimpan di dalam sistem. Pengguna memasukkan plat nomor kendaraan yang ingin diperbarui, kemudian memilih kondisi baru, yaitu “Layak” atau “Tidak Layak”. Setelah proses berhasil, data kendaraan akan diperbarui sesuai dengan kondisi yang dipilih.

<img width="427" height="857" alt="image" src="https://github.com/user-attachments/assets/211079f2-ff83-44dc-9230-21fc75d1c24b" />

### 6. Menghapus Kendaraan 

Fitur Hapus Kendaraan digunakan untuk menghapus data kendaraan yang sudah tersimpan di dalam sistem. Pengguna cukup memasukkan nomor plat kendaraan yang ingin dihapus, kemudian sistem akan mencari data tersebut. Jika kendaraan ditemukan, data akan dihapus dari sistem dan pengguna akan mendapatkan pemberitahuan bahwa data berhasil dihapus.

<img width="396" height="645" alt="image" src="https://github.com/user-attachments/assets/e228cd11-b45e-458c-b667-7ba8bee5da3d" />

### 7. Tambah Perizinan

Fitur Tambah Perizinan digunakan untuk memasukkan data izin kendaraan ke dalam sistem. Pengguna akan mengisi informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Setelah data yang dimasukkan valid, sistem akan menyimpan data perizinan sehingga dapat digunakan dan ditampilkan kembali melalui fitur Tampilkan Perizinan.

<img width="342" height="332" alt="image" src="https://github.com/user-attachments/assets/7e7fd00b-edab-44ea-a57f-97b125c693a3" />

### 8. Tampilkan Perizinan

Fitur Tampilkan Perizinan digunakan untuk melihat seluruh data perizinan kendaraan yang telah tersimpan di dalam sistem. Pengguna dapat melihat informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Fitur ini membantu pengguna mengetahui informasi perizinan kendaraan secara lebih mudah dan terorganisir.

<img width="345" height="441" alt="image" src="https://github.com/user-attachments/assets/03d8a706-354f-4f72-a534-75dfc8e33cd0" />

### 9. Menyelesaikan Program

Fitur Keluar digunakan untuk mengakhiri program. Ketika pengguna memilih menu ini, sistem akan menghentikan proses program dan pengguna akan keluar dari sistem.

<img width="308" height="247" alt="image" src="https://github.com/user-attachments/assets/1aa4ff96-e526-4587-ba4e-1518128fb1a0" />
