package pbo;

import java.util.Scanner;
public class MainKlinik {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       Pasien[] daftarPasien = new Pasien[10]; //array menyimpan 10 pasien
       int jumlah = 0;
       
       try {
           while (jumlah < daftarPasien.length){
               System.out.println("\n==============================");
               System.out.println("==  Input Data Pasien Klinik  ==");
               System.out.println("================================");
               
               System.out.print("Jenis layanan (umum/gigi): ");
               String layanan = input.nextLine().toLowerCase();
               
               System.out.print("Nama pasien: ");
               String nama = input.nextLine();
               
               System.out.print("Umur pasien: ");
               int umur = Integer.parseInt(input.nextLine());
               
               System.out.print("Jenis kelamin (L/P): ");
               String jk = input.nextLine();
               
               Pasien p;
               
               if (layanan.equals("umum")){
                   p = new PasienUmum(nama, umur, jk);
               } else if (layanan.equals("gigi")){
                   p = new PasienGigi(nama, umur, jk);
               } else {
                   System.out.println("Jenis layanan tidak valid.");
                   continue;
               }
               
               System.out.println("Keluhan pasien: ");
               p.setKeluhan(input.nextLine());
               
               daftarPasien[jumlah] = p;
               jumlah++;
               
               System.out.println("Input pasien lagi? (y/t): ");
               if (!input.nextLine().equalsIgnoreCase("y")) break;
           }
           
           // Menampilkan daftar pasien
           System.out.println("\n==============================");
           System.out.println("==    DAFTAR PASIEN KLINIK    ==");
           System.out.println("================================");
           for (int i = 0; i < jumlah; i++) {
               System.out.println(daftarPasien[i].getInfo());
               System.out.println("Saran Tindakan: " + daftarPasien[i].getSaran());
               System.out.println("----------------------------------------");
           }
           
       } catch (Exception e) {
           System.out.println("Terjadi kesalahan input: " + e.getMessage());
       }
    }
}
