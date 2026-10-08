<div align="center">
  
# MINPRO 2 PBO

</div>

Nama : Otniel Putra Wardana

Nim : 2509116081

----

##  Deskripsi Singkat Program

Program ini merupakan Sistem Monitoring Kelayakan dan Perizinan Kendaraan Operasional yang dibuat untuk membantu perusahaan atau instansi dalam mengelola dan memantau kondisi serta perizinan kendaraan operasional. Program ini diperuntukkan bagi pihak yang bertanggung jawab terhadap kendaraan agar dapat mengetahui data kendaraan, kondisi kelayakannya, serta informasi perizinan yang dimiliki. Dengan adanya program ini, proses pengelolaan data kendaraan menjadi lebih terstruktur dan mudah dipantau, sehingga dapat membantu memastikan kendaraan yang digunakan berada dalam kondisi layak dan memiliki perizinan yang sesuai.

----

## Fitur Program

* Tambah Data Kendaraan Operasional
* Menampilkan Data Kendaraan
* Mengubah Kondisi Kelayakan Kendaraan
* Menghapus Data Kendaraan
* Menampilkan Status Kelayakan Kendaraan
* Tambah Data Perizinan Kendaraan
* Menampilkan Data Perizinan Kendaraan

----



## Alur Program

### 1. Menu Utama Program

Jika pengguna menjalankan program ini, maka pengguna akan langsung masuk kedalam menu. Menu ini menjadi pusat navigasi bagi pengguna untuk mengakses berbagai fitur yang tersedia dalam sistem. Pada menu utama, pengguna akan diberikan beberapa pilihan berupa nomor yang dapat dipilih sesuai kebutuhan. Pengguna cukup memasukkan nomor pilihan, kemudian program akan menjalankan fitur yang dipilih. Setelah fitur selesai digunakan, pengguna dapat kembali ke menu utama untuk memilih fitur lainnya atau memilih opsi keluar untuk mengakhiri program.

<img width="632" height="545" alt="image" src="https://github.com/user-attachments/assets/598edfbd-b3e6-4984-8296-80b854b7c811" />

### 2. Menambahkan Kendaraan

Fitur Tambah Kendaraan digunakan untuk memasukkan data kendaraan operasional baru ke dalam sistem. Pengguna akan diminta mengisi beberapa informasi seperti plat nomor, jenis kendaraan, merk, tahun kendaraan, dan kondisi kendaraan. Setiap input akan divalidasi terlebih dahulu agar data yang dimasukkan sesuai dengan ketentuan. Setelah semua data valid, kendaraan akan disimpan ke dalam sistem dan dapat dilihat melalui fitur Tampilkan Kendaraan.

<img width="617" height="427" alt="image" src="https://github.com/user-attachments/assets/16838bdb-8c33-47ca-bd43-c41bf85bcffc" />

### 3. Menampilkan Kendaraan 

Fitur Tampilkan Kendaraan digunakan untuk melihat seluruh data kendaraan yang telah tersimpan di dalam sistem. Pada fitur ini, pengguna dapat melihat informasi seperti plat nomor, jenis kendaraan, merk, tahun, dan kondisi kendaraan. Sistem juga menampilkan keterangan mengenai status kendaraan, apakah kendaraan tersebut layak digunakan atau tidak layak dan perlu diperiksa.

<img width="392" height="541" alt="image" src="https://github.com/user-attachments/assets/409f3c2f-4679-4724-9ae2-1bba32ae6f24" />

### 4. Memperbarui Kondisi Kendaraan

Fitur Update Kondisi digunakan untuk mengubah kondisi atau status kelayakan kendaraan yang sudah tersimpan di dalam sistem. Pengguna memasukkan plat nomor kendaraan yang ingin diperbarui, kemudian memilih kondisi baru, yaitu “Layak” atau “Tidak Layak”. Setelah proses berhasil, data kendaraan akan diperbarui sesuai dengan kondisi yang dipilih.

<img width="276" height="705" alt="image" src="https://github.com/user-attachments/assets/6d6776ce-2c36-43b7-88c6-e6bf7c1bb0f7" />

### 5. Menghapus Kendaraan 

Fitur Hapus Kendaraan digunakan untuk menghapus data kendaraan yang sudah tersimpan di dalam sistem. Pengguna cukup memasukkan nomor plat kendaraan yang ingin dihapus, kemudian sistem akan mencari data tersebut. Jika kendaraan ditemukan, data akan dihapus dari sistem dan pengguna akan mendapatkan pemberitahuan bahwa data berhasil dihapus.

<img width="270" height="532" alt="image" src="https://github.com/user-attachments/assets/9b356021-b932-4770-8881-cb15c04539bb" />

### 6. Tambah Perizinan

Fitur Tambah Perizinan digunakan untuk memasukkan data izin kendaraan ke dalam sistem. Pengguna akan mengisi informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Setelah data yang dimasukkan valid, sistem akan menyimpan data perizinan sehingga dapat digunakan dan ditampilkan kembali melalui fitur Tampilkan Perizinan.

<img width="517" height="630" alt="image" src="https://github.com/user-attachments/assets/a22b6baf-0b02-4b35-a2a4-94d56436caf9" />

### 7. Tampilkan Perizinan

Fitur Tampilkan Perizinan digunakan untuk melihat seluruh data perizinan kendaraan yang telah tersimpan di dalam sistem. Pengguna dapat melihat informasi seperti nomor izin, nomor plat kendaraan, jenis izin, dan tanggal berlaku. Fitur ini membantu pengguna mengetahui informasi perizinan kendaraan secara lebih mudah dan terorganisir.

<img width="255" height="273" alt="image" src="https://github.com/user-attachments/assets/70b3041a-0c7c-4ffc-847b-007f46b412c6" />


### 8. Menyelesaikan Program

Fitur Keluar digunakan untuk mengakhiri program. Ketika pengguna memilih menu ini, sistem akan menghentikan proses program dan pengguna akan keluar dari sistem.

<img width="475" height="267" alt="image" src="https://github.com/user-attachments/assets/e10e7fe3-de28-472d-9d63-a3304defc8f3" />

## Encapsulation

Encapsulation adalah konsep dalam pemrograman berorientasi objek yang menggabungkan data dan fungsi dalam satu class serta membatasi akses langsung terhadap data tersebut. Tujuannya adalah menjaga keamanan dan keteraturan data sehingga perubahan atau penggunaan data dapat dikontrol melalui mekanisme yang telah ditentukan oleh class.

Kendaraan.java: Menerapkan encapsulation dengan membuat seluruh atribut kendaraan bersifat private, sehingga data tidak dapat diakses atau diubah secara langsung dari luar class. Untuk mengatur akses terhadap data tersebut, class menyediakan getter untuk mengambil nilai dan setter untuk mengubah nilai atribut tertentu. Dengan cara ini, data kendaraan dapat dikelola secara lebih terkontrol dan aman.
Perizinan.java: Menerapkan encapsulation dengan menyembunyikan atribut-atribut yang berkaitan dengan perizinan menggunakan access modifier private. Data tersebut tidak dapat diakses secara langsung dari class lain, sehingga digunakan getter untuk mengambil data dan setter untuk mengubah data yang diperlukan. Hal ini membuat pengelolaan informasi perizinan menjadi lebih terstruktur.
Monitoring.java: Menerapkan encapsulation dengan membuat daftarKendaraan menggunakan access modifier private, sehingga daftar kendaraan tidak dapat diakses secara langsung dari luar class. Class ini menyediakan method getDaftarKendaraan() sebagai akses untuk mengambil daftar kendaraan dari class lain. Dengan demikian, pengelolaan data kendaraan tetap berada di dalam class Monitoring dan akses terhadapnya dapat dikontrol.

## Inheritance

Inheritance adalah konsep dalam pemrograman berorientasi objek yang memungkinkan sebuah class mewarisi atribut dan method dari class lain. Class yang mewarisi disebut subclass, sedangkan class yang diwarisi disebut superclass.

- Memungkinkan penggunaan kembali atribut dan method dari superclass.
- Mengurangi penulisan kode yang sama.
- Membuat hubungan hierarki antar-class.
- Memudahkan pengembangan dan pengelolaan program.
