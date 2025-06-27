package pbo;

public class PasienUmum extends Pasien {
    public PasienUmum(String nama, int umur, String jenisKelamin) {
        super(nama, umur, jenisKelamin); // memanggil konstruktor dari superclass Pasien
    }

    @Override
    public String getSaran() {
        if (getKeluhan().toLowerCase().contains("demam")) {
            return "Beri obat penurun panas dan istirahat.";
        } else if (getKeluhan().toLowerCase().contains("batuk")) {
            return "Berikan sirup batuk dan masker.";
        } else {
            return "Lakukan pemeriksaan dokter umum.";
        }
    }
}
