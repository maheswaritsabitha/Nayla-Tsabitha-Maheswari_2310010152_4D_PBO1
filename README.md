# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pemesanan tiket wisata air menggunakan bahasa pemrograman Java, sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input data pelanggan lokal maupun turis asing yang ingin memesan tiket wisata air.Setiap data pelanggan terdiri dari nama, jenis tiket, dan jumlah tiket.Untuk turis asing, ada tambahan atribut berupa negara asal.
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pelanggan`, `TurisAsing `, dan `Main` adalah contoh dari class.

```bash
public class Pelanggan {
    ...
}

public class TurisAsing extends Pelanggan  {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Pelanggan[] daftarPelanggan = new Pelanggan[5];` adalah contoh pembuatan object.

```bash
Pelanggan[] daftarPelanggan = new Pelanggan[5];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `jenisTiket`, dan `jumlahTiket` adalah contoh atribut.

```bash
 private String nama;
 private String jenisTiket;
 private int jumlahTiket;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pelanggan` dan `TurisAsing`.

```bash
 public Pelanggan(String nama, String jenisTiket, int jumlahTiket) {
        this.nama = nama;
        this.jenisTiket = jenisTiket;
        this.jumlahTiket = jumlahTiket;
    }

 public TurisAsing(String nama, String jenisTiket, int jumlahTiket, String negara) {
        super(nama, jenisTiket, jumlahTiket);
        this.negara = negara;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setJenisTiket`, dan `setJumlahTiket` adalah contoh method mutator.

```bash
 public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenisTiket`, dan `getJumlahTiket` adalah contoh method accessor.

```bash
  public String getNama() {
        return nama;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `jenisTiket`, dan `jumlahTiket` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String jenisTiket;
private int jumlahTiket;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TurisAsing` mewarisi `Pelanggan` dengan sintaks `extends`.

```bash
public class TurisAsing extends Pelanggan  {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, polymorphism terjadi dalam bentuk overriding, yaitu method displayInfo() yang didefinisikan di class TurisAsing menggantikan implementasi method displayInfo() dari class induk Pelanggan.

```bash
public String displayInfo() {
        return "\n== Info Pelanggan ==\n"
                + "Nama           : " + nama + "\n"
                + "Jenis Tiket    : " + jenisTiket + "\n"
                + "Jumlah Tiket   : " + jumlahTiket;
    }

 @Override
    public String displayInfo() {
        return "\n== Info Pelanggan Turis Asing ==\n"
                + "Nama           : " + getNama() + "\n"
                + "Jenis Tiket    : " + getJenisTiket() + "\n"
                + "Jumlah Tiket   : " + getJumlahTiket() + "\n"
                + "Negara         : " + negara + "\n"
                + "Status         : Turis Asing";
    }
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, Pada digunakan seleksi switch-case untuk menampilkan menu pemilihan aksi sesuai input user.
Switch-case ini membantu memilih aksi sesuai angka yang diinputkan user..

```bash
    switch (pilih) {
        case 1:
           System.out.print("Nama            : ");
           String nama = input.nextLine();
           System.out.print("Jenis Tiket     : ");
           String jenis = input.nextLine();
           System.out.print("Jumlah Tiket    : ");
           int jumlah = input.nextInt();
           input.nextLine();

           daftarPelanggan[jumlahData] = new Pelanggan(nama, jenis, jumlah);
           jumlahData++;
           System.out.println("Data pelanggan lokal berhasil ditambahkan.");
           break;

        case 2:
           System.out.print("Nama            : ");
           String namaA = input.nextLine();
           System.out.print("Jenis Tiket     : ");
           String jenisA = input.nextLine();
           System.out.print("Jumlah Tiket    : ");
           int jumlahA = input.nextInt();
           input.nextLine();
           System.out.print("Negara Asal     : ");
           String negara = input.nextLine();

           daftarPelanggan[jumlahData] = new TurisAsing(namaA, jenisA, jumlahA, negara);
           jumlahData++;
           System.out.println("Data turis asing berhasil ditambahkan.");
           break;
```

11. **Perulangan** Perulangan digunakan untuk menjalankan blok kode secara berulang, biasanya untuk memproses data dalam jumlah banyak atau menampilkan data.
Pada program ini, perulangan digunakan untuk menampilkan seluruh data pelanggan yang telah disimpan ke dalam array daftarPelanggan.
```bash
for (int i = 0; i < jumlahData; i++) {
    System.out.println(daftarPelanggan[i].displayInfo());
    System.out.println("-----------------------------------");
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan Class Scanner untuk menerima input dari pengguna. Method System.out.println dan System.out.print untuk menampilkan teks ke layar.

```bash
Scanner scanner = new Scanner(System.in);
System.out.println("\n== Menu Pemesanan Tiket Wisata Air ==");
System.out.println("1. Tambah Pelanggan Lokal");
System.out.println("2. Tambah Turis Asing");
System.out.println("3. Tampilkan Semua Pelanggan");
System.out.println("4. Keluar");
System.out.print("Pilih menu (1-4) : ");
int pilih = input.nextInt();
input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Pelanggan[] daftarPelanggan = new Pelanggan[5];` adalah contoh penggunaan array.

```bash
Pelanggan[] daftarPelanggan = new Pelanggan[5];
int jumlahData = 0;
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
  try {
     if (jumlahData >= daftarPelanggan.length) {
        throw new Exception("Kapasitas array penuh. Tidak bisa nambah data lagi.");
     }
  } catch (Exception e) {
      System.out.println(e.getMessage());
      ulang = false;
  }
}

  input.close();
   }
}
```

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
