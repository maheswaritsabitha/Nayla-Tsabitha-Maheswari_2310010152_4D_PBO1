package pbo1;

//inheritance
public class TurisAsing extends Pelanggan {
    //atribut tambahan
    private String negara;
    
    //constructor
    public TurisAsing(String nama, String jenisTiket, int jumlahTiket, String negara) {
        super(nama, jenisTiket, jumlahTiket);
        this.negara = negara;
    }
    
    //accessor (getter)
    public String getNegara() {
        return negara;
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return "=== Ingo Pelanggan Turis Asing ===\n"
                +"Nama              : " + getNama() + "\n"
                +"Jenis Tiket       : " + getJenisTiket() + "\n"
                +"Jumlah Tiket      : " + getJumlahTiket()+ "\n"
                +"Negara             : " + negara + "\n"
                +"Status              : Turis Asing";
    }
}
