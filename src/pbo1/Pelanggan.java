package pbo1;

//class
public class Pelanggan {
    //atribut + encapsulation
    private String nama;
    private String jenisTiket;
    private int jumlahTiket;
    
    //constructor
    public Pelanggan(String nama, String jenisTiket, int jumlahTiket) {
        this.nama = nama;
        this.jenisTiket = jenisTiket;
        this.jumlahTiket = jumlahTiket;
    }
    
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }
    
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }
    
    //polymorphism (overriding)
    public String displayInfo(){
        return "=== Info Pelanggan ===\n"
                +"Nama              : " + nama + "\n"
                +"Jenis Tiket       : " + jenisTiket + "\n"
                +"Jumlah Tiket      : " + jumlahTiket;
    }
}
