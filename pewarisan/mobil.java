package pewarisan;

public class mobil extends kendaraan {
    private int jumlahpintu;
    private String jenisBahanBakar;

    public mobil(final String merek, final String model, final int tahunProduksi, final int jumlahpintu, final String JenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahpintu = jumlahpintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }


    public void tampikanInfomobil(){
        super.tampilkanInfo();
        System.out.println("Jumlah pintu :" + jumlahpintu);
        System.out.println(" Jenis Bahan Bakar : " + jenisBahanBakar);
    }
}