# Sistem Pendataan Pasien Klinik

Program ini dibuat menggunakan bahasa **Java** dan menerapkan prinsip **OOP (Object-Oriented Programming)**, seperti Class, Object, Constructor, Inheritance, Polymorphism, Encapsulation, Array, IO, Perulangan, Seleksi, hingga Error Handling.  
Program dijalankan di aplikasi **NetBeans**, dan menyimpan data pasien klinik umum dan gigi.

---

 1. **Class**
Class adalah template atau cetakan dari object.

Pada program ini, terdapat beberapa class:
- `Pasien.java` *(class induk)*
- `PasienUmum.java` *(turunan dari Pasien)*
- `PasienGigi.java` *(turunan dari Pasien)*
- `MainKlinik.java` *(class utama berisi logika input/output)*

Contoh:
```java
public class Pasien {
    ...
}
```

---

 2. **Object**
Object adalah instance nyata dari class.

Contoh object dibuat di `MainKlinik.java`:
```java
p = new PasienUmum(nama, umur, jk);
p = new PasienGigi(nama, umur, jk);
```

---

3. **Atribut**
Atribut adalah variabel yang ada di dalam class untuk menyimpan data.

Contoh (dari `Pasien.java`):
```java
private String nama;
private int umur;
private String jenisKelamin;
private String keluhan;
```

---

 4. **Constructor**
Constructor adalah method yang pertama kali dijalankan saat object dibuat.

Contoh:
```java
public Pasien(String nama, int umur, String jenisKelamin) {
    this.nama = nama;
    this.umur = umur;
    this.jenisKelamin = jenisKelamin;
}
```

---

 5. **Mutator (Setter)**
Method untuk mengubah nilai atribut (contoh pada keluhan):
```java
public void setKeluhan(String keluhan) {
    this.keluhan = keluhan;
}
```

---

 6. **Accessor (Getter)**
Method untuk mengambil nilai atribut:
```java
public String getInfo() {
    return "Nama: " + nama + ", Umur: " + umur + ", Jenis Kelamin: " + jenisKelamin + ", Keluhan: " + keluhan;
}
```

---

 7. **Encapsulation**
Encapsulation berarti atribut disembunyikan (`private`) dan hanya bisa diakses lewat setter/getter.

```// Contoh di class Pasien
private String nama;
private int umur;
private String jenisKelamin;
private String keluhan;

public String getNama() {
    return nama;
}

public void setKeluhan(String keluhan) {
    this.keluhan = keluhan;
}

---

 8. **Inheritance**
`PasienUmum` dan `PasienGigi` **mewarisi class** `Pasien` dengan `extends`.
 ```java
public class PasienUmum extends Pasien {
    ...
}

---

 9. **Polymorphism**
Menggunakan method yang sama tapi hasil berbeda tergantung class-nya (`getSaran()` di-overriding):
```java
@Override
public String getSaran() {
    return "Pasien umum disarankan untuk istirahat dan minum obat.";
}
```

---

 10. **Seleksi**
Pemilihan berdasarkan input pengguna:
```java
if (layanan.equals("umum")) {
    ...
} else if (layanan.equals("gigi")) {
    ...
}
```

---

 11. **Perulangan**
Pengulangan input data pasien:
```java
while (jumlah < daftarPasien.length) {
    ...
}
```

---

 12. **IO Sederhana**
Input/output data dari console:
```java
Scanner input = new Scanner(System.in);
System.out.println("Nama pasien: ");
```

---

 13. **Array**
Menyimpan banyak object pasien dalam array:
```java
Pasien[] daftarPasien = new Pasien[10];
```

---

 14. **Error Handling**
Penanganan error saat input salah:
```java
try {
    ...
} catch (Exception e) {
    System.out.println("Terjadi kesalahan input: " + e.getMessage());
}
```

---

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nayla Tsabitha Maheswari
NPM: 2310010152
