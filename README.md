# 📘 Tugas PBO - Enkapsulasi di Java

## 👤 Identitas
- **Nama:** Aisyah  
- **NIM:** 2400792  
- **Mata Kuliah:** Pemrograman Berbasis Objek (PBO)  
- **Materi:** Enkapsulasi di Java  

---

## 📌 Deskripsi Program
Program ini dibuat untuk menyelesaikan sistem persamaan linear dua variabel menggunakan konsep **enkapsulasi** dalam Java. Program terdiri dari dua class utama, yaitu:

- **LinearEquation.java** → berisi atribut dan method untuk proses perhitungan  
- **TestLinearEquation.java** → berisi program utama untuk menerima input dan menampilkan output  

Konsep enkapsulasi diterapkan dengan membuat atribut bersifat **private** dan mengaksesnya melalui method **public (getter dan setter)**.

---

## ⚙️ Cara Kerja Program

### 🔹 Input
Pengguna diminta memasukkan 6 nilai:
- `a`, `b`, `c`, `d` → koefisien persamaan  
- `e`, `f` → konstanta  

Bentuk persamaan:
```
ax + by = e
cx + dy = f
```

---

### 🔹 Proses
1. Program membuat objek dari class `LinearEquation`  
2. Nilai input dimasukkan ke dalam atribut melalui method setter  
3. Program mengecek apakah persamaan memiliki solusi dengan rumus:
```
ad - bc ≠ 0
```
4. Jika memiliki solusi:
```
x = (ed - bf) / (ad - bc)
y = (af - ec) / (ad - bc)
```
5. Jika tidak:
```
Persamaan tidak memiliki solusi
```

---

### 🔹 Output
Program akan menampilkan:
- Nilai `x` dan `y` jika solusi ada  
- Atau pesan:
```
Persamaan tidak memiliki solusi
```

---

## 🧱 Struktur Program
```
📂 Project
 ├── LinearEquation.java
 └── TestLinearEquation.java
```

---

## ▶️ Cara Menjalankan
1. Buka NetBeans atau IDE Java lainnya  
2. Buat project baru  
3. Tambahkan dua file:
   - `LinearEquation.java`
   - `TestLinearEquation.java`  
4. Jalankan file `TestLinearEquation.java`  
5. Masukkan nilai sesuai instruksi  

---

## 💡 Konsep yang Digunakan
- Enkapsulasi (Encapsulation)  
- Class dan Object  
- Method (Getter & Setter)  
- Constructor  
- Percabangan (if-else)  
- Input menggunakan Scanner  

---

## 🎥 Link Video Penjelasan
(https://drive.google.com/drive/folders/1o8y7IJx9wyyrqRBRG7hJzFj2n9HW80_L?usp=sharing)
