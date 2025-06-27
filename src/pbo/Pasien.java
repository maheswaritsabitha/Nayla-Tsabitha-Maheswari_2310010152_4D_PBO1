package pbo;

public class Pasien {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String keluhan;
 
 public Pasien(String nama, int umur, String jeniskelamin){
     this.nama = nama;
     this.umur = umur;
     this.jenisKelamin = jenisKelamin;
 }
 
 public void setKeluhan(String keluhan){
      this.keluhan = keluhan;
 }
 public String getKeluhan(){
     return keluhan;
 }
 
 public String getInfo(){
     return "Nama: " + nama + ", Umur: " + umur + ", Jenis Kelamin: " + jenisKelamin + ", Keluhan: " + keluhan;
 }
 
 public String getSaran(){
     return "Silakan menunggu pemeriksaan.";
 }
}
