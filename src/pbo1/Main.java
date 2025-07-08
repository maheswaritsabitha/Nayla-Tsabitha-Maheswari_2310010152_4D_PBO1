package pbo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        //object
        Scanner input = new Scanner(System.in);
        
        //array
        Pelanggan[] daftarPelanggan = new Pelanggan[5];
        int jumlahData = 0;
        
        boolean ulang = true;
        while (ulang) {
            
            //IO sederhana
            System.out.println("\n=== Menu Pemesanan Tiket Wisata Air ===");
            System.out.println("1. Tambah Pelanggan Lokal");
            System.out.println("2. Tambah Turis Asing");
            System.out.println("3. Tampilkan Semua Pelanggan");
            System.out.println("4. Keluar");
            System.out.println("Pilih menu (1-4): ");
            int pilih = input.nextInt();
            input.nextLine();
            
            //seleksi (switch)
            switch (pilih) {
                case 1:
                    System.out.print("Nama             :");
                    String nama = input.nextLine();
                    System.out.print("Jenis Tiket      :");
                    String jenis = input.nextLine();
                    System.out.print("Jumlah Tiket      :");
                    int jumlah = input.nextInt();
                    input.nextLine();
                    
                    daftarPelanggan[jumlahData] = new Pelanggan(nama, jenis, jumlah);
                    jumlahData++;
                    System.out.println("Data pelanggan lokal berhasil ditambahkan.");
                    break;
                
                case 2:
                    System.out.print("Nama             :");
                    String namaA = input.nextLine();
                    System.out.print("Jenis Tiket      :");
                    String jenisA = input.nextLine();
                    System.out.print("Jumlah Tiket      :");
                    int jumlahA = input.nextInt();
                    input.nextLine();
                    System.out.print("Negara Asal      :");
                    String negara = input.nextLine();
                    
                    daftarPelanggan[jumlahData] = new TurisAsing(namaA, jenisA, jumlahA, negara);
                    jumlahData++;
                    System.out.println("Data turis asing berhasil ditambahkan.");
                    break;
                    
                case 3:
                    //perulangan
                    System.out.println("\n=== Daftar Pelanggan ===");
                    for (int i = 0; i < jumlahData; i++) {
                        
                        System.out.println(daftarPelanggan[i].displayInfo());
                        System.out.println("--------------------------------");
                    }
                    break;
                   
                case 4:
                    ulang = false;
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            
            //erorr handling
            try {
                if (jumlahData >= daftarPelanggan.length){
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
