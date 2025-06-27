package pbo;

public class PasienGigi extends Pasien {
    public PasienGigi(String nama, int umur, String jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }
    
    @Override
    public String getSaran() {
        if (getKeluhan().toLowerCase().contains("Sakit gigi")) {
            return "Pasien perlu dicabut giginya atau ditambal.";
        } else if (getKeluhan().toLowerCase().contains("Karang gigi")) {
            return "Pasien disarankan scaling karang gigi.";
        } else {
            return "Silahkan Konsultasi lebih lanjut dengan dokter gigi.";
        }
    }
    
}
