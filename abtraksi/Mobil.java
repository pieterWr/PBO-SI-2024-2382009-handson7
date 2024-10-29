package abtraksi;

public class Mobil extends kendaraan{
    public Mobil(String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("Mobil bergerak");
    }
}