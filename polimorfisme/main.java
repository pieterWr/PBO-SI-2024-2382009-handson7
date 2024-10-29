package polimorfisme;

public class main {
    public static void main(String[] args) {
        bangundatar bangunDatar;

        // Menghitung luas dan keliling Persegi
        bangunDatar = new persegi(4);
        System.out.println("Luas Persegi : " + bangunDatar.luas());
        System.out.println("Keliling Persegi : " + bangunDatar.keliling());

        // Menghitung luas dan keliling Segitiga Sama Sisi
        bangunDatar = new SegitigaSamaSisi(6);
        System.out.println("Luas Segitiga Sama Sisi : " + bangunDatar.luas());
        System.out.println("Keliling Segitiga Sama Sisi : " + bangunDatar.keliling());


        // Menghitung luas dan keliling lingkaran
        bangundatar bangundatar = new lingkaran(5);
        System.out.println("LINGKARAN: ");
        System.out.println("Luas Lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran: " + bangunDatar.keliling());
    }
}