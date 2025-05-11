# 📚 UTS Pemrograman Berorientasi Obyek 2

**Mata Kuliah:** Pemrograman Berorientasi Obyek 2  
**Dosen Pengampu:** Muhammad Ikhwan Fathulloh  

---

## 👤 Profil Mahasiswa

- **Nama:** Naswa Mutiara  
- **NIM:** 23552011185  
- **Studi Kasus:** Manajemen Tugas Mahasiswa UTB  

---

## 📌 Judul Studi Kasus

**Sistem Manajemen Tugas Mahasiswa Berbasis Web Menggunakan Spring Boot**

---

## 📝 Penjelasan Studi Kasus

Aplikasi ini bertujuan untuk membantu mahasiswa UTB dalam mengelola tugas-tugas perkuliahan mereka secara efisien. Dengan menggunakan antarmuka berbasis web dan teknologi Spring Boot, pengguna dapat:

- Mendaftarkan akun
- Masuk ke sistem (login)
- Keluar dari sistem (logout)
- Menambah, mengedit, menghapus tugas
- Menandai tugas sebagai selesai
- Melihat dan mengelompokkan tugas berdasarkan status penyelesaian (belum selesai atau sudah selesai)

Fitur utama:
- 🔐 Registrasi dan autentikasi pengguna
- 🔓 Logout sistem
- 📝 CRUD tugas (Create, Read, Update, Delete)
- ✅ Tandai tugas sebagai selesai
- 📂 Klasifikasi tugas berdasarkan status

---

## 🧠 Penerapan 4 Pilar OOP dalam Studi Kasus

### 1. 🧬 Inheritance (Pewarisan)
Inheritance digunakan untuk menghindari pengulangan kode dengan mewarisi atribut atau method umum. Misalnya, jika terdapat kelas `BaseEntity` yang menyimpan atribut umum seperti `id`, maka kelas `User` dan `ToDo` dapat mewarisinya.

### 2. 🔐 Encapsulation (Enkapsulasi)
Atribut pada entitas seperti `User` dan `ToDo` dibuat `private`, dan diakses melalui method `getter` dan `setter`. Ini menjaga data agar tidak dimodifikasi secara langsung dari luar kelas, menjaga integritas dan keamanan informasi.

### 3. 🔁 Polymorphism (Polimorfisme)
Spring Boot mendukung polimorfisme melalui controller dan service. Method dengan nama sama dapat berfungsi berbeda tergantung anotasi (seperti `@GetMapping`, `@PostMapping`), serta service dapat diimplementasikan secara berbeda dengan menggunakan interface.

### 4. 🧱 Abstraction (Abstraksi)
Dengan menggunakan interface seperti `JpaRepository`, abstraksi diterapkan untuk menyederhanakan logika data. Penggunaannya memungkinkan developer memanggil method bawaan tanpa harus menulis implementasi detail untuk query database.

---

## 🎥 Demo Proyek

- **GitHub:** [Masukkan link GitHub di sini]  
- **Drive/YouTube:** [Masukkan link video demo di sini]

---
