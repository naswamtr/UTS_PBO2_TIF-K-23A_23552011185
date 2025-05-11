# 📚 UTS Pemrograman Berorientasi Obyek 2

**Mata Kuliah:** Pemrograman Berorientasi Obyek 2  
**Dosen Pengampu:** Muhammad Ikhwan Fathulloh  

## 👤 Profil Mahasiswa

- **Nama:** Naswa Mutiara  
- **NIM:** 23552011185  
- **Studi Kasus:** Manajemen Tugas Mahasiswa UTB  

## 📌 Judul Studi Kasus

**Sistem Manajemen Tugas Mahasiswa Berbasis Web Menggunakan Spring Boot**

## 📝 Penjelasan Studi Kasus

Aplikasi ini dirancang untuk membantu mahasiswa UTB dalam mengelola dan memantau tugas-tugas kuliah mereka.  
Fitur utamanya meliputi:

- Login pengguna
- Pembuatan tugas
- Pembaruan status tugas
- Penghapusan tugas
- Melihat daftar tugas berdasarkan status (belum selesai atau selesai)

## 🧠 Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. 🧬 Inheritance
Digunakan dalam pemisahan logika melalui pewarisan kelas. Misalnya, kelas `BaseEntity` (jika digunakan) dapat diwarisi oleh `User` atau `ToDo` untuk menyertakan atribut umum seperti ID atau timestamps.

### 2. 🔐 Encapsulation
Setiap entitas seperti `User` dan `ToDo` memiliki atribut `private` dengan `getter` dan `setter`. Ini menjaga akses data agar tetap aman dan terkontrol.

### 3. 🔁 Polymorphism
Dalam penggunaan interface atau method override, seperti di controller saat method dengan nama sama menangani berbagai HTTP request (GET, POST, DELETE), atau saat service diimplementasikan dengan strategi yang berbeda.

### 4. 🧱 Abstract
Penggunaan interface seperti `CrudRepository` dari Spring Data merupakan bentuk abstraksi. Ini memungkinkan penggunaan metode CRUD tanpa harus menuliskannya secara eksplisit.

## 🎥 Demo Proyek

- **GitHub:** 
- **Drive:**
